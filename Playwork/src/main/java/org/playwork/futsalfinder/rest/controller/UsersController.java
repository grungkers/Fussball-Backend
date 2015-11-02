package org.playwork.futsalfinder.rest.controller;

import java.util.Collection;

import org.playwork.futsalfinder.entity.User;
import org.playwork.futsalfinder.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/users")
public class UsersController {
	@Autowired
	UserRepository userRepository;
	
	@RequestMapping(value="/{user}", method=RequestMethod.GET)
    public User getUser(@PathVariable int user) {
        return new User();
    }

//    @RequestMapping(value="/{user}/customers", method=RequestMethod.GET)
//    List<Customer> getUserCustomers(@PathVariable Long user) {
//        // ...
//    }

    @RequestMapping(value="/{user}", method=RequestMethod.DELETE)
    public User deleteUser(@PathVariable int user) {
    	return new User();
    }
    		
//    @RequestMapping("/login")
//    public Collection<User> index() {
//        return userRepository.findByUsername(username);
//    }

}
