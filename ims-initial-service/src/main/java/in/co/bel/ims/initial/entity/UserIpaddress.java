package in.co.bel.ims.initial.entity;
// Generated 23-Nov-2022, 6:10:13 pm by Hibernate Tools 4.3.5.Final

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import org.hibernate.id.enhanced.SequenceStyleGenerator;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * UserIpaddress generated by hbm2java
 */
@Entity
@Table(name = "user_ipaddress", schema = "tdms")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class UserIpaddress implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private ImsUser imsUser;
	private Boolean deleted;
	private Date createdTimestamp;
	private Date modifiedTimestamp;
	private String ipaddress;

	public UserIpaddress() {
	}

	public UserIpaddress(int id) {
		this.id = id;
	}

	public UserIpaddress(int id, ImsUser imsUser, Boolean deleted, Date createdTimestamp, Date modifiedTimestamp,
			String ipaddress) {
		this.id = id;
		this.imsUser = imsUser;
		this.deleted = deleted;
		this.createdTimestamp = createdTimestamp;
		this.modifiedTimestamp = modifiedTimestamp;
		this.ipaddress = ipaddress;
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

	@Column(name = "deleted")
	public Boolean getDeleted() {
		return this.deleted;
	}

	public void setDeleted(Boolean deleted) {
		this.deleted = deleted;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "created_timestamp", length = 29)
	public Date getCreatedTimestamp() {
		return this.createdTimestamp;
	}

	public void setCreatedTimestamp(Date createdTimestamp) {
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

	@Column(name = "ipaddress", length = 50)
	public String getIpaddress() {
		return this.ipaddress;
	}

	public void setIpaddress(String ipaddress) {
		this.ipaddress = ipaddress;
	}

}
