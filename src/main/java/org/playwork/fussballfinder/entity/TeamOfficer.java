package org.playwork.fussballfinder.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the team_officers database table.
 * 
 */
@Entity
@Table(name="team_officers")
@NamedQuery(name="TeamOfficer.findAll", query="SELECT t FROM TeamOfficer t")
public class TeamOfficer implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	//bi-directional many-to-one association to TeamRole
	@ManyToOne
	@JoinColumn(name="role_id")
	private TeamRole teamRole;

	//bi-directional many-to-one association to Team
	@ManyToOne
	private Team team;

	//bi-directional many-to-one association to User
	@ManyToOne
	private User user;

	public TeamOfficer() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public TeamRole getTeamRole() {
		return this.teamRole;
	}

	public void setTeamRole(TeamRole teamRole) {
		this.teamRole = teamRole;
	}

	public Team getTeam() {
		return this.team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}