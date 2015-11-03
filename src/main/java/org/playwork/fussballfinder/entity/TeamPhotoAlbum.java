package org.playwork.fussballfinder.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the team_photo_albums database table.
 * 
 */
@Entity
@Table(name="team_photo_albums")
@NamedQuery(name="TeamPhotoAlbum.findAll", query="SELECT t FROM TeamPhotoAlbum t")
public class TeamPhotoAlbum implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="created_date")
	private Date createdDate;

	private String title;

	//bi-directional many-to-one association to Team
	@ManyToOne
	private Team team;

	//bi-directional many-to-one association to TeamPhoto
	@OneToMany(mappedBy="teamPhotoAlbum", fetch=FetchType.EAGER)
	private List<TeamPhoto> teamPhotos;

	public TeamPhotoAlbum() {
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

	public Team getTeam() {
		return this.team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}

	public List<TeamPhoto> getTeamPhotos() {
		return this.teamPhotos;
	}

	public void setTeamPhotos(List<TeamPhoto> teamPhotos) {
		this.teamPhotos = teamPhotos;
	}

	public TeamPhoto addTeamPhoto(TeamPhoto teamPhoto) {
		getTeamPhotos().add(teamPhoto);
		teamPhoto.setTeamPhotoAlbum(this);

		return teamPhoto;
	}

	public TeamPhoto removeTeamPhoto(TeamPhoto teamPhoto) {
		getTeamPhotos().remove(teamPhoto);
		teamPhoto.setTeamPhotoAlbum(null);

		return teamPhoto;
	}

}