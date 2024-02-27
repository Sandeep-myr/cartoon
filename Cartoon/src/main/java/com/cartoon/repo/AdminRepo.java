package com.cartoon.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cartoon.model.Admin;


public interface AdminRepo extends JpaRepository<Admin, Long> {
	Admin findByAdminEmailAndAdminPassword(String adminEmail, String adminPassword);
	Admin  findByAdminEmail(String adminEmail);;
	Admin findByAdminName(String adminName);
}
