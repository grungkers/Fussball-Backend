package org.playwork.fussballfinder.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the fields database table.
 * 
 */
@Entity
@Table(name="fields")
@NamedQuery(name="Field.findAll", query="SELECT f FROM Field f")
public class Field implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	private byte availability;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="created_date")
	private Date createdDate;

	private String description;

	@Column(name="field_type")
	private String fieldType;

	@Column(name="is_indoor")
	private byte isIndoor;

	private float length;

	private String name;

	private BigDecimal price;

	private float width;

	//bi-directional many-to-one association to SportsVenue
	@ManyToOne
	@JoinColumn(name="sports_venue_id")
	private SportsVenue sportsVenue;

	public Field() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public byte getAvailability() {
		return this.availability;
	}

	public void setAvailability(byte availability) {
		this.availability = availability;
	}

	public Date getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getFieldType() {
		return this.fieldType;
	}

	public void setFieldType(String fieldType) {
		this.fieldType = fieldType;
	}

	public byte getIsIndoor() {
		return this.isIndoor;
	}

	public void setIsIndoor(byte isIndoor) {
		this.isIndoor = isIndoor;
	}

	public float getLength() {
		return this.length;
	}

	public void setLength(float length) {
		this.length = length;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getPrice() {
		return this.price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public float getWidth() {
		return this.width;
	}

	public void setWidth(float width) {
		this.width = width;
	}

	public SportsVenue getSportsVenue() {
		return this.sportsVenue;
	}

	public void setSportsVenue(SportsVenue sportsVenue) {
		this.sportsVenue = sportsVenue;
	}

}