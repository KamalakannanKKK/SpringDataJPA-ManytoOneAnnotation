package com.example.ManytoOneMapping.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ManytoOneMapping.Entity.Employee;
@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Long> {


	
}
