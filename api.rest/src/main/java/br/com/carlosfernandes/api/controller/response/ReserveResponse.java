package br.com.carlosfernandes.api.controller.response;

import br.com.carlosfernandes.core.domain.Reserve;
import org.bson.types.ObjectId;

import java.util.Date;

public class ReserveResponse {

    private Date start;
    private Date end;

    private ObjectId userId; //Proprietário
    private ObjectId bedroomId; //Quarto

    public ReserveResponse fromReserve(Reserve reserve) {
        this.start = reserve.getStart();
        this.end = reserve.getEnd();
        this.userId = reserve.getUserId();
        this.bedroomId = reserve.getBedroomId();

        return this;
    }

}
