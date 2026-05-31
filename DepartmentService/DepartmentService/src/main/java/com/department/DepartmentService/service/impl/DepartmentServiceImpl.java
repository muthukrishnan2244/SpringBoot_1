package com.department.DepartmentService.service.impl;

import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.department.DepartmentService.entity.Department;
import com.department.DepartmentService.payload.DepartmentDTO;
import com.department.DepartmentService.repo.DepartmentRepository;
import com.department.DepartmentService.service.DepartmentService;

@Service
public class DepartmentServiceImpl implements DepartmentService{
	
	private final DepartmentRepository departmentRepository;
	
	@Autowired
	private ModelMapper modelMapper;


	public DepartmentServiceImpl(DepartmentRepository departmentRepository) {
		super();
		this.departmentRepository = departmentRepository;
	}



	@Override
	public String saveDepartment(DepartmentDTO departmentDTO) {
		try {
			System.out.println('Test 14');
			Department department = modelMapper.map(departmentDTO, Department.class);
			departmentRepository.save(department);
		}catch(Exception e) {
			throw new RuntimeException(e);
		}
		return "Data saved successfully";
	}



	@Override
	public DepartmentDTO getDepartmentByCode(String departmentCode) {
		Optional<Department> optionalDOptional = departmentRepository.findByDepartmentCode(departmentCode);
		DepartmentDTO modDepartmentDTO = modelMapper.map(optionalDOptional.get(), DepartmentDTO.class);
		return modDepartmentDTO;
	}

}
