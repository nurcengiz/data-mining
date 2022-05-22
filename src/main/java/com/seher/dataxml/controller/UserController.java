package com.seher.dataxml.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.seher.dataxml.service.UserService;
import com.seher.dataxml.service.requests.RegisterRequest;

@RestController
@RequestMapping("/api/user")
public class UserController {
	
	private UserService userService;
	
	@PostMapping("/register")
	public boolean register(@RequestBody RegisterRequest registerRequest) {
		return this.userService.register(registerRequest);
	}
	
	@PostMapping("/login")
	public boolean login(@RequestBody RegisterRequest registerRequest)
	{
		return this.userService.login(registerRequest);
	}

	public UserController(UserService userService) {
		super();
		this.userService = userService;
	}

}
