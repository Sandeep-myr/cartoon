package com.cartoon.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cartoon.model.Admin;
import com.cartoon.model.CartoonModel;
import com.cartoon.service.AdminService;
import com.cartoon.service.CartoonService;

@RestController
@RequestMapping("/admin")
@CrossOrigin("http://localhost:4200")
public class CartoonController {
	@Autowired
	AdminService adminService;
	@Autowired
	CartoonService service;
	
	
	
	@GetMapping("/validate/{email}/{password}")
	public ResponseEntity<Admin> adminValidation(@PathVariable("email") String email,@PathVariable("password") String password) {

		return adminService.validateAdmin(email, password);
	}
	
	@PostMapping("/addCartoon")
	public void addCartoonByAdmin(@RequestBody CartoonModel cartoonModel){
		 service.addCartoonByAdmin(cartoonModel);
	}
	
	@GetMapping("/getAllCartoons")
	private ResponseEntity<List<CartoonModel>> getAllCartoons() {
		return service.getAllCartoons();

	}

	@GetMapping("/getCartoonByname/{name}")
	private ResponseEntity<CartoonModel> getCartoonsByName(@PathVariable("name") String name) {
		return service.getCartoonsByName(name);
		
	}

	@DeleteMapping("/deleteByname/{name}")
	private String deleteByCartoonname(@PathVariable("name") String name) {
		return service.deleteCartoonByName(name);
	}

	@PutMapping("/updateByname")
	private CartoonModel updateCartoonByname(@RequestBody CartoonModel cartoonModel) {
		return service.updateCartoonByname(cartoonModel);
	}

}
