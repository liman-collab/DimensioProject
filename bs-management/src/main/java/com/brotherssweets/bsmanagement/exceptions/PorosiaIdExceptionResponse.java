package com.brotherssweets.bsmanagement.exceptions;

public class PorosiaIdExceptionResponse {

    private String porosiaIdentifier;

    public PorosiaIdExceptionResponse(String porosiaIdentifier) {
        this.porosiaIdentifier = porosiaIdentifier;
    }

    public String getPorosiaIdentifier() {
        return porosiaIdentifier;
    }

    public void setPorosiaIdentifier(String porosiaIdentifier) {
        this.porosiaIdentifier = porosiaIdentifier;
    }
}
