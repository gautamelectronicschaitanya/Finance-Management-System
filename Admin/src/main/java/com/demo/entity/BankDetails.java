package com.demo.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="BANK_DETAILS")
public class BankDetails {

	@Id
	private int ACCOUNT_NO;
	private String BANK_NAME;
	private int IFSC_CODE;
	private String CARD_TYPE;
	
	@OneToOne(cascade=CascadeType.ALL)
	private UserDetails usd;
	
	
	public UserDetails getUsd() {
		return usd;
	}
	public void setUsd(UserDetails usd) {
		this.usd = usd;
	}
	public int getACCOUNT_NO() {
		return ACCOUNT_NO;
	}
	public void setACCOUNT_NO(int aCCOUNT_NO) {
		ACCOUNT_NO = aCCOUNT_NO;
	}
	public String getBANK_NAME() {
		return BANK_NAME;
	}
	public void setBANK_NAME(String bANK_NAME) {
		BANK_NAME = bANK_NAME;
	}
	public int getIFSC_CODE() {
		return IFSC_CODE;
	}
	public void setIFSC_CODE(int iFSC_CODE) {
		IFSC_CODE = iFSC_CODE;
	}
	public String getCARD_TYPE() {
		return CARD_TYPE;
	}
	public void setCARD_TYPE(String cARD_TYPE) {
		CARD_TYPE = cARD_TYPE;
	}

}
