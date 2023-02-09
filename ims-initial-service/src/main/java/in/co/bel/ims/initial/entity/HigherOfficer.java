package in.co.bel.ims.initial.entity;
// Generated 11-Oct-2022, 10:40:11 am by Hibernate Tools 4.3.5.Final

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
 * HigherOfficer generated by hbm2java
 */
@Entity
@Table(name = "higher_officer", schema = "mdms")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class HigherOfficer implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private ImsUser imsUser;
	private Event event;
	private Boolean deleted = false;

	public HigherOfficer() {
	}

	public HigherOfficer(int id) {
		this.id = id;
	}

	public HigherOfficer(int id, ImsUser imsUser, Event event, Boolean deleted) {
		this.id = id;
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

	@Column(name = "deleted")
	public Boolean getDeleted() {
		return this.deleted;
	}

	public void setDeleted(Boolean deleted) {
		this.deleted = deleted;
	}

}
