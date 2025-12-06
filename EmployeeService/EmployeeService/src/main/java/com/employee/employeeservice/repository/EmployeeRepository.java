package com.employee.employeeservice.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employee.employeeservice.entity.Employee;
import java.util.List;


public interface EmployeeRepository extends JpaRepository<Employee,Long>{

	Optional<Employee>  findByEmpName(String empName);
}
