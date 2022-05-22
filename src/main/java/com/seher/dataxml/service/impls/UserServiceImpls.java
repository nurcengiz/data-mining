package com.seher.dataxml.service.impls;

import org.springframework.stereotype.Service;

import com.seher.dataxml.model.User;
import com.seher.dataxml.repository.UserRepository;
import com.seher.dataxml.service.UserService;
import com.seher.dataxml.service.requests.RegisterRequest;

@Service
public class UserServiceImpls implements UserService {

	private UserRepository repo;

	public UserServiceImpls(UserRepository repo) {
		this.repo = repo;
	}

	@Override
	public boolean register(RegisterRequest registerRequest) {

		User user = new User();

		user.setEmail(registerRequest.getEmail());

		user.setPassword(registerRequest.getPassword());

		this.repo.save(user);

		return true;
	}

	@Override
	public boolean login(RegisterRequest registerRequest) {

		return this.repo.existsByEmailAndPassword(registerRequest.getEmail(), registerRequest.getPassword());

	}

}
