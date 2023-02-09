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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
 * Precedence generated by hbm2java
 */
@Entity
@Table(name = "precedence", schema = "system")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Precedence implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private int id;
	private Article article;
	private boolean deleted;
	private String title;
	@JsonIgnore
	private Set<ImsUser> imsUsers = new HashSet<ImsUser>(0);

	public Precedence() {
	}

	public Precedence(int id) {
		this.id = id;
	}

	public Precedence(int id, Article article, boolean deleted, String title, Set<ImsUser> imsUsers) {
		this.id = id;
		this.article = article;
		
		this.title = title;
		this.imsUsers = imsUsers;
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
	@JoinColumn(name = "article_id")
	//@NotNull
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"}) 
	public Article getArticle() {
		return this.article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}

	@Column(name = "deleted", nullable = false)
	public boolean isDeleted() {
		return this.deleted;
	}

	public void setDeleted(Boolean deleted) { 	 this.deleted = deleted;
		
	}

	@Column(name = "title", length = 500)
	@Size(max=500, message="Name should not be more than 500 characters")
	@Pattern(regexp = "[a-zA-Z0-9\\s.,()&-]*", message = "Must not contain special characters")
	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "precedence")
	public Set<ImsUser> getImsUsers() {
		return this.imsUsers;
	}

	public void setImsUsers(Set<ImsUser> imsUsers) {
		this.imsUsers = imsUsers;
	}

}
