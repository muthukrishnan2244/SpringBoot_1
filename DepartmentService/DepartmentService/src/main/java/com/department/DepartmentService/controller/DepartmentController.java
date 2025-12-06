package com.department.DepartmentService.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.department.DepartmentService.payload.DepartmentDTO;
import com.department.DepartmentService.service.DepartmentService;

@RestController
@RequestMapping("/api/department")
public class DepartmentController {

	private final DepartmentService departmentService;
	
	
	public DepartmentController(DepartmentService departmentService) {
		super();
		this.departmentService = departmentService;
	}


	@PostMapping("/save")
	public ResponseEntity<?> saveDepartment(@RequestBody DepartmentDTO departmentDTO){
		String result = departmentService.saveDepartment(departmentDTO);
		return new ResponseEntity(result,HttpStatus.CREATED);
	}
	
	@GetMapping("{departmentCode}")
	public ResponseEntity<?> getDepartmentByCode(@PathVariable String departmentCode){
		DepartmentDTO departmentDTO = departmentService.getDepartmentByCode(departmentCode);
		return new ResponseEntity(departmentDTO,HttpStatus.CREATED);

	}


}
