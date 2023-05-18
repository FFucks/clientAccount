package com.api.clientAccount.clientAccount.controllers;

import com.api.clientAccount.clientAccount.dtos.CreateAccountDto;
import com.api.clientAccount.clientAccount.services.AccountService;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@Controller
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/")
@RestController
public class AccountsController {

    private final AccountService accountService;


    public AccountsController(AccountService accountService) {
        this.accountService = accountService;
    }

    @PostMapping("/accounts")
    public ResponseEntity<Object> accountCreation(@RequestBody CreateAccountDto createAccountDto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(accountService.createAccount(createAccountDto.getDocumentNumber()));
    }

    @GetMapping("/accounts/{accountId}")
    public ResponseEntity<Object> getAccount(@PathVariable Integer accountId) {
        return ResponseEntity.status(HttpStatus.OK).body(accountService.getAccount(accountId));
    }
}
