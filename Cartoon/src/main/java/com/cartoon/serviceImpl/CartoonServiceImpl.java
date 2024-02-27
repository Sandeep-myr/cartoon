package com.cartoon.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.cartoon.model.CartoonModel;
import com.cartoon.repo.CartoonRepo;
import com.cartoon.service.CartoonService;

@Service
public class CartoonServiceImpl implements CartoonService {
	@Autowired
	CartoonRepo repo;

	@Override
	public CartoonModel addCartoon(CartoonModel cartoonModel) {

		return repo.save(cartoonModel);
	}

	@Override
	public ResponseEntity<List<CartoonModel>> getAllCartoons() {
		
		return ResponseEntity.ok(repo.findAll());
	}

	@Override
	public String deleteCartoonByName(String name) {
		if (repo.findByCartoonName(name) != null) {
			repo.deleteById(repo.findByCartoonName(name).getCartoonId());
			return "Cartoon Delete Successfull";
		}
		return "No Such Cartoon found";
	}

	public CartoonModel updateCartoonById(CartoonModel cartoonModel) {
		CartoonModel cartoonModel2 = repo.findById(cartoonModel.getCartoonId()).get();
		cartoonModel2 = cartoonModel;
		return repo.save(cartoonModel2);
	}

	@Override
	public ResponseEntity<CartoonModel> getCartoonsByName(String name) {

		return ResponseEntity.ok(repo.findByCartoonName(name));
	}

	@Override
	public void addCartoonByAdmin(CartoonModel cartoonModel) {
		// TODO Auto-generated method stub
		repo.save(cartoonModel);

	}

	@Override
	public CartoonModel updateCartoonByname(CartoonModel cartoonModel) {
		// TODO Auto-generated method stub
		return null;
	}

}
