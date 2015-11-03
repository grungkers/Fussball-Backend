package org.playwork.fussballfinder.repository;

import java.util.List;

import org.playwork.fussballfinder.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoginRepository extends JpaRepository<User, Long>{
	
	List<User> findByUsernameAndPassword(String username, String password);

}
