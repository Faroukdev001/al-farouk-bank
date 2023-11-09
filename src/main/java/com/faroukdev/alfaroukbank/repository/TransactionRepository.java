package com.faroukdev.alfaroukbank.repository;

import com.faroukdev.alfaroukbank.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, String> {
}
