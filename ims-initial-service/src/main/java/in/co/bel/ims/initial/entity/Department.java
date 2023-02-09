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
 * Department generated by hbm2java
 */
@Entity
@Table(name = "department", schema = "mdms")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Department implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private int id;
	private Organization organization;
	private Integer createdBy;
	private LocalDateTime createdTimestamp;
	private boolean deleted;
	private Integer modifiedBy;
	private LocalDateTime modifiedTimestamp;
	private String name;
	@JsonIgnore
	private Set<ImsUser> imsUsers = new HashSet<ImsUser>(0);
	@JsonIgnore
	private Set<Pass> passes = new HashSet<Pass>(0);
	@JsonIgnore
	private Set<NodalOfficer> nodalOfficers = new HashSet<NodalOfficer>(0);
	@JsonIgnore
	private Set<CarPass> carPasses = new HashSet<CarPass>(0);
	
	public Department() {
	}

	public Department(int id) {
		this.id = id;
		
	}

	public Department(int id, Organization organization, Integer createdBy, LocalDateTime createdTimestamp, boolean deleted,
			Integer modifiedBy, LocalDateTime modifiedTimestamp, String name, Set<ImsUser> imsUsers, Set<Pass> passes,
			Set<CarPass> carPasses, Set<NodalOfficer> nodalOfficers) {
		this.id = id;
		this.organization = organization;
		this.createdBy = createdBy;
		this.createdTimestamp = createdTimestamp;
		this.deleted = deleted;
		this.modifiedBy = modifiedBy;
		this.modifiedTimestamp = modifiedTimestamp;
		this.name = name;
		this.imsUsers = imsUsers;
		this.passes = passes;
		this.carPasses = carPasses;
		this.nodalOfficers = nodalOfficers;
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
	@JoinColumn(name = "organization_id")
	@NotNull
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"}) 
	public Organization getOrganization() {
		return this.organization;
	}

	public void setOrganization(Organization organization) {
		this.organization = organization;
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

	@Column(name = "name", length = 100)
	@Size(max=200, message="Name should not be more than 200 characters")
	@NotBlank
	@Pattern(regexp = "[a-zA-Z\\s.,()&]*", message = "Must not contain special characters")
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "department")
	public Set<ImsUser> getImsUsers() {
		return this.imsUsers;
	}

	public void setImsUsers(Set<ImsUser> imsUsers) {
		this.imsUsers = imsUsers;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "department")
	public Set<Pass> getPasses() {
		return this.passes;
	}

	public void setPasses(Set<Pass> passes) {
		this.passes = passes;
	}
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "department")
	public Set<NodalOfficer> getNodalOfficers() {
		return this.nodalOfficers;
	}

	public void setNodalOfficers(Set<NodalOfficer> nodalOfficers) {
		this.nodalOfficers = nodalOfficers;
	}
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "department")
	public Set<CarPass> getCarPasses() {
		return this.carPasses;
	}

	public void setCarPasses(Set<CarPass> carPasses) {
		this.carPasses = carPasses;
	}

}
