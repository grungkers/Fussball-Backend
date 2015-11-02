package org.playwork.fussballfinder.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the sports_venue_reviews database table.
 * 
 */
@Entity
@Table(name="sports_venue_reviews")
@NamedQuery(name="SportsVenueReview.findAll", query="SELECT s FROM SportsVenueReview s")
public class SportsVenueReview implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	@Lob
	private String comment;

	//bi-directional many-to-one association to SportsVenue
	@ManyToOne
	@JoinColumn(name="sports_venue_id")
	private SportsVenue sportsVenue;

	//bi-directional many-to-one association to User
	@ManyToOne
	private User user;

	public SportsVenueReview() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getComment() {
		return this.comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
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