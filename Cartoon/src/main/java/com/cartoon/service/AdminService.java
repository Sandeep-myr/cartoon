package com.cartoon.service;

import org.springframework.http.ResponseEntity;

import com.cartoon.model.Admin;

public interface AdminService {

	ResponseEntity<Admin> validateAdmin(String email, String password);

	Admin createAdmin(Admin admin);

	Admin getAdmin(String adminName);

	String updateAdmin(Admin admin);

	String deleteAdmin(String email);

	
	
}