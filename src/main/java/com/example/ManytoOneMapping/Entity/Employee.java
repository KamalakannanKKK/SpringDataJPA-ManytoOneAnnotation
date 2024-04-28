package com.example.ManytoOneMapping.Entity;

import java.util.Set;

import com.example.ManytoOneMapping.Repository.BankRepo;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Employee {

	
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	private long id;
	
	private String employeeName;
	private String employeeGender;
	private long age;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JsonManagedReference
	private Set<BankRepo> bankRepo;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeGender() {
		return employeeGender;
	}

	public void setEmployeeGender(String employeeGender) {
		this.employeeGender = employeeGender;
	}

	public long getAge() {
		return age;
	}

	public void setAge(long age) {
		this.age = age;
	}

	public Set<BankRepo> getBankRepo() {
		return bankRepo;
	}

	public void setBankRepo(Set<BankRepo> bankRepo) {
		this.bankRepo = bankRepo;
	}

	public Employee(long id, String employeeName, String employeeGender, long age, Set<BankRepo> bankRepo) {
		super();
		this.id = id;
		this.employeeName = employeeName;
		this.employeeGender = employeeGender;
		this.age = age;
		this.bankRepo = bankRepo;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}


	
}
