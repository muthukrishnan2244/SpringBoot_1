package com.department.DepartmentService.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.department.DepartmentService.entity.Department;
import java.util.List;


public interface DepartmentRepository extends JpaRepository<Department,Long> {
	
	Optional<Department> findByDepartmentCode(String departmentCode);



}
