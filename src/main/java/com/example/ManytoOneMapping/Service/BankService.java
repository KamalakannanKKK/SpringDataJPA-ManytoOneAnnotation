package com.example.ManytoOneMapping.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ManytoOneMapping.Entity.Employee;
import com.example.ManytoOneMapping.Repository.BankRepo;

@Service
public class BankService {

	@Autowired
	private BankRepo bankrepo;
	
	public Employee getEmpById(long id) {
		return this.bankrepo.findEmployeeById(id);
	}
}
