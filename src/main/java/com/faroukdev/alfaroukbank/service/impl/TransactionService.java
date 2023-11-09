package com.faroukdev.alfaroukbank.service.impl;

import com.faroukdev.alfaroukbank.dto.TransactionDto;
import com.faroukdev.alfaroukbank.entity.Transaction;

public interface TransactionService {
    void saveTransaction(TransactionDto transactionDto);
}
