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
	@Column(unique=true, nullable=false)
	private int id;

	@Column(name="team_id", nullable=false)
	private int teamId;

	//bi-directional many-to-one association to UserTeam
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="user_teams_id", nullable=false)
	private UserTeam userTeam;

	public TeamOfficer() {
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

	public UserTeam getUserTeam() {
		return this.userTeam;
	}

	public void setUserTeam(UserTeam userTeam) {
		this.userTeam = userTeam;
	}

}