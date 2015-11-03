package org.playwork.fussballfinder;

<<<<<<< HEAD
import java.util.Date;

import javax.annotation.PostConstruct;

import org.playwork.fussballfinder.entity.Team;
import org.playwork.fussballfinder.entity.User;
import org.playwork.fussballfinder.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
@EnableAutoConfiguration
@SpringBootApplication
public class FutsalFinderApplication {
	
	@Autowired
	UserRepository userRepository;

    public static void main(String[] args) {
        SpringApplication.run(FutsalFinderApplication.class, args);
    }
    @PostConstruct
	public void initIt() throws Exception {
	  System.out.println("Init method");
	  User userAdmin = new User();
	  userAdmin.setEmail("test@test.com");
	  userAdmin.setUsername("admin");
	  userAdmin.setBlock(new Byte("0"));
	  userAdmin.setLastvisitDate(new Date());
	  userAdmin.setRegisterDate(new Date());
	  userAdmin.setProfileImgId(0);
	  userAdmin.setResetCount(0);
	  userAdmin.setPassword("admin");
	  
	  userAdmin =  userRepository.save(userAdmin);
	 
	  Team testTeam1 = new Team();
	  testTeam1.setName("Team A");
	  testTeam1.setAddress("Jln AKhirat");
	  testTeam1.setCreatedDate(new Date());
	}
=======
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
@EnableAutoConfiguration
@SpringBootApplication
public class FutsalFinderApplication {

    public static void main(String[] args) {
        SpringApplication.run(FutsalFinderApplication.class, args);
    }
   
>>>>>>> branch 'master' of https://github.com/grungkers/Fussball-Backend
    
}


