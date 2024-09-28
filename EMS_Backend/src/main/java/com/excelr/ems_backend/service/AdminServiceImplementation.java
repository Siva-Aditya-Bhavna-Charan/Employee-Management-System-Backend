package com.excelr.ems_backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.excelr.ems_backend.exceptionhandling.EmployeeNotFoundException;
import com.excelr.ems_backend.models.EmployeeRecord;
import com.excelr.ems_backend.repositories.EmployeeRepository;

@Service
public class AdminServiceImplementation implements AdminService {
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public String createEmployee(EmployeeRecord employeeRecord) {
		if(employeeRecord.getProjects()==null || employeeRecord.getProjects().isEmpty())
		{
			employeeRecord.setProjects(null);
		}
		employeeRepository.save(employeeRecord);
		return "New Employe created";
	}

	@Override
	public String deleteEmployee(Long id) {
		EmployeeRecord existRecord=findEmployeeById(id);
		employeeRepository.delete(existRecord);
		return "Employee with this id: "+id+" deleted";
	}

	@Override
	public String updateEmployee() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<EmployeeRecord> getAllEmployees() {
		List<EmployeeRecord> employees=employeeRepository.findAll();
		return employees;
	}

	@Override
	public EmployeeRecord findEmployeeById(Long id) {
		return employeeRepository.findById(id).orElseThrow(() -> new EmployeeNotFoundException("Employee not found with this Id: "+id));
	}

}
