package com.cartoon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cartoon.model.Admin;
import com.cartoon.service.AdminService;

@RestController("/admin")
public class AdminController {
	@Autowired
	AdminService adminService;

	@PostMapping("/createAdmin")
	private Admin createAdmin(@RequestBody Admin admin) {
		return adminService.createAdmin(admin);
	}

	@GetMapping("/getAdminByName/{adminName}")
	private Admin getAdmin(@PathVariable("adminName") String adminName) {
		return adminService.getAdmin(adminName);
	}

	@PutMapping("/updateAdmin")
	private String updateAdmin(@RequestBody Admin admin) {
		return adminService.updateAdmin(admin);
	}
	
	@DeleteMapping("/deleteAdminByEmail/{email}")
	private String deleteAdmin(@PathVariable("email") String email) {
		return adminService.deleteAdmin(email);
	}
}
