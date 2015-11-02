package org.playwork.futsalfinder.entity;

import java.io.Serializable;
import javax.persistence.*;


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
	private int id;

	//bi-directional many-to-one association to Team
	@ManyToOne
	private Team team;

	//bi-directional many-to-one association to User
	@ManyToOne
	private User user;

	public UserTeam() {
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