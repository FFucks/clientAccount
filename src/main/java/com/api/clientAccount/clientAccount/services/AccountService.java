package com.api.clientAccount.clientAccount.services;

import com.api.clientAccount.clientAccount.models.AccountsModel;
import com.api.clientAccount.clientAccount.repository.AccountsRepository;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

    private final AccountsRepository accountsRepository;

    public AccountService(AccountsRepository accountsRepository) {
        this.accountsRepository = accountsRepository;
    }
    public Object createAccount(String documentNumber) {
        AccountsModel model = new AccountsModel();

        model.setDocumentNumber(documentNumber);

        return accountsRepository.save(model);
    }

    public Object getAccount(Integer accountId) {
        return accountsRepository.findById(accountId);
    }
}
