package com.manning.openbanking.services;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manning.openbanking.entities.Transaction;
import com.manning.openbanking.repositories.TransactionRepository;

@Service
public class TransactionService {

    @Autowired
    private TransactionRepository transactionRepository;

    public List<Transaction>  findAllByAccountNumber(Integer accountNumber){

    // TRansacciones Simuladas
    
        Transaction transactions1 = new Transaction();
        transactions1.setType("credit");
        transactions1.setDate(new Date());
        transactions1.setAccountNumber(123456789);
        transactions1.setCurrency("USD");
        transactions1.setAmount(100.00);
        transactions1.setMerchantName("BookStore");
        transactions1.setMerchantLogo("BookStore-logo.png");

        Transaction transactions2 = new Transaction();
        transactions2.setType("debit");
        transactions2.setDate(new Date());
        transactions2.setAccountNumber(123456789);
        transactions2.setCurrency("USD");
        transactions2.setAmount(300.00);
        transactions2.setMerchantName("BookStore");
        transactions2.setMerchantLogo("BookStore-logo.png");

        Transaction transactions3 = new Transaction();
        transactions3.setType("credit");
        transactions3.setDate(new Date());
        transactions3.setAccountNumber(123456789);
        transactions3.setCurrency("USD");
        transactions3.setAmount(800.00);
        transactions3.setMerchantName("GameStore");
        transactions3.setMerchantLogo("GameStore-logo.png");

        Transaction transactions4 = new Transaction();
        transactions4.setType("credit");
        transactions4.setDate(new Date());
        transactions4.setAccountNumber(123456789);
        transactions4.setCurrency("USD");
        transactions4.setAmount(800.00);
        transactions4.setMerchantName("GameStore");
        transactions4.setMerchantLogo("GameStore-logo.png");

  

    
        return List.of(transactions1, transactions2, transactions3, transactions4);
        
    }


    public List<Transaction> findByAccountNumber(Integer accountNumber){
        return transactionRepository.findByAccountNumber(accountNumber);
    }

}
