package org.playwork.fussballfinder.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the user_profiles database table.
 * 
 */
@Entity
@Table(name="user_profiles")
@NamedQuery(name="UserProfile.findAll", query="SELECT u FROM UserProfile u")
public class UserProfile implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;

	@Temporal(TemporalType.TIMESTAMP)
	private Date birthdate;

	@Column(name="club_fans", length=255)
	private String clubFans;

	@Column(name="dominant_foot", length=10)
	private String dominantFoot;

	@Column(length=15)
	private String gender;

	private float height;

	@Column(nullable=false, length=255)
	private String name;

	@Column(length=50)
	private String nationality;

	@Column(name="preferred_position", length=45)
	private String preferredPosition;

	@Column(name="self_describe", length=255)
	private String selfDescribe;

	private float weight;

	//bi-directional one-to-one association to User
	@OneToOne(mappedBy="userProfile", fetch=FetchType.LAZY)
	private User user;

	public UserProfile() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getBirthdate() {
		return this.birthdate;
	}

	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}

	public String getClubFans() {
		return this.clubFans;
	}

	public void setClubFans(String clubFans) {
		this.clubFans = clubFans;
	}

	public String getDominantFoot() {
		return this.dominantFoot;
	}

	public void setDominantFoot(String dominantFoot) {
		this.dominantFoot = dominantFoot;
	}

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public float getHeight() {
		return this.height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNationality() {
		return this.nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getPreferredPosition() {
		return this.preferredPosition;
	}

	public void setPreferredPosition(String preferredPosition) {
		this.preferredPosition = preferredPosition;
	}

	public String getSelfDescribe() {
		return this.selfDescribe;
	}

	public void setSelfDescribe(String selfDescribe) {
		this.selfDescribe = selfDescribe;
	}

	public float getWeight() {
		return this.weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}