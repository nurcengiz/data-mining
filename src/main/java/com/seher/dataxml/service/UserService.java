package com.seher.dataxml.service;

import com.seher.dataxml.service.requests.RegisterRequest;

public interface UserService {
	
	
	boolean register(RegisterRequest registerRequest);
	
	boolean login(RegisterRequest registerRequest);

}
