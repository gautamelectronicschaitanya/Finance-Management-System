package com.entity;

import javax.persistence.*;

@Entity
@Table(name="TBL_BANK_DETAILS")
public class Bank_Details {

	@Id
	@Column(name="ACCOUNT_NO")
	private int accountno;
	@Column(name="CARD_TPE")
	private String cardtype;
	@Column(name="BANK_NAME")
	private String bankname;
	@Column(name="IFSC_CODE")
	private String ifsccode;
	
	 @OneToOne
	 @JoinColumn(name="CUST_ID")
	 private User_Profile userprofile;
	 
	
	public User_Profile getUserprofile() {
		return userprofile;
	}
	public void setUserprofile(User_Profile userprofile) {
		this.userprofile = userprofile;
	}
	public int getAccountno() {
		return accountno;
	}
	public void setAccountno(int accountno) {
		this.accountno = accountno;
	}
	public String getCardtype() {
		return cardtype;
	}
	public void setCardtype(String cardtype) {
		this.cardtype = cardtype;
	}
	public String getBankname() {
		return bankname;
	}
	public void setBankname(String bankname) {
		this.bankname = bankname;
	}
	public String getIfsccode() {
		return ifsccode;
	}
	public void setIfsccode(String ifsccode) {
		this.ifsccode = ifsccode;
	}
	
	
	
}
