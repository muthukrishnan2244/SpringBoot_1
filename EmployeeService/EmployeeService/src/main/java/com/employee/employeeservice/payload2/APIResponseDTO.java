package com.employee.employeeservice.payload2;

public class APIResponseDTO {

	private EmployeeDTO employeeDTO;
	private DepartmentDTO departmentDTO;
	public EmployeeDTO getEmployeeDTO() {
		return employeeDTO;
	}
	public void setEmployeeDTO(EmployeeDTO employeeDTO) {
		this.employeeDTO = employeeDTO;
	}
	public DepartmentDTO getDepartmentDTO() {
		return departmentDTO;
	}
	public void setDepartmentDTO(DepartmentDTO departmentDTO) {
		this.departmentDTO = departmentDTO;
	}
	public APIResponseDTO(EmployeeDTO employeeDTO, DepartmentDTO departmentDTO) {
		super();
		this.employeeDTO = employeeDTO;
		this.departmentDTO = departmentDTO;
	}
	public APIResponseDTO() {
		super();
	}
	
	
}
