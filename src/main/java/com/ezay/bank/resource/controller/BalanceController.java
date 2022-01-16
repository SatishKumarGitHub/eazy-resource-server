package com.ezay.bank.resource.controller;

import com.ezay.bank.resource.model.AccountTransactions;
import com.ezay.bank.resource.model.Customer;
import com.ezay.bank.resource.repository.AccountTransactionsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BalanceController {

	@Autowired
	private AccountTransactionsRepository accountTransactionsRepository;
	
	@PostMapping("/myBalance")
	public List<AccountTransactions> getBalanceDetails(@RequestBody Customer customer) {
		List<AccountTransactions> accountTransactions = accountTransactionsRepository.
				findByEmailOrderByTransactionDtDesc(customer.getEmail());
		if (accountTransactions != null ) {
			return accountTransactions;
		}else {
			return null;
		}
	}
}
