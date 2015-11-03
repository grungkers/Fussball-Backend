package org.playwork.fussballfinder.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the user_venue_favorites database table.
 * 
 */
@Entity
@Table(name="user_venue_favorites")
@NamedQuery(name="UserVenueFavorite.findAll", query="SELECT u FROM UserVenueFavorite u")
public class UserVenueFavorite implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;

	@Column(name="sports_venue_id", nullable=false)
	private int sportsVenueId;

	@Column(name="user_id", nullable=false)
	private int userId;

	public UserVenueFavorite() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSportsVenueId() {
		return this.sportsVenueId;
	}

	public void setSportsVenueId(int sportsVenueId) {
		this.sportsVenueId = sportsVenueId;
	}

	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

}