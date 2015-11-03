package org.playwork.fussballfinder.entity;

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
	@Column(unique=true, nullable=false)
	private int id;

	@Column(nullable=false, length=100)
	private String activation;

	@Column(nullable=false)
	private byte block;

	@Column(nullable=false, length=100)
	private String email;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="lastvisit_date", nullable=false)
	private Date lastvisitDate;

	@Column(nullable=false, length=100)
	private String password;

	@Column(name="profile_img_id", nullable=false)
	private int profileImgId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="register_date", nullable=false)
	private Date registerDate;

	@Column(name="reset_count", nullable=false)
	private int resetCount;

	@Column(nullable=false, length=150)
	private String username;

	//bi-directional one-to-one association to UserProfile
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id", referencedColumnName="user_id", nullable=false, insertable=false, updatable=false)
	private UserProfile userProfile;

	//bi-directional many-to-one association to UserPosition
	@OneToMany(mappedBy="user")
	private List<UserPosition> userPositions;

	//bi-directional many-to-one association to UserPhoto
	@OneToMany(mappedBy="user")
	private List<UserPhoto> userPhotos;

	//bi-directional many-to-many association to Team
	@ManyToMany
	@JoinTable(
		name="user_teams"
		, joinColumns={
			@JoinColumn(name="user_id", nullable=false)
			}
		, inverseJoinColumns={
			@JoinColumn(name="team_id", nullable=false)
			}
		)
	private List<Team> teams;

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

	public UserProfile getUserProfile() {
		return this.userProfile;
	}

	public void setUserProfile(UserProfile userProfile) {
		this.userProfile = userProfile;
	}

	public List<UserPosition> getUserPositions() {
		return this.userPositions;
	}

	public void setUserPositions(List<UserPosition> userPositions) {
		this.userPositions = userPositions;
	}

	public UserPosition addUserPosition(UserPosition userPosition) {
		getUserPositions().add(userPosition);
		userPosition.setUser(this);

		return userPosition;
	}

	public UserPosition removeUserPosition(UserPosition userPosition) {
		getUserPositions().remove(userPosition);
		userPosition.setUser(null);

		return userPosition;
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

	public List<Team> getTeams() {
		return this.teams;
	}

	public void setTeams(List<Team> teams) {
		this.teams = teams;
	}

}