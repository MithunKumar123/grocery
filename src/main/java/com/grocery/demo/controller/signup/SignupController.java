package com.grocery.demo.controller.signup;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grocery.demo.service.signup.SignupService;


@RestController
@RequestMapping("/signup")
public class SignupController {
	
	@Autowired
	SignupService service;
	
	@GetMapping(value = "/create")
	public String create() {
		return service.createUser();
	}

}
