package com.employee.employeeservice.service;

import com.employee.employeeservice.payload2.APIResponseDTO;
import com.employee.employeeservice.payload2.EmployeeDTO;

public interface EmployeeService {

	public String saveEmployee(EmployeeDTO employeeDTO);
	
	public APIResponseDTO getEmployeeByName(String empName);
}

