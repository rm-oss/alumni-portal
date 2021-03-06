package org.cevahir.alumni.model;

// Generated 29-Jun-2008 12:22:55 by Hibernate Tools 3.2.2.GA

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Mail generated by hbm2java
 */
@Entity
@Table(name = "mail", catalog = "alumni")
public class Mail extends Model implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4952801986305456386L;
	private int id;
	private User user;
	private String alias;
	private String address;
	private boolean active;
	private boolean approved;
	private short privacyLevel;
	private boolean deleted;
	private Date creationDate;
	private Date deletionDate;

	public Mail() {
	}

	public Mail(int id, User user, String alias, String address,
			boolean active, boolean approved, short privacyLevel,
			boolean deleted, Date creationDate) {
		this.id = id;
		this.user = user;
		this.alias = alias;
		this.address = address;
		this.active = active;
		this.approved = approved;
		this.privacyLevel = privacyLevel;
		this.deleted = deleted;
		this.creationDate = creationDate;
	}

	public Mail(int id, User user, String alias, String address,
			boolean active, boolean approved, short privacyLevel,
			boolean deleted, Date creationDate, Date deletionDate) {
		this.id = id;
		this.user = user;
		this.alias = alias;
		this.address = address;
		this.active = active;
		this.approved = approved;
		this.privacyLevel = privacyLevel;
		this.deleted = deleted;
		this.creationDate = creationDate;
		this.deletionDate = deletionDate;
	}

	@Id
	@Column(name = "id", unique = true, nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id", nullable = false)
	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Column(name = "alias", nullable = false)
	public String getAlias() {
		return this.alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	@Column(name = "address", nullable = false)
	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Column(name = "active", nullable = false)
	public boolean isActive() {
		return this.active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	@Column(name = "approved", nullable = false)
	public boolean isApproved() {
		return this.approved;
	}

	public void setApproved(boolean approved) {
		this.approved = approved;
	}

	@Column(name = "privacy_level", nullable = false)
	public short getPrivacyLevel() {
		return this.privacyLevel;
	}

	public void setPrivacyLevel(short privacyLevel) {
		this.privacyLevel = privacyLevel;
	}

	@Column(name = "deleted", nullable = false)
	public boolean isDeleted() {
		return this.deleted;
	}

	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "creation_date", nullable = false, length = 29)
	public Date getCreationDate() {
		return this.creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "deletion_date", length = 29)
	public Date getDeletionDate() {
		return this.deletionDate;
	}

	public void setDeletionDate(Date deletionDate) {
		this.deletionDate = deletionDate;
	}

}
