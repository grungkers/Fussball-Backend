package org.playwork.fussballfinder.rest.controller;

import java.util.Collection;

import org.playwork.fussballfinder.entity.User;
import org.playwork.fussballfinder.repository.LoginRepository;
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
