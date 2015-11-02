package org.playwork.futsalfinder.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the sports_venues database table.
 * 
 */
@Entity
@Table(name="sports_venues")
@NamedQuery(name="SportsVenue.findAll", query="SELECT s FROM SportsVenue s")
public class SportsVenue implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="created_date")
	private Date createdDate;

	@Column(name="is_featured")
	private byte isFeatured;

	private int name;

	private String owner;

	//bi-directional many-to-one association to Event
	@OneToMany(mappedBy="sportsVenue", fetch=FetchType.EAGER)
	private List<Event> events;

	//bi-directional many-to-one association to Field
	@OneToMany(mappedBy="sportsVenue", fetch=FetchType.EAGER)
	private List<Field> fields;

	//bi-directional many-to-one association to SportsVenueFacility
	@OneToMany(mappedBy="sportsVenue", fetch=FetchType.EAGER)
	private List<SportsVenueFacility> sportsVenueFacilities;

	//bi-directional many-to-one association to SportsVenueReview
	@OneToMany(mappedBy="sportsVenue", fetch=FetchType.EAGER)
	private List<SportsVenueReview> sportsVenueReviews;

	//bi-directional many-to-one association to SportsVenuesLocation
	@OneToMany(mappedBy="sportsVenue", fetch=FetchType.EAGER)
	private List<SportsVenuesLocation> sportsVenuesLocations;

	//bi-directional many-to-one association to UserVenueFavorite
	@OneToMany(mappedBy="sportsVenue", fetch=FetchType.EAGER)
	private List<UserVenueFavorite> userVenueFavorites;

	public SportsVenue() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public byte getIsFeatured() {
		return this.isFeatured;
	}

	public void setIsFeatured(byte isFeatured) {
		this.isFeatured = isFeatured;
	}

	public int getName() {
		return this.name;
	}

	public void setName(int name) {
		this.name = name;
	}

	public String getOwner() {
		return this.owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public List<Event> getEvents() {
		return this.events;
	}

	public void setEvents(List<Event> events) {
		this.events = events;
	}

	public Event addEvent(Event event) {
		getEvents().add(event);
		event.setSportsVenue(this);

		return event;
	}

	public Event removeEvent(Event event) {
		getEvents().remove(event);
		event.setSportsVenue(null);

		return event;
	}

	public List<Field> getFields() {
		return this.fields;
	}

	public void setFields(List<Field> fields) {
		this.fields = fields;
	}

	public Field addField(Field field) {
		getFields().add(field);
		field.setSportsVenue(this);

		return field;
	}

	public Field removeField(Field field) {
		getFields().remove(field);
		field.setSportsVenue(null);

		return field;
	}

	public List<SportsVenueFacility> getSportsVenueFacilities() {
		return this.sportsVenueFacilities;
	}

	public void setSportsVenueFacilities(List<SportsVenueFacility> sportsVenueFacilities) {
		this.sportsVenueFacilities = sportsVenueFacilities;
	}

	public SportsVenueFacility addSportsVenueFacility(SportsVenueFacility sportsVenueFacility) {
		getSportsVenueFacilities().add(sportsVenueFacility);
		sportsVenueFacility.setSportsVenue(this);

		return sportsVenueFacility;
	}

	public SportsVenueFacility removeSportsVenueFacility(SportsVenueFacility sportsVenueFacility) {
		getSportsVenueFacilities().remove(sportsVenueFacility);
		sportsVenueFacility.setSportsVenue(null);

		return sportsVenueFacility;
	}

	public List<SportsVenueReview> getSportsVenueReviews() {
		return this.sportsVenueReviews;
	}

	public void setSportsVenueReviews(List<SportsVenueReview> sportsVenueReviews) {
		this.sportsVenueReviews = sportsVenueReviews;
	}

	public SportsVenueReview addSportsVenueReview(SportsVenueReview sportsVenueReview) {
		getSportsVenueReviews().add(sportsVenueReview);
		sportsVenueReview.setSportsVenue(this);

		return sportsVenueReview;
	}

	public SportsVenueReview removeSportsVenueReview(SportsVenueReview sportsVenueReview) {
		getSportsVenueReviews().remove(sportsVenueReview);
		sportsVenueReview.setSportsVenue(null);

		return sportsVenueReview;
	}

	public List<SportsVenuesLocation> getSportsVenuesLocations() {
		return this.sportsVenuesLocations;
	}

	public void setSportsVenuesLocations(List<SportsVenuesLocation> sportsVenuesLocations) {
		this.sportsVenuesLocations = sportsVenuesLocations;
	}

	public SportsVenuesLocation addSportsVenuesLocation(SportsVenuesLocation sportsVenuesLocation) {
		getSportsVenuesLocations().add(sportsVenuesLocation);
		sportsVenuesLocation.setSportsVenue(this);

		return sportsVenuesLocation;
	}

	public SportsVenuesLocation removeSportsVenuesLocation(SportsVenuesLocation sportsVenuesLocation) {
		getSportsVenuesLocations().remove(sportsVenuesLocation);
		sportsVenuesLocation.setSportsVenue(null);

		return sportsVenuesLocation;
	}

	public List<UserVenueFavorite> getUserVenueFavorites() {
		return this.userVenueFavorites;
	}

	public void setUserVenueFavorites(List<UserVenueFavorite> userVenueFavorites) {
		this.userVenueFavorites = userVenueFavorites;
	}

	public UserVenueFavorite addUserVenueFavorite(UserVenueFavorite userVenueFavorite) {
		getUserVenueFavorites().add(userVenueFavorite);
		userVenueFavorite.setSportsVenue(this);

		return userVenueFavorite;
	}

	public UserVenueFavorite removeUserVenueFavorite(UserVenueFavorite userVenueFavorite) {
		getUserVenueFavorites().remove(userVenueFavorite);
		userVenueFavorite.setSportsVenue(null);

		return userVenueFavorite;
	}

}