package br.com.carlosfernandes.api.controller.request;

import br.com.carlosfernandes.core.domain.Bedroom;
import br.com.carlosfernandes.core.domain.Status;
import lombok.Setter;
import org.bson.types.ObjectId;

import java.rmi.StubNotFoundException;
import java.util.ArrayList;
import java.util.List;

@Setter
public class BedroomRequest {

    private String number;
    private String description;
    private String status;

    public Bedroom toBedroom(){
        var bedroom = new Bedroom();
        bedroom.setNumber(number);
        bedroom.setDescription(description);
        bedroom.setStatus(Status.valueOf(status));

        return bedroom;
    }

}
