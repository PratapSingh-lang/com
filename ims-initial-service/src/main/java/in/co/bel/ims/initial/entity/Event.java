package in.co.bel.ims.initial.entity;
// Generated 20-Sep-2022, 3:54:24 pm by Hibernate Tools 4.3.5.Final

import java.time.LocalDateTime;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.FutureOrPresent;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import org.hibernate.id.enhanced.SequenceStyleGenerator;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Event generated by hbm2java
 */
@Entity
@Table(name = "event", schema = "tdms")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Event implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private int id;
	private Venue venue;
	private Integer createdBy;
	private LocalDateTime createdTimestamp;
	private Date date;
	private boolean deleted;
	private String description;
	private String eventCode;
	private Integer modifiedBy;
	private LocalDateTime modifiedTimestamp;
	private String name;
	private Integer totalInvitations;
	@JsonIgnore
	private Set<EventPassTypeMapping> eventPassTypeMappings = new HashSet<EventPassTypeMapping>(0);
	@JsonIgnore
	private Set<Pass> passes = new HashSet<Pass>(0);
	@JsonIgnore
	private Set<EnclosurePassTypeMapping> enclosurePassTypeMappings = new HashSet<EnclosurePassTypeMapping>(0);
	@JsonIgnore
	private Set<InvitationOfficer> invitationOfficers = new HashSet<InvitationOfficer>(0);
	@JsonIgnore
	private Set<ScanningOfficer> scanningOfficers = new HashSet<ScanningOfficer>(0);
	@JsonIgnore
	private Set<NodalOfficer> nodalOfficers = new HashSet<NodalOfficer>(0);
	@JsonIgnore
	private Set<CarPass> carPasses = new HashSet<CarPass>(0);
	@JsonIgnore
	private Set<HigherOfficer> higherOfficers = new HashSet<HigherOfficer>(0);
	@JsonIgnore
	private Set<Organizer> organizers = new HashSet<Organizer>(0);
	@JsonIgnore
	private Set<PaidPassHolders> paidPassHolderses = new HashSet<PaidPassHolders>(0);
	@JsonIgnore
	private Set<PassDayLimit> passDayLimits = new HashSet<PassDayLimit>(0);

	public Event() {
	}

	public Event(int id) {
		this.id = id;
		
	}

	public Event(int id, Venue venue, Integer createdBy, LocalDateTime createdTimestamp, Date date, boolean deleted,
			String description, String eventCode, Integer modifiedBy, LocalDateTime modifiedTimestamp, String name,
			Integer totalInvitations, Set<EventPassTypeMapping> eventPassTypeMappings,
			Set<ScanningOfficer> scanningOfficers, Set<EnclosurePassTypeMapping> enclosurePassTypeMappings,
			Set<NodalOfficer> nodalOfficers, Set<Pass> passes, Set<CarPass> carPasses,
			Set<HigherOfficer> higherOfficers, Set<InvitationOfficer> invitationOfficers, Set<Organizer> organizers) {
		this.id = id;
		this.venue = venue;
		this.createdBy = createdBy;
		this.createdTimestamp = createdTimestamp;
		this.date = date;
		this.deleted = deleted;
		this.description = description;
		this.eventCode = eventCode;
		this.modifiedBy = modifiedBy;
		this.modifiedTimestamp = modifiedTimestamp;
		this.name = name;
		this.totalInvitations = totalInvitations;
		this.eventPassTypeMappings = eventPassTypeMappings;
		this.scanningOfficers = scanningOfficers;
		this.enclosurePassTypeMappings = enclosurePassTypeMappings;
		this.nodalOfficers = nodalOfficers;
		this.passes = passes;
		this.carPasses = carPasses;
		this.higherOfficers = higherOfficers;
		this.invitationOfficers = invitationOfficers;
		this.organizers = organizers;
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
	@JoinColumn(name = "venue_id")
	@NotNull
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"}) 
	public Venue getVenue() {
		return this.venue;
	}

	public void setVenue(Venue venue) {
		this.venue = venue;
	}
	
	@Column(name = "created_by")
	public Integer getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(Integer createdBy) {
		this.createdBy = createdBy;
	}

	
	@Column(name = "created_timestamp", length = 29)
	public LocalDateTime getCreatedTimestamp() {
		return this.createdTimestamp;
	}

	public void setCreatedTimestamp(LocalDateTime createdTimestamp) {
		this.createdTimestamp = createdTimestamp;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "date", length = 13)
	@NotNull
	@FutureOrPresent
	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Column(name = "deleted", nullable = false)
	public boolean isDeleted() {
		return this.deleted;
	}

	public void setDeleted(Boolean deleted) { 
		
	}

	@Column(name = "description", length = 500)
	@Size(max=500, message="It should not be more than 500 characters")
	@NotBlank
	@Pattern(regexp = "[a-zA-Z0-9\\s +@:,().&'#-]*", message = "Must not contain special characters")
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "event_code", length = 50)
	@Size(max=50, message="It should not be more than 50 characters")
	@NotBlank
	@Pattern(regexp = "[a-zA-Z0-9\\s_-]*", message = "Must not contain special characters")
	public String getEventCode() {
		return this.eventCode;
	}

	public void setEventCode(String eventCode) {
		this.eventCode = eventCode;
	}

	@Column(name = "modified_by")
	public Integer getModifiedBy() {
		return this.modifiedBy;
	}

	public void setModifiedBy(Integer modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	
	@Column(name = "modified_timestamp", length = 29)
	public LocalDateTime getModifiedTimestamp() {
		return this.modifiedTimestamp;
	}

	public void setModifiedTimestamp(LocalDateTime modifiedTimestamp) {
		this.modifiedTimestamp = modifiedTimestamp;
	}

	@Column(name = "name", length = 200)
	@Size(max=200, message="Name should not be more than 200 characters")
	@NotBlank
	@Pattern(regexp = "[a-zA-Z0-9\\s.,()&'-]*", message = "Must not contain special characters")
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "total_invitations")
	@NotNull
	public Integer getTotalInvitations() {
		return this.totalInvitations;
	}

	public void setTotalInvitations(Integer totalInvitations) {
		this.totalInvitations = totalInvitations;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "event")
	public Set<EventPassTypeMapping> getEventPassTypeMappings() {
		return this.eventPassTypeMappings;
	}

	public void setEventPassTypeMappings(Set<EventPassTypeMapping> eventPassTypeMappings) {
		this.eventPassTypeMappings = eventPassTypeMappings;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "event")
	public Set<Pass> getPasses() {
		return this.passes;
	}

	public void setPasses(Set<Pass> passes) {
		this.passes = passes;
	}
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "event")
	public Set<InvitationOfficer> getInvitationOfficers() {
		return this.invitationOfficers;
	}

	public void setInvitationOfficers(Set<InvitationOfficer> invitationOfficers) {
		this.invitationOfficers = invitationOfficers;
	}
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "event")
	public Set<ScanningOfficer> getScanningOfficers() {
		return this.scanningOfficers;
	}

	public void setScanningOfficers(Set<ScanningOfficer> scanningOfficers) {
		this.scanningOfficers = scanningOfficers;
	}
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "imsUser")
	public Set<HigherOfficer> getHigherOfficers() {
		return this.higherOfficers;
	}

	public void setHigherOfficers(Set<HigherOfficer> higherOfficers) {
		this.higherOfficers = higherOfficers;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "imsUser")
	public Set<Organizer> getOrganizers() {
		return this.organizers;
	}

	public void setOrganizers(Set<Organizer> organizers) {
		this.organizers = organizers;
	}
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "imsUser")
	public Set<NodalOfficer> getNodalOfficers() {
		return this.nodalOfficers;
	}

	public void setNodalOfficers(Set<NodalOfficer> nodalOfficers) {
		this.nodalOfficers = nodalOfficers;
	}
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "event")
	public Set<EnclosurePassTypeMapping> getEnclosurePassTypeMappings() {
		return this.enclosurePassTypeMappings;
	}

	public void setEnclosurePassTypeMappings(Set<EnclosurePassTypeMapping> enclosurePassTypeMappings) {
		this.enclosurePassTypeMappings = enclosurePassTypeMappings;
	}
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "event")
	public Set<CarPass> getCarPasses() {
		return this.carPasses;
	}

	public void setCarPasses(Set<CarPass> carPasses) {
		this.carPasses = carPasses;
	}
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "event")
	public Set<PaidPassHolders> getPaidPassHolderses() {
		return this.paidPassHolderses;
	}

	public void setPaidPassHolderses(Set<PaidPassHolders> paidPassHolderses) {
		this.paidPassHolderses = paidPassHolderses;
	}
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "event")
	public Set<PassDayLimit> getPassDayLimits() {
		return this.passDayLimits;
	}

	public void setPassDayLimits(Set<PassDayLimit> passDayLimits) {
		this.passDayLimits = passDayLimits;
	}

}