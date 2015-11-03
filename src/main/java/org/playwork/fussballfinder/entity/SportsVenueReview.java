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
	@Column(unique=true, nullable=false)
	private int id;

	@Lob
	@Column(nullable=false)
	private String comment;

	@Column(name="sports_venue_id", nullable=false)
	private int sportsVenueId;

	@Column(name="user_id", nullable=false)
	private int userId;

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