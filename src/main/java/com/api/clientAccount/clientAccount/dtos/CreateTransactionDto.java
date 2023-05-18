package com.api.clientAccount.clientAccount.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class CreateTransactionDto {

    @JsonProperty("account_id")
    private Integer accountId;

    @JsonProperty("operation_type_id")
    private Integer operationType;

    @JsonProperty("amount")
    private BigDecimal amount;

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public Integer getOperationType() {
        return operationType;
    }

    public void setOperationType(Integer operationType) {
        this.operationType = operationType;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}
