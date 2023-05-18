package com.api.clientAccount.clientAccount.repository;

import com.api.clientAccount.clientAccount.models.TransactionsModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionsRepository extends JpaRepository<TransactionsModel, Integer> {
}
