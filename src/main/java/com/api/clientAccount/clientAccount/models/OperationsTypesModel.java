package com.api.clientAccount.clientAccount.models;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "operation_types")
public class OperationsTypesModel implements Serializable {

    @Id
    @Column(nullable = false, name = "operationType_ID", unique = true)
    private Integer operationTypeId;

    @Column(name = "description")
    private String description;

    public Integer getOperationTypeId() {
        return operationTypeId;
    }

    public void setOperationTypeId(Integer operationTypeId) {
        this.operationTypeId = operationTypeId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
