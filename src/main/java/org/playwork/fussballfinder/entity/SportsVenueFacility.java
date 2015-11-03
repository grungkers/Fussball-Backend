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
	private int id;

	private String values;

	//bi-directional many-to-one association to SportsVenue
	@ManyToOne
	@JoinColumn(name="sports_venue_id")
	private SportsVenue sportsVenue;

	public SportsVenueFacility() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getValues() {
		return this.values;
	}

	public void setValues(String values) {
		this.values = values;
	}

	public SportsVenue getSportsVenue() {
		return this.sportsVenue;
	}

	public void setSportsVenue(SportsVenue sportsVenue) {
		this.sportsVenue = sportsVenue;
	}

}