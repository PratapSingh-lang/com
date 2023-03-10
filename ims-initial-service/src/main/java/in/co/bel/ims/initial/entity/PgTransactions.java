package in.co.bel.ims.initial.entity;
// Generated 14-Nov-2022, 2:55:05 pm by Hibernate Tools 4.3.5.Final

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
 * PgTransactions generated by hbm2java
 */
@Entity
@Table(name = "pg_transactions", schema = "tdms")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class PgTransactions implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private int id;
	private Pass pass;
	private Date createdTimestamp;
	private Date modifiedTimestamp;
	private Integer createdBy;
	private Integer modifiedBy;
	private String transactionId;
	private Integer status;
	private String mode;
	private Double amount;
	private Boolean deleted;
	private String errorCode;

	public PgTransactions() {
	}

	public PgTransactions(int id) {
		this.id = id;
	}

	public PgTransactions(int id, Pass pass, Date createdTimestamp, Date modifiedTimestamp, Integer createdBy,
			Integer modifiedBy, String transactionId, Integer status, String mode, Double amount, Boolean deleted,
			String errorCode) {
		this.id = id;
		this.pass = pass;
		this.createdTimestamp = createdTimestamp;
		this.modifiedTimestamp = modifiedTimestamp;
		this.createdBy = createdBy;
		this.modifiedBy = modifiedBy;
		this.transactionId = transactionId;
		this.status = status;
		this.mode = mode;
		this.amount = amount;
		this.deleted = deleted;
		this.errorCode = errorCode;
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
	@JoinColumn(name = "pass_id")
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"}) 
	public Pass getPass() {
		return this.pass;
	}

	public void setPass(Pass pass) {
		this.pass = pass;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "created_timestamp", length = 15)
	public Date getCreatedTimestamp() {
		return this.createdTimestamp;
	}

	public void setCreatedTimestamp(Date createdTimestamp) {
		this.createdTimestamp = createdTimestamp;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "modified_timestamp", length = 21)
	public Date getModifiedTimestamp() {
		return this.modifiedTimestamp;
	}

	public void setModifiedTimestamp(Date modifiedTimestamp) {
		this.modifiedTimestamp = modifiedTimestamp;
	}

	@Column(name = "created_by")
	public Integer getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(Integer createdBy) {
		this.createdBy = createdBy;
	}

	@Column(name = "modified_by")
	public Integer getModifiedBy() {
		return this.modifiedBy;
	}

	public void setModifiedBy(Integer modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	@Column(name = "transaction_id", length = 100)
	public String getTransactionId() {
		return this.transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	@Column(name = "status")
	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	@Column(name = "mode", length = 100)
	public String getMode() {
		return this.mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

	@Column(name = "amount", precision = 17, scale = 17)
	public Double getAmount() {
		return this.amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	@Column(name = "deleted")
	public Boolean getDeleted() {
		return this.deleted;
	}

	public void setDeleted(Boolean deleted) {
		this.deleted = deleted;
	}

	@Column(name = "error_code", length = 500)
	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

}
