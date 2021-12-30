package com.connectingDotsInfotech.AccessingDataWithMySQL.repoistory;

import org.springframework.beans.factory.annotation.Autowired;

import com.connectingDotsInfotech.AccessingDataWithMySQL.domain.User;

public class UserRepositoryImpl implements UserRepositoryCustom {

	@Autowired
	private UserRepository userRepository;

	@Override
	public void deleteUser(Integer id) {
		// TODO Auto-generated method stub
		//userRepository.deleteById(id);

	}
//
//	@Override
//	public User updateUser(User user) {
//		// Validation
//		// Find User by ID
//		// set I/P user data to the Object fetch from db
//		// save the object to db
//
//		return null;
//	}

}
