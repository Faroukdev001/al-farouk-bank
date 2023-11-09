package com.faroukdev.alfaroukbank.service.impl;

import com.faroukdev.alfaroukbank.dto.TransactionDto;
import com.faroukdev.alfaroukbank.entity.Transaction;
import com.faroukdev.alfaroukbank.repository.TransactionRepository;
import com.faroukdev.alfaroukbank.utils.AccountUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TransactionImpl implements TransactionService {

    @Autowired
    TransactionRepository transactionRepository;
    
    @Override
    public void saveTransaction(TransactionDto transactionDto) {
        Transaction transaction = Transaction.builder()
                .transactionType(transactionDto.getTransactionType())
                .accountNumber(transactionDto.getAccountNumber())
                .amount(transactionDto.getAmount())
                .status(AccountUtils.STATUS_MESSAGE)
                .build();
        transactionRepository.save(transaction);
        System.out.println("Transaction saved Successfully");
    }
}
