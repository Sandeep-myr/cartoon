package com.cartoon.serviceImpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.cartoon.model.UserModel;
import com.cartoon.repo.UserRepo;
import com.cartoon.service.UserService;

@Service

public class UserServiceImpl implements UserService {
	@Autowired
	UserRepo repo;

	@Override
	public ResponseEntity<UserModel> registerUser(UserModel model) {
		if (repo.findByUserEmail(model.getUserEmail()) == null) {
			repo.save(model);
			return ResponseEntity.ok(model);
		} else
			return null;
	}

	@Override
	public ResponseEntity<List<UserModel>> getAllUserDetails() {

		return ResponseEntity.ok(repo.findAll());
	}

	@Override
	public ResponseEntity<UserModel> getUserDetails(Long id) {

		return ResponseEntity.ok(repo.findById(id).get());
	}

	@Override
	public ResponseEntity<UserModel> updateUser(UserModel model) {

		if (repo.findById(model.getUserId()) != null) {
			return ResponseEntity.ok(repo.save(model));
		}
		return null;
	}

	@Override
	public String deleteUserByEmail(String email) {
		if (repo.findByUserEmail(email) != null) {
			Long id = repo.findByUserEmail(email).getUserId();

			repo.deleteById(id);
			return "User Deleted Successfully";
		}
		return "No User Found";
	}

}
