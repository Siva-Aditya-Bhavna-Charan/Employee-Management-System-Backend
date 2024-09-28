package com.excelr.ems_backend.service;

import java.util.List;

import com.excelr.ems_backend.models.EmployeeRecord;

public interface AdminService {

	public String createEmployee(EmployeeRecord employeeRecord);

	public String deleteEmployee(Long id);

	public String updateEmployee();

	public List<EmployeeRecord> getAllEmployees();

	public EmployeeRecord findEmployeeById(Long id);
}
