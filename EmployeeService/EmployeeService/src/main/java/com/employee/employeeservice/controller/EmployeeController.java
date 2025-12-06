package com.employee.employeeservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.employeeservice.payload2.APIResponseDTO;
import com.employee.employeeservice.payload2.EmployeeDTO;
import com.employee.employeeservice.service.EmployeeService;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("/save")
	public ResponseEntity<?> saveEmployee(@RequestBody EmployeeDTO employeeDTO){
		String result = employeeService.saveEmployee(employeeDTO);
		return new ResponseEntity(result,HttpStatus.CREATED);
	}
	
	@GetMapping("{empName}")
	public ResponseEntity<?> getEmployeeDTO(@PathVariable String empName) {
		APIResponseDTO apiResponseDTO = employeeService.getEmployeeByName(empName);
		return new ResponseEntity(apiResponseDTO,HttpStatus.OK);

	}
}
