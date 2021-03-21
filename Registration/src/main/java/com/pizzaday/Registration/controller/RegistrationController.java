package com.pizzaday.Registration.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.pizzaday.Registration.model.RegistrationModel;
import com.pizzaday.Registration.service.RegistrationService;

@RestController
public class RegistrationController {
	
	@Autowired
	private RegistrationService service;
	
	@PostMapping("/registeruser")
	@CrossOrigin(origins="http://localhost:4200")
	public RegistrationModel registerUser(@RequestBody RegistrationModel user) throws Exception {
		String tempEmailId = user.getEmailId();
		if(tempEmailId !=null && !"".equals(tempEmailId)) {
			RegistrationModel userobj = service.fetchUserByEmailId(tempEmailId);
			if (userobj !=null){
				throw new Exception("User with "+tempEmailId+" already exists");
			}
		}
		RegistrationModel userobj = null;
		userobj = service.saveUser(user);
		return userobj;
	}
	
	
	@PostMapping("/login")
	@CrossOrigin(origins="http://localhost:4200")
	public RegistrationModel loginUser(@RequestBody RegistrationModel user) throws Exception {
		String tempEmailId = user.getEmailId();
		String tempPassword = user.getPassword();
		RegistrationModel userobj = null;
		if(tempEmailId !=null && tempPassword !=null) {
			userobj = service.fetchUserByEmailIdAndPassword(tempEmailId, tempPassword);
		}
		if(userobj == null) {
			throw new Exception("Bad Credentials");
		}
		return userobj;
	}
	
	
	
	@GetMapping("/getusername")	
	@CrossOrigin(origins="http://localhost:4200")
	public List<RegistrationModel> getusername() {
	  return service.getUsername();
	}	
	

	
}
