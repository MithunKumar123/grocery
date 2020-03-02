package com.grocery.demo.service.signup;

import org.springframework.stereotype.Service;

@Service
public class SignupServiceImpl implements SignupService {

	@Override
	public String createUser() {
		return "created";
	}

}
