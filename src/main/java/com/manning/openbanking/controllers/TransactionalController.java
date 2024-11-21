package com.manning.openbanking.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.manning.openbanking.dtos.TransactionDto;
import com.manning.openbanking.entities.Transaction;
import com.manning.openbanking.services.TransactionService;

import static java.util.stream.Collectors.toList;

@RestController
@RequestMapping("/api/transactions/")
public class TransactionalController {

    @Autowired
    public TransactionService transactionService;

    private TransactionDto map(Transaction transaction){
        return TransactionDto.apply(transaction);
    }


    @GetMapping("/{accountNumber}")
    public ResponseEntity <List<TransactionDto>> GetTransactionById(@PathVariable("accountNumber") Integer accountNumber){

        List<TransactionDto> transaction = transactionService.findAllByAccountNumber(accountNumber).stream().map(this::map).collect(toList());


        return ResponseEntity.ok(transaction);
    }








}
