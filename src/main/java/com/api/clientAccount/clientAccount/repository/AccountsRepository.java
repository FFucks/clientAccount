package com.api.clientAccount.clientAccount.repository;

import com.api.clientAccount.clientAccount.models.AccountsModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountsRepository extends JpaRepository<AccountsModel, Integer> {
    public AccountsModel getAccountByDocumentNumber(String documentNumber);
}
