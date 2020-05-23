package com.lsonetwork.controllers;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Positive;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lsonetwork.models.User;
import com.lsonetwork.models.UserDTO;
import com.lsonetwork.services.UserService;

@RestController
@RequestMapping("/users")
@CrossOrigin
@Validated
public class UserController {

	@Autowired
	private UserService userService;
	
	@GetMapping
	public ResponseEntity<List<User>> getUsers(
			//Prevents SQL and HTML injection by blocking <> and ;.
			@Pattern(regexp="[a-zA-Z0-9]+", message="Username may only have letters and numbers.")
			@RequestParam(name="username", required=false)
			String username
			
		) {
		
		if(username != null) {
			List<User> users = userService.getUserByUsername(username);
			return ResponseEntity.ok(users);
		}
		
		List<User> users = userService.getUsers();
		return ResponseEntity.ok(users);
	}
	
	
	@GetMapping("/id")
	public ResponseEntity<User> getUserById(@Positive @PathVariable("id") int id){
		Optional<User> user = userService.getUserById(id);
		return user.map(value -> ResponseEntity.ok().body(value))
				.orElseGet(() -> ResponseEntity.notFound().build());
	}
	
	@PostMapping
	public ResponseEntity<User> addUser(@Valid @RequestBody UserDTO userDTO) {
		User user = new User(userDTO);
		return ResponseEntity.status(HttpStatus.CREATED).body(userService.addUser(user));
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<UserDTO> updateUser(@Valid @RequestBody UserDTO userDTO, @PathVariable String id) {
		User user = new User(userDTO);
		return ResponseEntity.ok(new UserDTO(userService.updateUser(user)));
	}
	
	@DeleteMapping("/{id}")
	public void deleteUserById(@Positive @PathVariable("id") int id) {
		 userService.deleteUserById(id);
	}
}
