package org.playwork.fussballfinder.repository;

import java.util.Collection;

import org.playwork.fussballfinder.entity.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.PathVariable;

public interface TeamRepository extends JpaRepository<Team, Long>{
	
	@Query("select t from Team t where t.users = ?1")
	public Collection<Team> getUserTeamsByUsername(@PathVariable String userId);
}
