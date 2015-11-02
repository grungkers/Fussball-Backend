package org.playwork.futsalfinder.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the user_photos database table.
 * 
 */
@Entity
@Table(name="user_photos")
@NamedQuery(name="UserPhoto.findAll", query="SELECT u FROM UserPhoto u")
public class UserPhoto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="created_date")
	private Date createdDate;

	private String filename;

	//bi-directional many-to-one association to UserPhotoAlbum
	@ManyToOne
	@JoinColumn(name="album_id")
	private UserPhotoAlbum userPhotoAlbum;

	//bi-directional many-to-one association to User
	@ManyToOne
	private User user;

	public UserPhoto() {
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

	public String getFilename() {
		return this.filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public UserPhotoAlbum getUserPhotoAlbum() {
		return this.userPhotoAlbum;
	}

	public void setUserPhotoAlbum(UserPhotoAlbum userPhotoAlbum) {
		this.userPhotoAlbum = userPhotoAlbum;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}