package org.playwork.futsalfinder.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the team_rating database table.
 * 
 */
@Entity
@Table(name="team_rating")
@NamedQuery(name="TeamRating.findAll", query="SELECT t FROM TeamRating t")
public class TeamRating implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	private int count;

	private String lastip;

	private int sum;

	//bi-directional many-to-one association to Team
	@ManyToOne
	private Team team;

	public TeamRating() {
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

	public Team getTeam() {
		return this.team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}

}