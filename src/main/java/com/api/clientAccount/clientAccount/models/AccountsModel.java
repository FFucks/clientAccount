package com.api.clientAccount.clientAccount.models;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "accounts")
public class AccountsModel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "accountsSeq")
    @SequenceGenerator(name = "accountsSeq", sequenceName = "accountsSequence", initialValue = 1, allocationSize = 1)
    @Column(nullable = false, name = "account_id")
    private Integer accountId;

    @Column(name = "document_number")
    private String documentNumber;

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public String getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }
}
