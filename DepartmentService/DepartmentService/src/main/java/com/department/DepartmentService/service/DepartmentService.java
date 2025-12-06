package com.department.DepartmentService.service;

import com.department.DepartmentService.payload.DepartmentDTO;

public interface DepartmentService {

	public String saveDepartment(DepartmentDTO departmentDTO);
	
	public DepartmentDTO getDepartmentByCode(String departmentCode);
}
