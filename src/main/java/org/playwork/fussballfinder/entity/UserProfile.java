package org.playwork.fussballfinder.entity;

import java.io.Serializable;
import javax.persistence.*;


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
	private int id;

	@Column(name="club_fans")
	private String clubFans;

	private float height;

	private String name;

	@Column(name="preferred_position")
	private String preferredPosition;

	@Column(name="self_describe")
	private String selfDescribe;

	private float weight;

	//bi-directional many-to-one association to User
	@ManyToOne
	private User user;

	public UserProfile() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getClubFans() {
		return this.clubFans;
	}

	public void setClubFans(String clubFans) {
		this.clubFans = clubFans;
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