package org.playwork.fussballfinder.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the sports_venues_locations database table.
 * 
 */
@Entity
@Table(name="sports_venues_locations")
@NamedQuery(name="SportsVenuesLocation.findAll", query="SELECT s FROM SportsVenuesLocation s")
public class SportsVenuesLocation implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;

	@Column(nullable=false, length=255)
	private String address;

	@Column(nullable=false)
	private float latitude;

	@Column(nullable=false)
	private float longitude;

	@Column(name="sports_venue_id", nullable=false)
	private int sportsVenueId;

	public SportsVenuesLocation() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public float getLatitude() {
		return this.latitude;
	}

	public void setLatitude(float latitude) {
		this.latitude = latitude;
	}

	public float getLongitude() {
		return this.longitude;
	}

	public void setLongitude(float longitude) {
		this.longitude = longitude;
	}

	public int getSportsVenueId() {
		return this.sportsVenueId;
	}

	public void setSportsVenueId(int sportsVenueId) {
		this.sportsVenueId = sportsVenueId;
	}

}