package in.co.bel.ims.initial.entity;
// Generated 20-Sep-2022, 3:54:24 pm by Hibernate Tools 4.3.5.Final

import java.time.LocalDateTime;

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
 * EnclosurePassTypeMapping generated by hbm2java
 */
@Entity
@Table(name = "enclosure_pass_type_mapping", schema = "tdms")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class EnclosurePassTypeMapping implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private int id;
	private Enclosure enclosure;
	private PassCategory passCategory;
	private PassSubcategory passSubcategory;
	private Event event;
	private Integer createdBy;
	private LocalDateTime createdTimestamp;
	private boolean deleted;
	private Integer modifiedBy;
	private LocalDateTime modifiedTimestamp;

	public EnclosurePassTypeMapping() {
	}

	public EnclosurePassTypeMapping(int id, boolean deleted) {
		this.id = id;
		this.deleted = deleted;
	}

	public EnclosurePassTypeMapping(int id, Enclosure enclosure, PassCategory passCategory,
			PassSubcategory passSubcategory, Event event, Integer createdBy, LocalDateTime createdTimestamp, boolean deleted,
			Integer modifiedBy, LocalDateTime modifiedTimestamp) {
		this.id = id;
		this.enclosure = enclosure;
		this.passCategory = passCategory;
		this.passSubcategory = passSubcategory;
		this.event = event;
		this.createdBy = createdBy;
		this.createdTimestamp = createdTimestamp;
		this.deleted = deleted;
		this.modifiedBy = modifiedBy;
		this.modifiedTimestamp = modifiedTimestamp;
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
	@JoinColumn(name = "pass_category_id")
	@NotNull
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"}) 
	public PassCategory getPassCategory() {
		return this.passCategory;
	}

	public void setPassCategory(PassCategory passCategory) {
		this.passCategory = passCategory;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "pass_subcategory_id")
	@NotNull
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"}) 
	public PassSubcategory getPassSubcategory() {
		return this.passSubcategory;
	}

	public void setPassSubcategory(PassSubcategory passSubcategory) {
		this.passSubcategory = passSubcategory;
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

}
