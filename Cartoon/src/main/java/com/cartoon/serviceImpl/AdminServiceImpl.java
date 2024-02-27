package com.cartoon.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.cartoon.model.Admin;
import com.cartoon.repo.AdminRepo;
import com.cartoon.service.AdminService;

@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	AdminRepo adminRepo;

	@Override
	public ResponseEntity<Admin> validateAdmin(String email, String password) {
		if (adminRepo.findByAdminEmailAndAdminPassword(email, password) != null)
			return ResponseEntity.ok(adminRepo.findByAdminEmailAndAdminPassword(email, password));
		else
			return null;
	}

	@Override
	public Admin createAdmin(Admin admin) {
		if (adminRepo.findByAdminEmail(admin.getAdminEmail()) == null) {
			adminRepo.save(admin);
		}
		return admin;
	}

	@Override
	public Admin getAdmin(String adminName) {
		if (adminRepo.findByAdminName(adminName) != null) {
			return adminRepo.findByAdminName(adminName);
		} else
			return null;
	}

	@Override
	public String updateAdmin(Admin admin) {
		if (adminRepo.findByAdminName(admin.getAdminName()) != null) {
			adminRepo.save(admin);
			return "Admin update";
		}
		return "No Admin Found";
	}

	@Override
	public String deleteAdmin(String email) {

		if (adminRepo.findByAdminEmail(email) != null) {
			adminRepo.deleteById(adminRepo.findByAdminEmail(email).getAdminId());
			return "Admin deleted";
		}
		return "No Admin Found";
	}

}
