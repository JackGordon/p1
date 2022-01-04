package com.revature.banksy.repos;

import com.revature.banksy.models.Transactions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface TransactionsRepository extends JpaRepository<Transactions, Integer>, JpaSpecificationExecutor<Transactions> {

}