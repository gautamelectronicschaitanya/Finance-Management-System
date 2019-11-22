package com.demo.entity;

import javax.persistence.*;

@Entity
@Table(name="TBL_AUTH")
public class AuthDetails {
	
	@Id
	int id;
	private String status;
	
	@OneToOne
	@JoinColumn(name="Pid")
	private UserDetails userDetails;
	

	public UserDetails getUserDetails() {
		return userDetails;
	}

	public void setUserDetails(UserDetails userDetails) {
		this.userDetails = userDetails;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	

	
}
