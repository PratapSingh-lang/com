package in.co.bel.ims.initial.entity;
// Generated 20-Sep-2022, 3:54:24 pm by Hibernate Tools 4.3.5.Final

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import org.hibernate.id.enhanced.SequenceStyleGenerator;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Article generated by hbm2java
 */
@Entity
@Table(name = "article", schema = "system")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Article implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private int id;
	private boolean deleted;
	private String name;
	@JsonIgnore
	private Set<Precedence> precedences = new HashSet<Precedence>(0);

	public Article() {
	}

	public Article(int id) {
		this.id = id;
		
	}

	public Article(int id, boolean deleted, String name, Set<Precedence> precedences) {
		this.id = id;
		
		this.name = name;
		this.precedences = precedences;
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

	@Column(name = "deleted", nullable = false)
	public boolean isDeleted() {
		return this.deleted;
	}

	public void setDeleted(Boolean deleted) { 
		
	}

	@Column(name = "name", length = 100)
	@Size(max=100, message="Name should not be more than 100 characters")
	@Pattern(regexp = "[a-zA-Z0-9\\s]*", message = "Must not contain special characters")
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "article")
	public Set<Precedence> getPrecedences() {
		return this.precedences;
	}

	public void setPrecedences(Set<Precedence> precedences) {
		this.precedences = precedences;
	}

}