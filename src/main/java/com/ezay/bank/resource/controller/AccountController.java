package com.ezay.bank.resource.controller;

import com.ezay.bank.resource.model.Accounts;
import com.ezay.bank.resource.model.Customer;
import com.ezay.bank.resource.repository.AccountsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

    @Autowired
    private AccountsRepository accountsRepository;

    @PostMapping("/myAccount")
    public Accounts getAccountDetails(@RequestBody Customer customer) {
        return accountsRepository.findByEmail(customer.getEmail());


    }

}
