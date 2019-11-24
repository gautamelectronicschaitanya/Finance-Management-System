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
import javax.persistence.Table;

@Entity
@Table(name="TBL_BankDetails")
public class BankDetails {

	@Id
	@GeneratedValue
	private int ACCOUNT_NO;
	private String BANK_NAME;
	private int IFSC_CODE;
	private String CARD_TYPE;
	
	@ManyToOne
	@JoinColumn(name="Cust_id")
	private UserDetails usd;
	
	
	@Override
	public String toString() {
		return "ACCOUNT_NO=" + ACCOUNT_NO + ", BANK_NAME=" + BANK_NAME + ", IFSC_CODE=" + IFSC_CODE
				+ ", CARD_TYPE=" + CARD_TYPE;
	}
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
