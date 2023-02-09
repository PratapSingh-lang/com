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
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import org.hibernate.id.enhanced.SequenceStyleGenerator;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * PassSubcategory generated by hbm2java
 */
@Entity
@Table(name = "pass_subcategory", schema = "system")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class PassSubcategory implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private int id;
	private PassCategory passCategory;
	private Integer createdBy;
	private LocalDateTime createdTimestamp;
	private boolean deleted;
	private Integer modifiedBy;
	private LocalDateTime modifiedTimestamp;
	private String name;
	@JsonIgnore
	private Set<EventPassTypeMapping> eventPassTypeMappings = new HashSet<EventPassTypeMapping>(0);
	@JsonIgnore
	private Set<EnclosurePassTypeMapping> enclosurePassTypeMappings = new HashSet<EnclosurePassTypeMapping>(0);
	@JsonIgnore
	private Set<Pass> passes = new HashSet<Pass>(0);
	@JsonIgnore
	private Set<CarPass> carPasses = new HashSet<CarPass>(0);
	@JsonIgnore
	private Set<PassDayLimitCategory> passDayLimitCategories = new HashSet<PassDayLimitCategory>(0);
	@JsonIgnore
	private Set<PaidPassHolders> paidPassHolderses = new HashSet<PaidPassHolders>(0);

	public PassSubcategory() {
	}

	public PassSubcategory(int id) {
		this.id = id;
		
	}

	public PassSubcategory(int id, PassCategory passCategory, Integer createdBy, LocalDateTime createdTimestamp, boolean deleted,
			Integer modifiedBy, LocalDateTime modifiedTimestamp, String name, Set<EventPassTypeMapping> eventPassTypeMappings,
			Set<EnclosurePassTypeMapping> enclosurePassTypeMappings, Set<Pass> passes) {
		this.id = id;
		this.passCategory = passCategory;
		this.createdBy = createdBy;
		this.createdTimestamp = createdTimestamp;
		this.deleted = deleted;
		this.modifiedBy = modifiedBy;
		this.modifiedTimestamp = modifiedTimestamp;
		this.name = name;
		this.eventPassTypeMappings = eventPassTypeMappings;
		this.enclosurePassTypeMappings = enclosurePassTypeMappings;
		this.passes = passes;
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
	@JoinColumn(name = "pass_category_id")
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"}) 
	public PassCategory getPassCategory() {
		return this.passCategory;
	}

	public void setPassCategory(PassCategory passCategory) {
		this.passCategory = passCategory;
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
	@Size(max=100, message="It should not be more than 100 characters")
	@NotBlank
	@Pattern(regexp = "[a-zA-Z0-9\\s.,()&-]*", message = "Must not contain special characters")
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "passSubcategory")
	public Set<EventPassTypeMapping> getEventPassTypeMappings() {
		return this.eventPassTypeMappings;
	}

	public void setEventPassTypeMappings(Set<EventPassTypeMapping> eventPassTypeMappings) {
		this.eventPassTypeMappings = eventPassTypeMappings;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "passSubcategory")
	public Set<EnclosurePassTypeMapping> getEnclosurePassTypeMappings() {
		return this.enclosurePassTypeMappings;
	}

	public void setEnclosurePassTypeMappings(Set<EnclosurePassTypeMapping> enclosurePassTypeMappings) {
		this.enclosurePassTypeMappings = enclosurePassTypeMappings;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "passSubcategory")
	public Set<Pass> getPasses() {
		return this.passes;
	}

	public void setPasses(Set<Pass> passes) {
		this.passes = passes;
	}
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "passSubcategory")
	public Set<CarPass> getCarPasses() {
		return this.carPasses;
	}

	public void setCarPasses(Set<CarPass> carPasses) {
		this.carPasses = carPasses;
	}
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "passSubcategory")
	public Set<PassDayLimitCategory> getPassDayLimitCategories() {
		return this.passDayLimitCategories;
	}

	public void setPassDayLimitCategories(Set<PassDayLimitCategory> passDayLimitCategories) {
		this.passDayLimitCategories = passDayLimitCategories;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "passSubcategory")
	public Set<PaidPassHolders> getPaidPassHolderses() {
		return this.paidPassHolderses;
	}

	public void setPaidPassHolderses(Set<PaidPassHolders> paidPassHolderses) {
		this.paidPassHolderses = paidPassHolderses;
	}

}
