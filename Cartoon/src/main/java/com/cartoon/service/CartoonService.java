package com.cartoon.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.cartoon.model.CartoonModel;

public interface CartoonService {

	CartoonModel addCartoon(CartoonModel cartoonModel);

	ResponseEntity<List<CartoonModel>> getAllCartoons();

	String deleteCartoonByName(String name);

	CartoonModel updateCartoonByname(CartoonModel cartoonModel);

	ResponseEntity<CartoonModel> getCartoonsByName(String name);

	void addCartoonByAdmin(CartoonModel cartoonModel);

	

	

}