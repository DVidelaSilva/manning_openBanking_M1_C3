package com.manning.openbanking.dtos;

import java.util.Date;

import com.manning.openbanking.entities.Transaction;

import lombok.Data;

@Data
public class TransactionDto {

    private Long id;
    private String type;
    private Date date;
    private Integer accountNumber;
    private String currency;
    private Double amount;
    private String merchantName;
    private String merchantLogo;


    public TransactionDto(Long id, String type, Date date, Integer accountNumber, String currency, Double amount,
            String merchantName, String merchantLogo) {

        this.id = id;
        this.type = type;
        this.date = date;
        this.accountNumber = accountNumber;
        this.currency = currency;
        this.amount = amount;
        this.merchantName = merchantName;
        this.merchantLogo = merchantLogo;
    }

    public static TransactionDto apply(Transaction transaction) {
        return new TransactionDto(
            transaction.getId(), 
            transaction.getType(), 
            transaction.getDate(), 
            transaction.getAccountNumber(), 
            transaction.getCurrency(),
            transaction.getAmount(), 
            transaction.getMerchantName(), 
            transaction.getMerchantLogo()
        );
    }

    

    


}
