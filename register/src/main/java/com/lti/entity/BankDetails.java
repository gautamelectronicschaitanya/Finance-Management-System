package com.lti.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="BANK_DETAILS")
public class BankDetails {

	
	@Id
	private int accNo;
	private String cardType;
	private String bankName;
	private String ifscCode;


	@OneToOne
	@JoinColumn(name="uID")
	private Registeration registeration;


	
	public String getCardType() {
		return cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public String getIfscCode() {
		return ifscCode;
	}
	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}
	public Registeration getRegisteration() {
		return registeration;
	}
	public void setRegisteration(Registeration registeration) {
		this.registeration = registeration;
	}
	
	
}
