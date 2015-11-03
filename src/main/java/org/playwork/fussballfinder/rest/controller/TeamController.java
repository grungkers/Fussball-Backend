package org.playwork.fussballfinder.rest.controller;

import java.util.Collection;

import javax.validation.Valid;

import org.playwork.fussballfinder.entity.Team;
import org.playwork.fussballfinder.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeamController {
	@Autowired
	TeamRepository teamRepository;
	
	@RequestMapping(value="/teams/{teamId}", method=RequestMethod.GET)
    public Team getTeam(@PathVariable Long teamId) {
        return teamRepository.findOne(teamId);
    }
	
	@RequestMapping(value = "/teams/add", method = RequestMethod.POST)
    public Team createTeam(@RequestBody @Valid final Team team) {
        return teamRepository.save(team);
    }

    @RequestMapping(value="/teams/{teamId}", method=RequestMethod.DELETE)
    public void deleteTeam(@PathVariable Long teamId) {
    	teamRepository.delete(teamId);
    }
    
    @RequestMapping(value="/users/{userId}/teams", method = RequestMethod.GET)
    public Collection<Team> getUserTeams(@PathVariable String userId) {
    	return teamRepository.getUserTeamsByUsername(userId);
    }

}
