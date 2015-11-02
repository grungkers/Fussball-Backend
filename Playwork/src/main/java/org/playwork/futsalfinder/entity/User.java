package org.playwork.futsalfinder.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the users database table.
 * 
 */
@Entity
@Table(name="users")
@NamedQuery(name="User.findAll", query="SELECT u FROM User u")
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	private String activation;

	private byte block;

	private String email;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="lastvisit_date")
	private Date lastvisitDate;

	private String password;

	@Column(name="profile_img_id")
	private int profileImgId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="register_date")
	private Date registerDate;

	@Column(name="reset_count")
	private int resetCount;

	private String username;

	//bi-directional many-to-one association to Event
	@OneToMany(mappedBy="user", fetch=FetchType.EAGER)
	private List<Event> events;

	//bi-directional many-to-one association to ParticipantsEvent
	@OneToMany(mappedBy="user", fetch=FetchType.EAGER)
	private List<ParticipantsEvent> participantsEvents;

	//bi-directional many-to-one association to SportsVenueReview
	@OneToMany(mappedBy="user", fetch=FetchType.EAGER)
	private List<SportsVenueReview> sportsVenueReviews;

	//bi-directional many-to-one association to TeamOfficer
	@OneToMany(mappedBy="user", fetch=FetchType.EAGER)
	private List<TeamOfficer> teamOfficers;

	//bi-directional many-to-one association to Team
	@OneToMany(mappedBy="user", fetch=FetchType.EAGER)
	private List<Team> teams;

	//bi-directional many-to-one association to UserPhotoAlbum
	@OneToMany(mappedBy="user", fetch=FetchType.EAGER)
	private List<UserPhotoAlbum> userPhotoAlbums;

	//bi-directional many-to-one association to UserPhoto
	@OneToMany(mappedBy="user", fetch=FetchType.EAGER)
	private List<UserPhoto> userPhotos;

	//bi-directional many-to-one association to UserProfile
	@OneToMany(mappedBy="user", fetch=FetchType.EAGER)
	private List<UserProfile> userProfiles;

	//bi-directional many-to-one association to UserRating
	@OneToMany(mappedBy="user", fetch=FetchType.EAGER)
	private List<UserRating> userRatings;

	//bi-directional many-to-one association to UserTeamFavorite
	@OneToMany(mappedBy="user", fetch=FetchType.EAGER)
	private List<UserTeamFavorite> userTeamFavorites;

	//bi-directional many-to-one association to UserTeam
	@OneToMany(mappedBy="user", fetch=FetchType.EAGER)
	private List<UserTeam> userTeams;

	//bi-directional many-to-one association to UserVenueFavorite
	@OneToMany(mappedBy="user", fetch=FetchType.EAGER)
	private List<UserVenueFavorite> userVenueFavorites;

	public User() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getActivation() {
		return this.activation;
	}

	public void setActivation(String activation) {
		this.activation = activation;
	}

	public byte getBlock() {
		return this.block;
	}

	public void setBlock(byte block) {
		this.block = block;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getLastvisitDate() {
		return this.lastvisitDate;
	}

	public void setLastvisitDate(Date lastvisitDate) {
		this.lastvisitDate = lastvisitDate;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getProfileImgId() {
		return this.profileImgId;
	}

	public void setProfileImgId(int profileImgId) {
		this.profileImgId = profileImgId;
	}

	public Date getRegisterDate() {
		return this.registerDate;
	}

	public void setRegisterDate(Date registerDate) {
		this.registerDate = registerDate;
	}

	public int getResetCount() {
		return this.resetCount;
	}

	public void setResetCount(int resetCount) {
		this.resetCount = resetCount;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public List<Event> getEvents() {
		return this.events;
	}

	public void setEvents(List<Event> events) {
		this.events = events;
	}

	public Event addEvent(Event event) {
		getEvents().add(event);
		event.setUser(this);

		return event;
	}

	public Event removeEvent(Event event) {
		getEvents().remove(event);
		event.setUser(null);

		return event;
	}

	public List<ParticipantsEvent> getParticipantsEvents() {
		return this.participantsEvents;
	}

	public void setParticipantsEvents(List<ParticipantsEvent> participantsEvents) {
		this.participantsEvents = participantsEvents;
	}

	public ParticipantsEvent addParticipantsEvent(ParticipantsEvent participantsEvent) {
		getParticipantsEvents().add(participantsEvent);
		participantsEvent.setUser(this);

		return participantsEvent;
	}

	public ParticipantsEvent removeParticipantsEvent(ParticipantsEvent participantsEvent) {
		getParticipantsEvents().remove(participantsEvent);
		participantsEvent.setUser(null);

		return participantsEvent;
	}

	public List<SportsVenueReview> getSportsVenueReviews() {
		return this.sportsVenueReviews;
	}

	public void setSportsVenueReviews(List<SportsVenueReview> sportsVenueReviews) {
		this.sportsVenueReviews = sportsVenueReviews;
	}

	public SportsVenueReview addSportsVenueReview(SportsVenueReview sportsVenueReview) {
		getSportsVenueReviews().add(sportsVenueReview);
		sportsVenueReview.setUser(this);

		return sportsVenueReview;
	}

	public SportsVenueReview removeSportsVenueReview(SportsVenueReview sportsVenueReview) {
		getSportsVenueReviews().remove(sportsVenueReview);
		sportsVenueReview.setUser(null);

		return sportsVenueReview;
	}

	public List<TeamOfficer> getTeamOfficers() {
		return this.teamOfficers;
	}

	public void setTeamOfficers(List<TeamOfficer> teamOfficers) {
		this.teamOfficers = teamOfficers;
	}

	public TeamOfficer addTeamOfficer(TeamOfficer teamOfficer) {
		getTeamOfficers().add(teamOfficer);
		teamOfficer.setUser(this);

		return teamOfficer;
	}

	public TeamOfficer removeTeamOfficer(TeamOfficer teamOfficer) {
		getTeamOfficers().remove(teamOfficer);
		teamOfficer.setUser(null);

		return teamOfficer;
	}

	public List<Team> getTeams() {
		return this.teams;
	}

	public void setTeams(List<Team> teams) {
		this.teams = teams;
	}

	public Team addTeam(Team team) {
		getTeams().add(team);
		team.setUser(this);

		return team;
	}

	public Team removeTeam(Team team) {
		getTeams().remove(team);
		team.setUser(null);

		return team;
	}

	public List<UserPhotoAlbum> getUserPhotoAlbums() {
		return this.userPhotoAlbums;
	}

	public void setUserPhotoAlbums(List<UserPhotoAlbum> userPhotoAlbums) {
		this.userPhotoAlbums = userPhotoAlbums;
	}

	public UserPhotoAlbum addUserPhotoAlbum(UserPhotoAlbum userPhotoAlbum) {
		getUserPhotoAlbums().add(userPhotoAlbum);
		userPhotoAlbum.setUser(this);

		return userPhotoAlbum;
	}

	public UserPhotoAlbum removeUserPhotoAlbum(UserPhotoAlbum userPhotoAlbum) {
		getUserPhotoAlbums().remove(userPhotoAlbum);
		userPhotoAlbum.setUser(null);

		return userPhotoAlbum;
	}

	public List<UserPhoto> getUserPhotos() {
		return this.userPhotos;
	}

	public void setUserPhotos(List<UserPhoto> userPhotos) {
		this.userPhotos = userPhotos;
	}

	public UserPhoto addUserPhoto(UserPhoto userPhoto) {
		getUserPhotos().add(userPhoto);
		userPhoto.setUser(this);

		return userPhoto;
	}

	public UserPhoto removeUserPhoto(UserPhoto userPhoto) {
		getUserPhotos().remove(userPhoto);
		userPhoto.setUser(null);

		return userPhoto;
	}

	public List<UserProfile> getUserProfiles() {
		return this.userProfiles;
	}

	public void setUserProfiles(List<UserProfile> userProfiles) {
		this.userProfiles = userProfiles;
	}

	public UserProfile addUserProfile(UserProfile userProfile) {
		getUserProfiles().add(userProfile);
		userProfile.setUser(this);

		return userProfile;
	}

	public UserProfile removeUserProfile(UserProfile userProfile) {
		getUserProfiles().remove(userProfile);
		userProfile.setUser(null);

		return userProfile;
	}

	public List<UserRating> getUserRatings() {
		return this.userRatings;
	}

	public void setUserRatings(List<UserRating> userRatings) {
		this.userRatings = userRatings;
	}

	public UserRating addUserRating(UserRating userRating) {
		getUserRatings().add(userRating);
		userRating.setUser(this);

		return userRating;
	}

	public UserRating removeUserRating(UserRating userRating) {
		getUserRatings().remove(userRating);
		userRating.setUser(null);

		return userRating;
	}

	public List<UserTeamFavorite> getUserTeamFavorites() {
		return this.userTeamFavorites;
	}

	public void setUserTeamFavorites(List<UserTeamFavorite> userTeamFavorites) {
		this.userTeamFavorites = userTeamFavorites;
	}

	public UserTeamFavorite addUserTeamFavorite(UserTeamFavorite userTeamFavorite) {
		getUserTeamFavorites().add(userTeamFavorite);
		userTeamFavorite.setUser(this);

		return userTeamFavorite;
	}

	public UserTeamFavorite removeUserTeamFavorite(UserTeamFavorite userTeamFavorite) {
		getUserTeamFavorites().remove(userTeamFavorite);
		userTeamFavorite.setUser(null);

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
		userTeam.setUser(this);

		return userTeam;
	}

	public UserTeam removeUserTeam(UserTeam userTeam) {
		getUserTeams().remove(userTeam);
		userTeam.setUser(null);

		return userTeam;
	}

	public List<UserVenueFavorite> getUserVenueFavorites() {
		return this.userVenueFavorites;
	}

	public void setUserVenueFavorites(List<UserVenueFavorite> userVenueFavorites) {
		this.userVenueFavorites = userVenueFavorites;
	}

	public UserVenueFavorite addUserVenueFavorite(UserVenueFavorite userVenueFavorite) {
		getUserVenueFavorites().add(userVenueFavorite);
		userVenueFavorite.setUser(this);

		return userVenueFavorite;
	}

	public UserVenueFavorite removeUserVenueFavorite(UserVenueFavorite userVenueFavorite) {
		getUserVenueFavorites().remove(userVenueFavorite);
		userVenueFavorite.setUser(null);

		return userVenueFavorite;
	}

}