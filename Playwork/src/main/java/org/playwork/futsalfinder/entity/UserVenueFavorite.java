package org.playwork.futsalfinder.entity;

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
	private int id;

	//bi-directional many-to-one association to SportsVenue
	@ManyToOne
	@JoinColumn(name="sports_venue_id")
	private SportsVenue sportsVenue;

	//bi-directional many-to-one association to User
	@ManyToOne
	private User user;

	public UserVenueFavorite() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public SportsVenue getSportsVenue() {
		return this.sportsVenue;
	}

	public void setSportsVenue(SportsVenue sportsVenue) {
		this.sportsVenue = sportsVenue;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}