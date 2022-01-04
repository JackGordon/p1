package com.revature.banksy.repos;

import com.revature.banksy.models.Accounts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface AccountsRepository extends JpaRepository<Accounts, Integer>, JpaSpecificationExecutor<Accounts> {

}