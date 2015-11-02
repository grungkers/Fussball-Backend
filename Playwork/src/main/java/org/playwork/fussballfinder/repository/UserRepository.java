package org.playwork.fussballfinder.repository;

import java.util.List;

import org.playwork.fussballfinder.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long>{
	
	public List<User> findByUsernameAndPassword(String username, String password);
	public User findByUsername(String username);
}
