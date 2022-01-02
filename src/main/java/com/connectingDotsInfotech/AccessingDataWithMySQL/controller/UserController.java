package com.connectingDotsInfotech.AccessingDataWithMySQL.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.connectingDotsInfotech.AccessingDataWithMySQL.domain.User;
import com.connectingDotsInfotech.AccessingDataWithMySQL.repoistory.UserRepository;

@Controller // This means that this class is a Controller
@RequestMapping(path = "/user")
public class UserController {

	@Autowired // This means to get the bean called userRepository
	private UserRepository userRepository;

	@RequestMapping(path = "/add", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<User> addNewUser(@RequestBody User user) {
		User response = userRepository.save(user);
		return new ResponseEntity<User>(response, HttpStatus.ACCEPTED);
	}

	@GetMapping(path = "/all")
	public ResponseEntity<List<User>> getAllUsers() { // Respon.. is a good prac, it gives u control
		List<User> result = userRepository.findAll();
		return new ResponseEntity<>(result, HttpStatus.OK);
	}

//	@RequestMapping(path = "/update", method = RequestMethod.PATCH, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
//	public ResponseEntity<User> updateExisitingUser(@RequestBody User user) {
//		// write logic below this
//
//		User user1 = null;
//		return new ResponseEntity<User>(user1, HttpStatus.ACCEPTED);
//	}

	@RequestMapping(value = "/delete", method = RequestMethod.DELETE)
	public ResponseEntity<String> delete(@RequestParam Integer id) {
		userRepository.deleteUser(id);
		return new ResponseEntity<String>("Sucessfully Deleted.", HttpStatus.OK);
	}

}