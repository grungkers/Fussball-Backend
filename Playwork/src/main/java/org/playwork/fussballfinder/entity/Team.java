package org.playwork.fussballfinder.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the teams database table.
 * 
 */
@Entity
@Table(name="teams")
@NamedQuery(name="Team.findAll", query="SELECT t FROM Team t")
public class Team implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	private String address;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="created_date")
	private Date createdDate;

	private float latitude;

	private float longitude;

	private String name;

	//bi-directional many-to-one association to Event
	@OneToMany(mappedBy="team", fetch=FetchType.EAGER)
	private List<Event> events;

	//bi-directional many-to-one association to TeamLocation
	@OneToMany(mappedBy="team", fetch=FetchType.EAGER)
	private List<TeamLocation> teamLocations;

	//bi-directional many-to-one association to TeamOfficer
	@OneToMany(mappedBy="team", fetch=FetchType.EAGER)
	private List<TeamOfficer> teamOfficers;

	//bi-directional many-to-one association to TeamPhotoAlbum
	@OneToMany(mappedBy="team", fetch=FetchType.EAGER)
	private List<TeamPhotoAlbum> teamPhotoAlbums;

	//bi-directional many-to-one association to TeamPhoto
	@OneToMany(mappedBy="team", fetch=FetchType.EAGER)
	private List<TeamPhoto> teamPhotos;

	//bi-directional many-to-one association to TeamRating
	@OneToMany(mappedBy="team", fetch=FetchType.EAGER)
	private List<TeamRating> teamRatings;

	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name="created_by")
	private User user;

	//bi-directional many-to-one association to UserTeamFavorite
	@OneToMany(mappedBy="team", fetch=FetchType.EAGER)
	private List<UserTeamFavorite> userTeamFavorites;

	//bi-directional many-to-one association to UserTeam
	@OneToMany(mappedBy="team", fetch=FetchType.EAGER)
	private List<UserTeam> userTeams;

	public Team() {
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

	public Date getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
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

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Event> getEvents() {
		return this.events;
	}

	public void setEvents(List<Event> events) {
		this.events = events;
	}

	public Event addEvent(Event event) {
		getEvents().add(event);
		event.setTeam(this);

		return event;
	}

	public Event removeEvent(Event event) {
		getEvents().remove(event);
		event.setTeam(null);

		return event;
	}

	public List<TeamLocation> getTeamLocations() {
		return this.teamLocations;
	}

	public void setTeamLocations(List<TeamLocation> teamLocations) {
		this.teamLocations = teamLocations;
	}

	public TeamLocation addTeamLocation(TeamLocation teamLocation) {
		getTeamLocations().add(teamLocation);
		teamLocation.setTeam(this);

		return teamLocation;
	}

	public TeamLocation removeTeamLocation(TeamLocation teamLocation) {
		getTeamLocations().remove(teamLocation);
		teamLocation.setTeam(null);

		return teamLocation;
	}

	public List<TeamOfficer> getTeamOfficers() {
		return this.teamOfficers;
	}

	public void setTeamOfficers(List<TeamOfficer> teamOfficers) {
		this.teamOfficers = teamOfficers;
	}

	public TeamOfficer addTeamOfficer(TeamOfficer teamOfficer) {
		getTeamOfficers().add(teamOfficer);
		teamOfficer.setTeam(this);

		return teamOfficer;
	}

	public TeamOfficer removeTeamOfficer(TeamOfficer teamOfficer) {
		getTeamOfficers().remove(teamOfficer);
		teamOfficer.setTeam(null);

		return teamOfficer;
	}

	public List<TeamPhotoAlbum> getTeamPhotoAlbums() {
		return this.teamPhotoAlbums;
	}

	public void setTeamPhotoAlbums(List<TeamPhotoAlbum> teamPhotoAlbums) {
		this.teamPhotoAlbums = teamPhotoAlbums;
	}

	public TeamPhotoAlbum addTeamPhotoAlbum(TeamPhotoAlbum teamPhotoAlbum) {
		getTeamPhotoAlbums().add(teamPhotoAlbum);
		teamPhotoAlbum.setTeam(this);

		return teamPhotoAlbum;
	}

	public TeamPhotoAlbum removeTeamPhotoAlbum(TeamPhotoAlbum teamPhotoAlbum) {
		getTeamPhotoAlbums().remove(teamPhotoAlbum);
		teamPhotoAlbum.setTeam(null);

		return teamPhotoAlbum;
	}

	public List<TeamPhoto> getTeamPhotos() {
		return this.teamPhotos;
	}

	public void setTeamPhotos(List<TeamPhoto> teamPhotos) {
		this.teamPhotos = teamPhotos;
	}

	public TeamPhoto addTeamPhoto(TeamPhoto teamPhoto) {
		getTeamPhotos().add(teamPhoto);
		teamPhoto.setTeam(this);

		return teamPhoto;
	}

	public TeamPhoto removeTeamPhoto(TeamPhoto teamPhoto) {
		getTeamPhotos().remove(teamPhoto);
		teamPhoto.setTeam(null);

		return teamPhoto;
	}

	public List<TeamRating> getTeamRatings() {
		return this.teamRatings;
	}

	public void setTeamRatings(List<TeamRating> teamRatings) {
		this.teamRatings = teamRatings;
	}

	public TeamRating addTeamRating(TeamRating teamRating) {
		getTeamRatings().add(teamRating);
		teamRating.setTeam(this);

		return teamRating;
	}

	public TeamRating removeTeamRating(TeamRating teamRating) {
		getTeamRatings().remove(teamRating);
		teamRating.setTeam(null);

		return teamRating;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<UserTeamFavorite> getUserTeamFavorites() {
		return this.userTeamFavorites;
	}

	public void setUserTeamFavorites(List<UserTeamFavorite> userTeamFavorites) {
		this.userTeamFavorites = userTeamFavorites;
	}

	public UserTeamFavorite addUserTeamFavorite(UserTeamFavorite userTeamFavorite) {
		getUserTeamFavorites().add(userTeamFavorite);
		userTeamFavorite.setTeam(this);

		return userTeamFavorite;
	}

	public UserTeamFavorite removeUserTeamFavorite(UserTeamFavorite userTeamFavorite) {
		getUserTeamFavorites().remove(userTeamFavorite);
		userTeamFavorite.setTeam(null);

		return userTeamFavorite;
	}

	public List<UserTeam> getUserTeams() {
		return this.userTeams;
	}

	public void setUserTeams(List<UserTeam> userTeams) {
		this.userTeams = userTeams;
	}

	public UserTeam addUserTeam(UserTeam userTeam) {
		getUserTeams().add(userTeam);
		userTeam.setTeam(this);

		return userTeam;
	}

	public UserTeam removeUserTeam(UserTeam userTeam) {
		getUserTeams().remove(userTeam);
		userTeam.setTeam(null);

		return userTeam;
	}

}