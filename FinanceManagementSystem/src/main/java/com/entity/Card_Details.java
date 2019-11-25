package com.entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="TBL_CARD_DETAILS")
public class Card_Details {
	
	@Id
	@Column(name="CARD_NO")
	private int cardno;
	@Column(name="CARD_TYPE")
	private String cardtype;
	@Column(name="CARD_LIMIT")
	private long cardlimit;
	@Column(name="CARD_STATUS")
	private String cardstatus;
	@Column(name="ISSUE_DATE")
	private LocalDate issuedate;
	@Column(name="VALID_DATE")
	private LocalDate validdate;
	@Column(name="TOTAL_CREDIT")
	private long totalcredit;
	@Column(name="USED_CREDIT")
	private long usedcredit;
	@Column(name="REMAIN_CREDIT")
	private long remaincredit;
	
	@OneToOne
	@JoinColumn(name="USER_ID")
	private User_Profile userprofile;
	 
	
	public String getCardtype() {
		return cardtype;
	}
	public void setCardtype(String cardtype) {
		this.cardtype = cardtype;
	}
	public User_Profile getUserprofile() {
		return userprofile;
	}
	public void setUserprofile(User_Profile userprofile) {
		this.userprofile = userprofile;
	}
	public int getCardno() {
		return cardno;
	}
	public void setCardno(int cardno) {
		this.cardno = cardno;
	}
	public long getCardlimit() {
		return cardlimit;
	}
	public void setCardlimit(long cardlimit) {
		this.cardlimit = cardlimit;
	}
	public String getCardstatus() {
		return cardstatus;
	}
	public void setCardstatus(String cardstatus) {
		this.cardstatus = cardstatus;
	}
	public LocalDate getIssuedate() {
		return issuedate;
	}
	public void setIssuedate(LocalDate issuedate) {
		this.issuedate = issuedate;
	}
	public LocalDate getValiddate() {
		return validdate;
	}
	public void setValiddate(LocalDate validdate) {
		this.validdate = validdate;
	}
	public long getTotalcredit() {
		return totalcredit;
	}
	public void setTotalcredit(long totalcredit) {
		this.totalcredit = totalcredit;
	}
	public long getUsedcredit() {
		return usedcredit;
	}
	public void setUsedcredit(long usedcredit) {
		this.usedcredit = usedcredit;
	}
	public long getRemaincredit() {
		return remaincredit;
	}
	public void setRemaincredit(long remaincredit) {
		this.remaincredit = remaincredit;
	}
	
	

}
