package com.pizzaday.Registration.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pizzaday.Registration.model.RegistrationModel;

public interface RegistrationRepository extends JpaRepository<RegistrationModel , Integer> {

 public	RegistrationModel findByEmailId(String emailId);
 public RegistrationModel findUserByEmailIdAndPassword(String emailId , String password);

}
