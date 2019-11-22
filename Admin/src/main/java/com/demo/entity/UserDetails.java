package com.demo.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SecondaryTable;
import javax.persistence.Table;
import java.util.*;
@Entity
@Table(name="TBL_CustomerProfile")
public class UserDetails {
	@Id
	private int USERID;
	private String NAME;
	private int PHONE_NO;
	private String EMAIL;
	private String PASSWORD;
	
	@OneToMany(mappedBy="usd",cascade=CascadeType.ALL)
	private Set<BankDetails> details; 
	

	public Set<BankDetails> getDetails() {
		return details;
	}
	public void setDetails(Set<BankDetails> details) {
		this.details = details;
	}
	public int getUSERID() {
		return USERID;
	}
	public void setUSERID(int uSERID) {
		USERID = uSERID;
	}
	public String getNAME() {
		return NAME;
	}
	public void setNAME(String nAME) {
		NAME = nAME;
	}
	public int getPHONE_NO() {
		return PHONE_NO;
	}
	public void setPHONE_NO(int pHONE_NO) {
		PHONE_NO = pHONE_NO;
	}
	public String getEMAIL() {
		return EMAIL;
	}
	public void setEMAIL(String eMAIL) {
		EMAIL = eMAIL;
	}
	public String getPASSWORD() {
		return PASSWORD;
	}
	public void setPASSWORD(String pASSWORD) {
		PASSWORD = pASSWORD;
	}
}