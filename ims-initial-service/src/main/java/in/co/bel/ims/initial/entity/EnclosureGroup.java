package in.co.bel.ims.initial.entity;
// Generated 20-Sep-2022, 3:54:24 pm by Hibernate Tools 4.3.5.Final

import java.time.LocalDateTime;
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
 * EnclosureGroup generated by hbm2java
 */
@Entity
@Table(name = "enclosure_group", schema = "mdms")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class EnclosureGroup implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private int id;
	private Integer createdBy;
	private LocalDateTime createdTimestamp;
	private boolean deleted;
	private Integer modifiedBy;
	private LocalDateTime modifiedTimestamp;
	private String name;
	private Venue venue;
	@JsonIgnore
	private Set<Cpl> cpls = new HashSet<Cpl>(0);
	@JsonIgnore
	private Set<Enclosure> enclosures = new HashSet<Enclosure>(0);
	@JsonIgnore
	private Set<ImsUser> imsUsers = new HashSet<ImsUser>(0);
	@JsonIgnore
	private Set<PassDayLimitCategory> passDayLimitCategories = new HashSet<PassDayLimitCategory>(0);

	public EnclosureGroup() {
	}

	public EnclosureGroup(int id) {
		this.id = id;
	}

	public EnclosureGroup(int id, Integer createdBy, LocalDateTime createdTimestamp, boolean deleted, Integer modifiedBy,
			LocalDateTime modifiedTimestamp, String name, Set<Cpl> cpls, Set<Enclosure> enclosures) {
		this.id = id;
		this.createdBy = createdBy;
		this.createdTimestamp = createdTimestamp;
		
		this.modifiedBy = modifiedBy;
		this.modifiedTimestamp = modifiedTimestamp;
		this.name = name;
		this.cpls = cpls;
		this.enclosures = enclosures;
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

	@Column(name = "deleted", nullable = false)
	public boolean isDeleted() {
		return this.deleted;
	}

	public void setDeleted(Boolean deleted) { 	 this.deleted = deleted;
		
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
	@Pattern(regexp = "[a-zA-Z0-9\\s.,()&]*", message = "Must not contain special characters")
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "enclosureGroup")
	public Set<Cpl> getCpls() {
		return this.cpls;
	}

	public void setCpls(Set<Cpl> cpls) {
		this.cpls = cpls;
	}
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "enclosureGroup")
	public Set<Enclosure> getEnclosures() {
		return this.enclosures;
	}

	public void setEnclosures(Set<Enclosure> enclosures) {
		this.enclosures = enclosures;
	}
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "enclosureGroup")
	public Set<ImsUser> getImsUsers() {
		return this.imsUsers;
	}

	public void setImsUsers(Set<ImsUser> imsUsers) {
		this.imsUsers = imsUsers;
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
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "enclosureGroup")
	public Set<PassDayLimitCategory> getPassDayLimitCategories() {
		return this.passDayLimitCategories;
	}

	public void setPassDayLimitCategories(Set<PassDayLimitCategory> passDayLimitCategories) {
		this.passDayLimitCategories = passDayLimitCategories;
	}
}
