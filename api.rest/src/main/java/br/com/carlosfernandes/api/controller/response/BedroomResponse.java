package br.com.carlosfernandes.api.controller.response;

import br.com.carlosfernandes.core.domain.Bedroom;
import br.com.carlosfernandes.core.domain.Status;
import lombok.Getter;

@Getter
public class BedroomResponse {

    private String number;
    private String description;
    private Status status;

    //private Status status;

    public BedroomResponse fromBedroom(Bedroom bedroom){
        this.number = bedroom.getNumber();
        this.description = bedroom.getDescription();
        this.status = bedroom.getStatus();

        return this;
    }

}
