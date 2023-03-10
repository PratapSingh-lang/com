package in.co.bel.ims.initial.entity;
// Generated 07-Oct-2022, 2:38:42 pm by Hibernate Tools 4.3.5.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import org.hibernate.id.enhanced.SequenceStyleGenerator;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * InvitationOfficer generated by hbm2java
 */
@Entity
@Table(name = "invitation_officer", schema = "mdms")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class InvitationOfficer implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private int id;
	private Enclosure enclosure;
	private Event event;
	private ImsUser imsUser;
	private boolean deleted;

	public InvitationOfficer() {
	}

	public InvitationOfficer(int id) {
		this.id = id;
	}

	public InvitationOfficer(int id, Enclosure enclosure, ImsUser imsUser, Event event, Boolean deleted) {
		this.id = id;
		this.enclosure = enclosure;
		this.imsUser = imsUser;
		this.event = event;
		this.deleted = deleted;
	}

	@Id
	@GenericGenerator(name = "sequencePerEntityGenerator", strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator", parameters = {
			@Parameter(name = "prefer_sequence_per_entity", value = "true"),
			@Parameter(name = "initial_value", value = "1"),
			@Parameter(name = SequenceStyleGenerator.INCREMENT_PARAM, value = "1") })
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "sequencePerEntityGenerator")
	@Column(name = "id", unique = true, nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "enclosure_id")
	@NotNull
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"}) 
	public Enclosure getEnclosure() {
		return this.enclosure;
	}

	public void setEnclosure(Enclosure enclosure) {
		this.enclosure = enclosure;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ims_user_id")
	@NotNull
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"}) 
	public ImsUser getImsUser() {
		return this.imsUser;
	}

	public void setImsUser(ImsUser imsUser) {
		this.imsUser = imsUser;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "event_id")
	@NotNull
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"}) 
	public Event getEvent() {
		return this.event;
	}

	public void setEvent(Event event) {
		this.event = event;
	}
	@Column(name = "deleted", nullable = false)
	public boolean isDeleted() {
		return this.deleted;
	}

	public void setDeleted(Boolean deleted) { 
	 this.deleted = deleted;
		
	}
}
