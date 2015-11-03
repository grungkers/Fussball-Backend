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
	@Column(unique=true, nullable=false)
	private int id;

	private byte availability;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="created_date", nullable=false)
	private Date createdDate;

	@Column(length=45)
	private String description;

	@Column(name="field_type", nullable=false, length=30)
	private String fieldType;

	@Column(name="is_indoor", nullable=false)
	private byte isIndoor;

	private float length;

	@Column(nullable=false, length=45)
	private String name;

	@Column(nullable=false, precision=10, scale=2)
	private BigDecimal price;

	@Column(name="sports_venue_id")
	private int sportsVenueId;

	private float width;

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

	public int getSportsVenueId() {
		return this.sportsVenueId;
	}

	public void setSportsVenueId(int sportsVenueId) {
		this.sportsVenueId = sportsVenueId;
	}

	public float getWidth() {
		return this.width;
	}

	public void setWidth(float width) {
		this.width = width;
	}

}