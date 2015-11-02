package org.playwork.futsalfinder.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the team_roles database table.
 * 
 */
@Entity
@Table(name="team_roles")
@NamedQuery(name="TeamRole.findAll", query="SELECT t FROM TeamRole t")
public class TeamRole implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	@Lob
	private String description;

	private String name;

	//bi-directional many-to-one association to TeamOfficer
	@OneToMany(mappedBy="teamRole", fetch=FetchType.EAGER)
	private List<TeamOfficer> teamOfficers;

	public TeamRole() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<TeamOfficer> getTeamOfficers() {
		return this.teamOfficers;
	}

	public void setTeamOfficers(List<TeamOfficer> teamOfficers) {
		this.teamOfficers = teamOfficers;
	}

	public TeamOfficer addTeamOfficer(TeamOfficer teamOfficer) {
		getTeamOfficers().add(teamOfficer);
		teamOfficer.setTeamRole(this);

		return teamOfficer;
	}

	public TeamOfficer removeTeamOfficer(TeamOfficer teamOfficer) {
		getTeamOfficers().remove(teamOfficer);
		teamOfficer.setTeamRole(null);

		return teamOfficer;
	}

}