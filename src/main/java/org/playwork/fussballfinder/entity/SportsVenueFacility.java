package org.playwork.fussballfinder.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the sports_venue_facilities database table.
 * 
 */
@Entity
@Table(name="sports_venue_facilities")
@NamedQuery(name="SportsVenueFacility.findAll", query="SELECT s FROM SportsVenueFacility s")
public class SportsVenueFacility implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;

	@Column(name="sports_venue_id", nullable=false)
	private int sportsVenueId;

	@Column(nullable=false, length=50)
	private String values;

	public SportsVenueFacility() {
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

	public String getValues() {
		return this.values;
	}

	public void setValues(String values) {
		this.values = values;
	}

}