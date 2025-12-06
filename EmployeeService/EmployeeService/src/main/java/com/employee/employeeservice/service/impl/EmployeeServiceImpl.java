package com.employee.employeeservice.service.impl;

import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import com.employee.employeeservice.entity.Employee;
import com.employee.employeeservice.payload2.APIResponseDTO;
import com.employee.employeeservice.payload2.DepartmentDTO;
import com.employee.employeeservice.payload2.EmployeeDTO;
import com.employee.employeeservice.repository.EmployeeRepository;
import com.employee.employeeservice.service.APIClient;
import com.employee.employeeservice.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeRepository employeeRepository;
	@Autowired
	private ModelMapper mapper;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private WebClient webClient;
	@Autowired
	private APIClient apiClient;
	
	@Override
	public String saveEmployee(EmployeeDTO employeeDTO) {
		Employee employee = mapper.map(employeeDTO, Employee.class);
		employeeRepository.save(employee);
		return "SUCCESS";
	}

	@Override
	public APIResponseDTO getEmployeeByName(String empName) {
		APIResponseDTO apiResponseDTO = new APIResponseDTO();
		Optional<Employee> empOptional = employeeRepository.findByEmpName(empName);
		EmployeeDTO employeeDTO = mapper.map(empOptional.get(), EmployeeDTO.class);
		//RestTemplate
//		ResponseEntity<DepartmentDTO> responseEntity = restTemplate.getForEntity("http://localhost:9090/api/department/"+employeeDTO.getDepartmentCode(), 
//				DepartmentDTO.class);
		//RestTemplate
//Webclient 
//		DepartmentDTO departmentDTO = webClient.get().uri("http://localhost:9090/api/department/"+employeeDTO.getDepartmentCode())
//		.retrieve().bodyToMono(DepartmentDTO.class).block();
		
		DepartmentDTO departmentDTO = apiClient.getDepartmentByCode(employeeDTO.getDepartmentCode());
		
		//apiResponseDTO.setDepartmentDTO(responseEntity.getBody());
		apiResponseDTO.setDepartmentDTO(departmentDTO);
		apiResponseDTO.setEmployeeDTO(employeeDTO);
		return apiResponseDTO;
	}

}
