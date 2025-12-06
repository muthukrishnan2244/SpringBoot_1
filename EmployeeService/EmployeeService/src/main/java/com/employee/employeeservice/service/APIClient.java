package com.employee.employeeservice.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.employee.employeeservice.payload2.DepartmentDTO;

@FeignClient(value = "department-service",url = "http://localhost:9090")
public interface APIClient {

	@GetMapping("/api/department/{departmentCode}")
	public DepartmentDTO getDepartmentByCode(@PathVariable String departmentCode);
}
