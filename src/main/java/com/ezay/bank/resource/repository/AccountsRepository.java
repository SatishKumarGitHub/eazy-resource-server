package com.ezay.bank.resource.repository;

import com.ezay.bank.resource.model.Accounts;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountsRepository extends CrudRepository<Accounts, Long> {
	
	Accounts findByEmail(String email);

}
