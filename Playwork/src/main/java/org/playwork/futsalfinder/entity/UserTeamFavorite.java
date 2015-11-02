package org.playwork.futsalfinder.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the user_team_favorites database table.
 * 
 */
@Entity
@Table(name="user_team_favorites")
@NamedQuery(name="UserTeamFavorite.findAll", query="SELECT u FROM UserTeamFavorite u")
public class UserTeamFavorite implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	//bi-directional many-to-one association to Team
	@ManyToOne
	private Team team;

	//bi-directional many-to-one association to User
	@ManyToOne
	private User user;

	public UserTeamFavorite() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
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