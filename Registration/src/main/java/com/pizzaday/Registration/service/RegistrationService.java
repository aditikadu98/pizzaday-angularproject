package com.pizzaday.Registration.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pizzaday.Registration.model.RegistrationModel;
import com.pizzaday.Registration.repository.RegistrationRepository;

@Service
public class RegistrationService {

	@Autowired
	private RegistrationRepository repo;

	public RegistrationModel saveUser(RegistrationModel user) {
		return repo.save(user);
	}

	public RegistrationModel fetchUserByEmailId(String email) {
		return repo.findByEmailId(email);
	}

	public RegistrationModel fetchUserByEmailIdAndPassword(String email, String password) {
		return repo.findUserByEmailIdAndPassword(email, password);
	}
	public List<RegistrationModel> getUsername() {
		return repo.findAll();
	}
}
