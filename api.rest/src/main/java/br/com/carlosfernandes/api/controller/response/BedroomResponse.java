package br.com.carlosfernandes.api.controller.response;

import br.com.carlosfernandes.core.domain.Bedroom;

public class BedroomResponse {

    private String number;
    private String description;

    //private Status status;

    public BedroomResponse fromBedroom(Bedroom bedroom){
        this.number = bedroom.getNumber();
        this.description = bedroom.getDescription();

        return this;
    }

}
