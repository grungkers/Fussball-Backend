package org.playwork.fussballfinder.rest.controller;

import java.util.Collection;

import org.playwork.fussballfinder.entity.User;
import org.playwork.fussballfinder.repository.UserRepository;
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
	
	@RequestMapping(value="/{userId}", method=RequestMethod.GET)
    public User getUser(@PathVariable Long userId) {
        return userRepository.findOne(userId);
    }

//    @RequestMapping(value="/{user}/customers", method=RequestMethod.GET)
//    List<Customer> getUserCustomers(@PathVariable Long user) {
//        // ...
//    }

    @RequestMapping(value="/{user}", method=RequestMethod.DELETE)
    public User deleteUser(@PathVariable int user) {
    	return new User();
    }
    		
    @RequestMapping(method = RequestMethod.GET)
    public Collection<User> findAll() {
    	System.out.println("aha");
        return userRepository.findAll();
    }

}
