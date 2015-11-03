package org.playwork.fussballfinder.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the team_photos database table.
 * 
 */
@Entity
@Table(name="team_photos")
@NamedQuery(name="TeamPhoto.findAll", query="SELECT t FROM TeamPhoto t")
public class TeamPhoto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="created_date")
	private Date createdDate;

	private String filename;

	//bi-directional many-to-one association to TeamPhotoAlbum
	@ManyToOne
	@JoinColumn(name="album_id")
	private TeamPhotoAlbum teamPhotoAlbum;

	//bi-directional many-to-one association to Team
	@ManyToOne
	private Team team;

	public TeamPhoto() {
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

	public TeamPhotoAlbum getTeamPhotoAlbum() {
		return this.teamPhotoAlbum;
	}

	public void setTeamPhotoAlbum(TeamPhotoAlbum teamPhotoAlbum) {
		this.teamPhotoAlbum = teamPhotoAlbum;
	}

	public Team getTeam() {
		return this.team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}

}