package com.excelr.ems_backend.controllers;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.excelr.ems_backend.dtos.AdminDto;
import com.excelr.ems_backend.models.Admin;
import com.excelr.ems_backend.service.AdminServiceImplementation;


@RestController
@RequestMapping("/api")
public class AdminController {
	@Autowired
	private AdminServiceImplementation adminService;
	
	
	@PostMapping("/NewAdmin")
	public ResponseEntity<Admin> addNewAdmin(@RequestBody AdminDto adminDto){
		return new ResponseEntity<>(adminService.createAdmin(adminDto),HttpStatus.CREATED);
	}
	
	@GetMapping("/admin-list")
	public ResponseEntity<List<Admin>> getAllAdmins(){
		return new ResponseEntity<List<Admin>>(adminService.getAllAdmins(),HttpStatus.OK);
	}
}
