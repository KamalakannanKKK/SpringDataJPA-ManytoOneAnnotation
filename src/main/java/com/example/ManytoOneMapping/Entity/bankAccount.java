package com.example.ManytoOneMapping.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
@Entity
public class bankAccount {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO) 
	private int id;
	
	private long bankAccountnumber;
	private String bankName;
	private long ifscCode;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JsonBackReference
	private Employee employee;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public long getBankAccountnumber() {
		return bankAccountnumber;
	}

	public void setBankAccountnumber(long bankAccountnumber) {
		this.bankAccountnumber = bankAccountnumber;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public long getIfscCode() {
		return ifscCode;
	}

	public void setIfscCode(long ifscCode) {
		this.ifscCode = ifscCode;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public bankAccount(int id, long bankAccountnumber, String bankName, long ifscCode, Employee employee) {
		super();
		this.id = id;
		this.bankAccountnumber = bankAccountnumber;
		this.bankName = bankName;
		this.ifscCode = ifscCode;
		this.employee = employee;
	}

	public bankAccount() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
