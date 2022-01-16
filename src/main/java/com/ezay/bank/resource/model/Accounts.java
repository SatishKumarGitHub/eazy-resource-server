package com.ezay.bank.resource.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Accounts {

	@Column(name="account_number")
	@Id
	private long accountNumber;
	private String email;
	@Column(name="account_type")
	private String accountType;
	@Column(name = "branch_address")
	private String branchAddress;
	@Column(name = "create_dt")
	private String createDt;
	

	
}
