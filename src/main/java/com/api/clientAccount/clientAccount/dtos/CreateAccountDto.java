package com.api.clientAccount.clientAccount.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CreateAccountDto {

    @JsonProperty("document_number")
    private String documentNumber;

    public String getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }
}
