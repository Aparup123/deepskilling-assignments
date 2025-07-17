package com.cognizant.loan.controller;

import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

class LoanResponse{
	private String number;
	private String type;
	private double loan;
	private double emi;
	private int tenure;
	public LoanResponse(String number, String type, double loan, double emi, int tenure) {
		this.number = number;
		this.type = type;
		this.loan = loan;
		this.emi = emi;
		this.tenure = tenure;
		
		
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
	public double getLoan() {
		return loan;
	}
	public void setLoan(double loan) {
		this.loan = loan;
	}
	public double getEmi() {
		return emi;
	}
	public void setEmi(double emi) {
		this.emi = emi;
	}
	public int getTenure() {
		return tenure;
	}
	public void setTenure(int tenure) {
		this.tenure = tenure;
	}
	
}

@RestController
@RequestMapping("/loans")
public class LoanController {
	
	@GetMapping("/")
	public String welcome() {
		return "Hello world";
	}
	
	
	@GetMapping("/{number}")
	public ResponseEntity<LoanResponse> loanInfo(@PathVariable String number){
		LoanResponse response=new LoanResponse(number, "car", 25693.2, 2532, 18);
		return new ResponseEntity<LoanResponse>(response, HttpStatusCode.valueOf(200));
	}
}
