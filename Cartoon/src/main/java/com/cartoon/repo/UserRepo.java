package com.cartoon.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cartoon.model.UserModel;

public interface UserRepo extends JpaRepository<UserModel, Long> {
	UserModel findByUserEmail(String userEmail);
}
