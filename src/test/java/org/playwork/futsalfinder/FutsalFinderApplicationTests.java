package org.playwork.futsalfinder;

import javax.annotation.PostConstruct;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.playwork.fussballfinder.FutsalFinderApplication;
import org.playwork.fussballfinder.entity.User;
import org.playwork.fussballfinder.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = FutsalFinderApplication.class)
@WebAppConfiguration
public class FutsalFinderApplicationTests {
	@Autowired
	UserRepository userRepository;
	@Test
	public void contextLoads() {
		for(User user:userRepository.findAll()){
			System.out.println(user.getUsername());
		}
		
	}
	
	@PostConstruct
	public void initIt() throws Exception {
	  System.out.println("Init method");
	}
}
