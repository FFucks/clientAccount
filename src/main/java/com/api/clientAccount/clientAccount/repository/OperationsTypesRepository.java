package com.api.clientAccount.clientAccount.repository;

import com.api.clientAccount.clientAccount.models.OperationsTypesModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OperationsTypesRepository extends JpaRepository<OperationsTypesModel, Integer> {
}
