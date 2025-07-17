package com.cognizant.account.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


class AccountResponse{
	private String number;
	private String type;
	private double balance;
	
	
	public AccountResponse(String number, String type, double balance) {
		this.number = number;
		this.type = type;
		this.balance = balance;
	}
	
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
}

@RestController
@RequestMapping("/accounts")
public class AccountController {
	
	@GetMapping("/{number}")
	public ResponseEntity<AccountResponse> accountInfo(@PathVariable String number){
		AccountResponse response=new AccountResponse(number, "savings", 234343);
		return new ResponseEntity<AccountResponse>(response, HttpStatusCode.valueOf(200));
	}
}
