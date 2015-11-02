package org.playwork.futsalfinder.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the user_photo_albums database table.
 * 
 */
@Entity
@Table(name="user_photo_albums")
@NamedQuery(name="UserPhotoAlbum.findAll", query="SELECT u FROM UserPhotoAlbum u")
public class UserPhotoAlbum implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="created_date")
	private Date createdDate;

	private String title;

	//bi-directional many-to-one association to User
	@ManyToOne
	private User user;

	//bi-directional many-to-one association to UserPhoto
	@OneToMany(mappedBy="userPhotoAlbum", fetch=FetchType.EAGER)
	private List<UserPhoto> userPhotos;

	public UserPhotoAlbum() {
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

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<UserPhoto> getUserPhotos() {
		return this.userPhotos;
	}

	public void setUserPhotos(List<UserPhoto> userPhotos) {
		this.userPhotos = userPhotos;
	}

	public UserPhoto addUserPhoto(UserPhoto userPhoto) {
		getUserPhotos().add(userPhoto);
		userPhoto.setUserPhotoAlbum(this);

		return userPhoto;
	}

	public UserPhoto removeUserPhoto(UserPhoto userPhoto) {
		getUserPhotos().remove(userPhoto);
		userPhoto.setUserPhotoAlbum(null);

		return userPhoto;
	}

}