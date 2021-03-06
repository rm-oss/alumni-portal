package org.cevahir.alumni.model;

// Generated 29-Jun-2008 12:22:55 by Hibernate Tools 3.2.2.GA

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * City generated by hbm2java
 */
@Entity
@Table(name = "city", catalog = "alumni")
public class City extends Model implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8935148455570998594L;
	private int id;
	private String name;
	private Set<Job> jobs = new HashSet<Job>(0);
	private Set<User> users = new HashSet<User>(0);

	public City() {
	}

	public City(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public City(int id, String name, Set<Job> jobs, Set<User> users) {
		this.id = id;
		this.name = name;
		this.jobs = jobs;
		this.users = users;
	}

	@Id
	@Column(name = "id", unique = true, nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "name", nullable = false, length = 128)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "city")
	public Set<Job> getJobs() {
		return this.jobs;
	}

	public void setJobs(Set<Job> jobs) {
		this.jobs = jobs;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "city")
	public Set<User> getUsers() {
		return this.users;
	}

	public void setUsers(Set<User> users) {
		this.users = users;
	}

}
