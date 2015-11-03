package org.playwork.fussballfinder.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the user_teams database table.
 * 
 */
@Entity
@Table(name="user_teams")
@NamedQuery(name="UserTeam.findAll", query="SELECT u FROM UserTeam u")
public class UserTeam implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;

	@Column(name="team_id", nullable=false)
	private int teamId;

	@Column(name="user_id", nullable=false)
	private int userId;

	//bi-directional many-to-one association to TeamOfficer
	@OneToMany(mappedBy="userTeam")
	private List<TeamOfficer> teamOfficers;

	public UserTeam() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getTeamId() {
		return this.teamId;
	}

	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}

	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public List<TeamOfficer> getTeamOfficers() {
		return this.teamOfficers;
	}

	public void setTeamOfficers(List<TeamOfficer> teamOfficers) {
		this.teamOfficers = teamOfficers;
	}

	public TeamOfficer addTeamOfficer(TeamOfficer teamOfficer) {
		getTeamOfficers().add(teamOfficer);
		teamOfficer.setUserTeam(this);

		return teamOfficer;
	}

	public TeamOfficer removeTeamOfficer(TeamOfficer teamOfficer) {
		getTeamOfficers().remove(teamOfficer);
		teamOfficer.setUserTeam(null);

		return teamOfficer;
	}

}