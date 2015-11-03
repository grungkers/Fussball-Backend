package org.playwork.fussballfinder.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the user_rating database table.
 * 
 */
@Entity
@Table(name="user_rating")
@NamedQuery(name="UserRating.findAll", query="SELECT u FROM UserRating u")
public class UserRating implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	private int count;

	private String lastip;

	private int sum;

	//bi-directional many-to-one association to User
	@ManyToOne
	private User user;

	public UserRating() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCount() {
		return this.count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String getLastip() {
		return this.lastip;
	}

	public void setLastip(String lastip) {
		this.lastip = lastip;
	}

	public int getSum() {
		return this.sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}