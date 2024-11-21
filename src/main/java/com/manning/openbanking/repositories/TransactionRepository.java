package com.manning.openbanking.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.manning.openbanking.entities.Transaction;


@Repository
public interface TransactionRepository extends CrudRepository<Transaction, Long>{

    List<Transaction> findByAccountNumber(Integer accountNumber);

}
