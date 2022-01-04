package com.revature.banksy.repos;

import com.revature.banksy.models.Recipients;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface RecipientsRepository extends JpaRepository<Recipients, Integer>, JpaSpecificationExecutor<Recipients> {

}