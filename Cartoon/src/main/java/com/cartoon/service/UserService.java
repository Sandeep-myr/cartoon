package com.cartoon.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.cartoon.model.UserModel;

public interface UserService {

	ResponseEntity<UserModel> registerUser(UserModel model);

	ResponseEntity<List<UserModel>> getAllUserDetails();

	ResponseEntity<UserModel> getUserDetails(Long id);

	ResponseEntity<UserModel> updateUser(UserModel model);

	String deleteUserByEmail(String email);
	
	

}