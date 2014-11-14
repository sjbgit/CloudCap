package org.magnum.mobilecloud.video.repository;

import java.util.Date;

import org.springframework.data.annotation.Id;

import com.google.common.base.Objects;

public class User {
	@Id
	private long id;

	private String firstName;
	private String password;
	private long duration;
	//private String medicalRecordNumber;
	private Date dateOfBirth;

	public User() {
	}

	public User(String firstName, String password, long duration) {
		super();
		this.firstName = firstName;
		this.password = password;
		this.duration = duration;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	/*
	public long getDuration() {
		return duration;
	}

	public void setDuration(long duration) {
		this.duration = duration;
	}
	*/

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	/**
	 * Two Videos will generate the same hashcode if they have exactly the same
	 * values for their name, url, and duration.
	 * 
	 */
	@Override
	public int hashCode() {
		// Google Guava provides great utilities for hashing
		return Objects.hashCode(firstName, password, duration);
	}

	/**
	 * Two Videos are considered equal if they have exactly the same values for
	 * their name, url, and duration.
	 * 
	 */
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof User) {
			User other = (User) obj;
			// Google Guava provides great utilities for equals too!
			return Objects.equal(firstName, other.firstName)
					&& Objects.equal(password, other.password)
					&& duration == other.duration;
		} else {
			return false;
		}
	}
}
