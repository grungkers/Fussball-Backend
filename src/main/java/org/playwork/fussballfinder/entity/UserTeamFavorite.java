package org.playwork.fussballfinder.entity;

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
	@Column(unique=true, nullable=false)
	private int id;

	@Column(name="team_id", nullable=false)
	private int teamId;

	@Column(name="user_id", nullable=false)
	private int userId;

	public UserTeamFavorite() {
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

}