package com.ezay.bank.resource.repository;

import com.ezay.bank.resource.model.AccountTransactions;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountTransactionsRepository extends CrudRepository<AccountTransactions, Long> {
	
	List<AccountTransactions> findByEmailOrderByTransactionDtDesc(String email);;

}
