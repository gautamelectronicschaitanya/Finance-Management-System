package com.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import java.util.List;

import javax.persistence.Column;

@Entity
@Table(name="TBL_USER_PROFILE")
public class User_Profile {

	@Id
	@Column(name="USERID")
	private int userid;
	@Column(name="NAME")
	private String username;
	@Column(name="EMAIL")
	private String email ;
	@Column(name="PHONE_NO")
	private long phoneno;
	@Column(name="PASSWORD")
	private String password;	
	@Column(name="ADDRESS")
	private String address;
	
	@OneToMany
	private List<Emi_Details> emidetails; 
	
	
	public List<Emi_Details> getEmidetails() {
		return emidetails;
	}
	public void setEmidetails(List<Emi_Details> emidetails) {
		this.emidetails = emidetails;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(long phoneno) {
		this.phoneno = phoneno;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
