package org.playwork.fussballfinder.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the sports_venues database table.
 * 
 */
@Entity
@Table(name="sports_venues")
@NamedQuery(name="SportsVenue.findAll", query="SELECT s FROM SportsVenue s")
public class SportsVenue implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="created_date", nullable=false)
	private Date createdDate;

	@Column(name="is_featured", nullable=false)
	private byte isFeatured;

	@Column(nullable=false)
	private int name;

	@Column(nullable=false, length=50)
	private String owner;

	public SportsVenue() {
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

	public byte getIsFeatured() {
		return this.isFeatured;
	}

	public void setIsFeatured(byte isFeatured) {
		this.isFeatured = isFeatured;
	}

	public int getName() {
		return this.name;
	}

	public void setName(int name) {
		this.name = name;
	}

	public String getOwner() {
		return this.owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

}