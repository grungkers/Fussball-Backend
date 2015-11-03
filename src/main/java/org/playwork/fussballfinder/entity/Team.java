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
	@Column(unique=true, nullable=false)
	private int id;

	@Column(length=255)
	private String address;

	@Column(name="created_by", nullable=false)
	private int createdBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="created_date", nullable=false)
	private Date createdDate;

	private float latitude;

	private float longitude;

	@Column(nullable=false, length=100)
	private String name;

	//bi-directional many-to-many association to User
	@ManyToMany(mappedBy="teams")
	private List<User> users;

	//bi-directional many-to-one association to TeamPhoto
	@OneToMany(mappedBy="team")
	private List<TeamPhoto> teamPhotos;

	//bi-directional many-to-one association to TeamPhotoAlbum
	@OneToMany(mappedBy="team")
	private List<TeamPhotoAlbum> teamPhotoAlbums;

	//bi-directional many-to-one association to Event
	@OneToMany(mappedBy="team1")
	private List<Event> events1;

	//bi-directional many-to-one association to Event
	@OneToMany(mappedBy="team2")
	private List<Event> events2;

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

	public int getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(int createdBy) {
		this.createdBy = createdBy;
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

	public List<User> getUsers() {
		return this.users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
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

	public List<Event> getEvents1() {
		return this.events1;
	}

	public void setEvents1(List<Event> events1) {
		this.events1 = events1;
	}

	public Event addEvents1(Event events1) {
		getEvents1().add(events1);
		events1.setTeam1(this);

		return events1;
	}

	public Event removeEvents1(Event events1) {
		getEvents1().remove(events1);
		events1.setTeam1(null);

		return events1;
	}

	public List<Event> getEvents2() {
		return this.events2;
	}

	public void setEvents2(List<Event> events2) {
		this.events2 = events2;
	}

	public Event addEvents2(Event events2) {
		getEvents2().add(events2);
		events2.setTeam2(this);

		return events2;
	}

	public Event removeEvents2(Event events2) {
		getEvents2().remove(events2);
		events2.setTeam2(null);

		return events2;
	}

}