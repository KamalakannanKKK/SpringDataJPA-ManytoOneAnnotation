package com.example.ManytoOneMapping.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ManytoOneMapping.Entity.Employee;
import com.example.ManytoOneMapping.Entity.bankAccount;
@Repository
public interface BankRepo extends JpaRepository<bankAccount, Integer>{

	Employee findEmployeeById(long id);

}
