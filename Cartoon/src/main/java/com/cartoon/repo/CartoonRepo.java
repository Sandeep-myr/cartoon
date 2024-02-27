package com.cartoon.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cartoon.model.CartoonModel;

@Repository
public interface CartoonRepo extends JpaRepository<CartoonModel, Long> {
	CartoonModel findByCartoonName(String cartoonName);
	
	

}
