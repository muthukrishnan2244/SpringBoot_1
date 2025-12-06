package com.department.DepartmentService.payload;

public class DepartmentDTO {

	private String departmentName;
	private String departmentCode;
	private String departmentDescription;
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String getDepartmentCode() {
		return departmentCode;
	}
	public void setDepartmentCode(String departmentCode) {
		this.departmentCode = departmentCode;
	}
	public String getDepartmentDescription() {
		return departmentDescription;
	}
	public void setDepartmentDescription(String departmentDescription) {
		this.departmentDescription = departmentDescription;
	}
	public DepartmentDTO(String departmentName, String departmentCode, String departmentDescription) {
		super();
		this.departmentName = departmentName;
		this.departmentCode = departmentCode;
		this.departmentDescription = departmentDescription;
	}
	public DepartmentDTO() {
		super();
	}
	
}
