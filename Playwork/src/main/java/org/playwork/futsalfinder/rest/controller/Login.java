package org.playwork.futsalfinder.rest.controller;

import java.util.Collection;

import org.playwork.futsalfinder.entity.User;
import org.playwork.futsalfinder.repository.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Login {
	@Autowired
	LoginRepository loginRepository;
	
	@RequestMapping("/login")
    public Collection<User> index() {
        return loginRepository.findAll();
    }
	
	

}
