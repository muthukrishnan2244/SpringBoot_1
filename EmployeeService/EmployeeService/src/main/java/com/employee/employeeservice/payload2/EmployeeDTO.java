package com.employee.employeeservice.payload2;

public class EmployeeDTO {

	
	private String empName;
	private String empFirstName;
	private String empLastName;
	private String departmentCode;
	public EmployeeDTO(String empName, String empFirstName, String empLastName,String departmentCode) {
		super();
		this.empName = empName;
		this.empFirstName = empFirstName;
		this.empLastName = empLastName;
		this.departmentCode = departmentCode;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpFirstName() {
		return empFirstName;
	}
	public void setEmpFirstName(String empFirstName) {
		this.empFirstName = empFirstName;
	}
	public String getEmpLastName() {
		return empLastName;
	}
	public void setEmpLastName(String empLastName) {
		this.empLastName = empLastName;
	}
	public EmployeeDTO() {
		super();
	}
	public String getDepartmentCode() {
		return departmentCode;
	}
	public void setDepartmentCode(String departmentCode) {
		this.departmentCode = departmentCode;
	}
	
	
}

