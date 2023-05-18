package com.api.clientAccount.clientAccount.controllers;

import com.api.clientAccount.clientAccount.dtos.CreateAccountDto;
import com.api.clientAccount.clientAccount.dtos.CreateTransactionDto;
import com.api.clientAccount.clientAccount.services.TransactionService;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/")
@RestController
public class TransactionsController {

    private final TransactionService transactionService;
    public TransactionsController(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    @PostMapping("/transactions")
    public ResponseEntity<Object> transactionCreation(@RequestBody CreateTransactionDto createTransactionDto)  {
        return ResponseEntity.status(HttpStatus.CREATED).body(transactionService.createTransaction(createTransactionDto));
    }
}
