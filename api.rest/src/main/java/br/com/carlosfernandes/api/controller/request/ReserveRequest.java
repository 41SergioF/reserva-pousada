package br.com.carlosfernandes.api.controller.request;

import br.com.carlosfernandes.core.domain.Reserve;
import lombok.Setter;
import org.bson.types.ObjectId;

import javax.validation.constraints.FutureOrPresent;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import java.util.Date;

@Setter
public class ReserveRequest {

    @FutureOrPresent
    private Date start;
    @FutureOrPresent
    private Date end;

    @NotNull(message = "Selecione um Usuário")
    private ObjectId userId; //Proprietário
    @NotNull
    private ObjectId bedroomId; //Quarto

    public Reserve toReserve() {
        var reserve = new Reserve();

        reserve.setEnd(end);
        reserve.setStart(start);
        reserve.setUserId(userId);
        reserve.setBedroomId(bedroomId);

        return reserve;
    }
}
