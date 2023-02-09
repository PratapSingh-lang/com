package in.co.bel.ims.initial.entity;
// Generated 23-Nov-2022, 6:18:40 pm by Hibernate Tools 4.3.5.Final

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
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import org.hibernate.id.enhanced.SequenceStyleGenerator;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * PaidPassHolders generated by hbm2java
 */
@Entity
@Table(name = "paid_pass_holders", schema = "tdms")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class PaidPassHolders implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private ImsUser imsUser;
	private EnclosureGroup enclosureGroup;
	private IdentityProof identityProof;
	private PassSubcategory passSubcategory;
	private Event event;
	private String name;
	private String mobileNo;
	private String email;
	private String address;
	private String identityProofNumber;
	private byte[] identityProofDocument;
	private byte[] identityProofDocument2;
	private LocalDateTime createdTimestamp;
	private Date modifiedTimestamp;
	private Boolean deleted;
	private Date dob;
	@JsonIgnore
	private Set<Pass> passes = new HashSet<Pass>(0);

	public PaidPassHolders() {
	}

	public PaidPassHolders(int id) {
		this.id = id;
	}

	public PaidPassHolders(int id, ImsUser imsUser, IdentityProof identityProof, PassSubcategory passSubcategory,
			Event event, String name, String mobileNo, String email, String identityProofNumber,
			byte[] identityProofDocument, LocalDateTime createdTimestamp, Date modifiedTimestamp, Boolean deleted) {
		this.id = id;
		this.imsUser = imsUser;
		this.identityProof = identityProof;
		this.passSubcategory = passSubcategory;
		this.event = event;
		this.name = name;
		this.mobileNo = mobileNo;
		this.email = email;
		this.identityProofNumber = identityProofNumber;
		this.identityProofDocument = identityProofDocument;
		this.createdTimestamp = createdTimestamp;
		this.modifiedTimestamp = modifiedTimestamp;
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
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	public ImsUser getImsUser() {
		return this.imsUser;
	}

	public void setImsUser(ImsUser imsUser) {
		this.imsUser = imsUser;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "identity_proof_id")
//	@NotBlank
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	public IdentityProof getIdentityProof() {
		return this.identityProof;
	}

	public void setIdentityProof(IdentityProof identityProof) {
		this.identityProof = identityProof;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "pass_subcategory_id")
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	public PassSubcategory getPassSubcategory() {
		return this.passSubcategory;
	}

	public void setPassSubcategory(PassSubcategory passSubcategory) {
		this.passSubcategory = passSubcategory;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "event_id")
//	@NotNull
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	public Event getEvent() {
		return this.event;
	}

	public void setEvent(Event event) {
		this.event = event;
	}

	@Column(name = "name", length = 100)
	@Size(max=100, message="Name should not be more than 100 characters")
//	@NotBlank
	@Pattern(regexp = "[a-zA-Z,.\\s]*", message = "Must not contain special characters")
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "mobile_no", length = 20)
	@Size(min=10, max=10, message="Mobile No. should not be more than 10 characters")
//	@NotBlank
	@Pattern(regexp = "[0-9\\s]*", message = "Must not contain special characters")
	public String getMobileNo() {
		return this.mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	@Column(name = "email", length = 100)
	@Size(max=100, message="It should not be more than 100 characters")
//	@NotBlank
	@Pattern(regexp = "^(?:(?=.{1,100}@)[A-Za-z0-9_-]+([A-Za-z0-9._-]+)*@[^-][A-Za-z0-9-]+([A-Za-z0-9.-]+)*(.[A-Za-z]{2,}))?$", message = "Please enter valid email")
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	@Column(name = "address", length = 200)
	@Size(max=200, message="It should not be more than 200 characters")
	@Pattern(regexp = "[a-zA-Z0-9\\s.'@%&/,()#-]*", message = "Must not contain special characters")
	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}


	@Column(name = "identity_proof_number", length = 50)
	@Size(max=50, message="It should not be more than 50 characters")
//	@NotBlank
	@Pattern(regexp = "[a-zA-Z0-9\\s/-]*", message = "Must not contain special characters")
	public String getIdentityProofNumber() {
		return this.identityProofNumber;
	}

	public void setIdentityProofNumber(String identityProofNumber) {
		this.identityProofNumber = identityProofNumber;
	}

	@Column(name = "identity_proof_document")
	public byte[] getIdentityProofDocument() {
		return this.identityProofDocument;
	}

	public void setIdentityProofDocument(byte[] identityProofDocument) {
		this.identityProofDocument = identityProofDocument;
	}
	
	@Column(name = "identity_proof_document2")
	public byte[] getIdentityProofDocument2() {
		return this.identityProofDocument2;
	}

	public void setIdentityProofDocument2(byte[] identityProofDocument2) {
		this.identityProofDocument2 = identityProofDocument2;
	}

	@Column(name = "created_timestamp", length = 29)
	public LocalDateTime getCreatedTimestamp() {
		return this.createdTimestamp;
	}

	public void setCreatedTimestamp(LocalDateTime createdTimestamp) {
		this.createdTimestamp = createdTimestamp;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "modified_timestamp", length = 29)
	public Date getModifiedTimestamp() {
		return this.modifiedTimestamp;
	}

	public void setModifiedTimestamp(Date modifiedTimestamp) {
		this.modifiedTimestamp = modifiedTimestamp;
	}

	@Column(name = "deleted")
	public Boolean getDeleted() {
		return this.deleted;
	}

	public void setDeleted(Boolean deleted) {
		this.deleted = deleted;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "dob", length = 13)
	public Date getDob() {
		return this.dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "paidPassHolders")
	public Set<Pass> getPasses() {
		return this.passes;
	}

	public void setPasses(Set<Pass> passes) {
		this.passes = passes;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "enclosure_group_id")
//	@NotNull
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	public EnclosureGroup getEnclosureGroup() {
		return this.enclosureGroup;
	}

	public void setEnclosureGroup(EnclosureGroup enclosureGroup) {
		this.enclosureGroup = enclosureGroup;
	}

}