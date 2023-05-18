package com.api.clientAccount.clientAccount.services;

import com.api.clientAccount.clientAccount.Commons;
import com.api.clientAccount.clientAccount.dtos.CreateTransactionDto;
import com.api.clientAccount.clientAccount.models.OperationsTypesModel;
import com.api.clientAccount.clientAccount.models.TransactionsModel;
import com.api.clientAccount.clientAccount.repository.OperationsTypesRepository;
import com.api.clientAccount.clientAccount.repository.TransactionsRepository;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Optional;

@Service
public class TransactionService {

    private final TransactionsRepository transactionsRepository;
    private final OperationsTypesRepository operationsTypesRepository;

    public TransactionService(TransactionsRepository transactionsRepository,
                              OperationsTypesRepository operationsTypesRepository) {
        this.transactionsRepository = transactionsRepository;
        this.operationsTypesRepository = operationsTypesRepository;
    }
    public Object createTransaction(CreateTransactionDto createTransactionDto) {

        /*Optional<OperationsTypesModel> operationsTypesModel = operationsTypesRepository.findById(createTransactionDto.getOperationType());
        if (operationsTypesModel.isEmpty()) {
            return null;
        }*/

        TransactionsModel model = new TransactionsModel();
        model.setAccountId(createTransactionDto.getAccountId());
        model.setOperationTypeId(createTransactionDto.getOperationType());
        model.setAmount(createTransactionDto.getOperationType() != 4
                ? createTransactionDto.getAmount().multiply(BigDecimal.valueOf(-1))
                : createTransactionDto.getAmount());
        model.setEventDate(Commons.getUtcNow());

        return transactionsRepository.save(model);
    }
}
