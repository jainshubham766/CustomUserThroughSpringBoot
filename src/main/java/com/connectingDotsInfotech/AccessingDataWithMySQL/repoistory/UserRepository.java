package com.connectingDotsInfotech.AccessingDataWithMySQL.repoistory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.connectingDotsInfotech.AccessingDataWithMySQL.domain.User;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

@Repository
public interface UserRepository extends JpaRepository<User, Integer>, UserRepositoryCustom {

	public User findByEmail(String email);
	
}