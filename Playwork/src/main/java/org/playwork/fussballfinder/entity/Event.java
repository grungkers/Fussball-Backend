package org.playwork.fussballfinder.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the events database table.
 * 
 */
@Entity
@Table(name="events")
@NamedQuery(name="Event.findAll", query="SELECT e FROM Event e")
public class Event implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	@Column(name="away_score")
	private int awayScore;

	@Column(name="away_team")
	private int awayTeam;

	@Lob
	@Column(name="away_team_note")
	private String awayTeamNote;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="created_date")
	private Date createdDate;

	@Lob
	private String description;

	@Column(name="event_type")
	private int eventType;

	@Column(name="home_score")
	private int homeScore;

	@Column(name="is_public")
	private byte isPublic;

	@Lob
	@Column(name="owner_team_note")
	private String ownerTeamNote;

	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name="created_by")
	private User user;

	//bi-directional many-to-one association to Team
	@ManyToOne
	@JoinColumn(name="owner")
	private Team team;

	//bi-directional many-to-one association to SportsVenue
	@ManyToOne
	@JoinColumn(name="sports_venue_id")
	private SportsVenue sportsVenue;

	//bi-directional many-to-one association to ParticipantsEvent
	@OneToMany(mappedBy="event", fetch=FetchType.EAGER)
	private List<ParticipantsEvent> participantsEvents;

	public Event() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAwayScore() {
		return this.awayScore;
	}

	public void setAwayScore(int awayScore) {
		this.awayScore = awayScore;
	}

	public int getAwayTeam() {
		return this.awayTeam;
	}

	public void setAwayTeam(int awayTeam) {
		this.awayTeam = awayTeam;
	}

	public String getAwayTeamNote() {
		return this.awayTeamNote;
	}

	public void setAwayTeamNote(String awayTeamNote) {
		this.awayTeamNote = awayTeamNote;
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

	public int getEventType() {
		return this.eventType;
	}

	public void setEventType(int eventType) {
		this.eventType = eventType;
	}

	public int getHomeScore() {
		return this.homeScore;
	}

	public void setHomeScore(int homeScore) {
		this.homeScore = homeScore;
	}

	public byte getIsPublic() {
		return this.isPublic;
	}

	public void setIsPublic(byte isPublic) {
		this.isPublic = isPublic;
	}

	public String getOwnerTeamNote() {
		return this.ownerTeamNote;
	}

	public void setOwnerTeamNote(String ownerTeamNote) {
		this.ownerTeamNote = ownerTeamNote;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Team getTeam() {
		return this.team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}

	public SportsVenue getSportsVenue() {
		return this.sportsVenue;
	}

	public void setSportsVenue(SportsVenue sportsVenue) {
		this.sportsVenue = sportsVenue;
	}

	public List<ParticipantsEvent> getParticipantsEvents() {
		return this.participantsEvents;
	}

	public void setParticipantsEvents(List<ParticipantsEvent> participantsEvents) {
		this.participantsEvents = participantsEvents;
	}

	public ParticipantsEvent addParticipantsEvent(ParticipantsEvent participantsEvent) {
		getParticipantsEvents().add(participantsEvent);
		participantsEvent.setEvent(this);

		return participantsEvent;
	}

	public ParticipantsEvent removeParticipantsEvent(ParticipantsEvent participantsEvent) {
		getParticipantsEvents().remove(participantsEvent);
		participantsEvent.setEvent(null);

		return participantsEvent;
	}

}