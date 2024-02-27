package com.cartoon.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cartoon.model.UserModel;
import com.cartoon.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserService service;

	@PostMapping("/registerUser")
	public ResponseEntity<UserModel> registerUser(@RequestBody UserModel model) {
		return service.registerUser(model);
	}

	@GetMapping("/getAllUserDetails")
	public ResponseEntity<List<UserModel>> getUserAllDetails() {
		return service.getAllUserDetails();
	}

	@GetMapping("/getOneUserById/{id}")
	public ResponseEntity<UserModel> getUserDetails(@PathVariable("id") Long id) {
		return service.getUserDetails(id);
	}

	@PutMapping("/updateUser")
	public ResponseEntity<UserModel> updateUserDetails(@RequestBody UserModel model) {
		return service.updateUser(model);
	}
	
	@DeleteMapping("/deleteUserByEmail/{email}")
	public String deleteUserByEmail(@PathVariable("email") String email) {
		return service.deleteUserByEmail(email);
	}
}
