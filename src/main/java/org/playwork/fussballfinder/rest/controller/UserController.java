package org.playwork.fussballfinder.rest.controller;

import java.util.Collection;

import javax.validation.Valid;

import org.playwork.fussballfinder.entity.User;
import org.playwork.fussballfinder.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/users")
public class UserController {
	@Autowired
	UserRepository userRepository;
	
	@RequestMapping(value="/{userId}", method=RequestMethod.GET)
    public User getUser(@PathVariable Long userId) {
        return userRepository.findOne(userId);
    }
	
	@RequestMapping(value = "/add", method = RequestMethod.POST)
    public User createUser(@RequestBody @Valid final User user) {
        return userRepository.save(user);
    }

    @RequestMapping(value="/{user}", method=RequestMethod.DELETE)
    public void deleteUser(@PathVariable Long user) {
    	userRepository.delete(user);
    }
    
    //TODO: We will not use this method anyway, use paging instead
    @RequestMapping(method = RequestMethod.GET)
    public Collection<User> findAll() {
    	return userRepository.findAll();
    }

}
