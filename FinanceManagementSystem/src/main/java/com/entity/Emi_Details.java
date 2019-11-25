package com.entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="TBL_EMI_DETAILS")
public class Emi_Details {

	@Id
	@Column(name="TRANSACTION_NO")
	private int transid;
	@Column(name="EMI_OPTION")
	private String emioption;
	@Column(name="INSTALLMENT")
	private long installment;
	@Column(name="START_DATE")
	LocalDate startdate;
	@Column(name="END_DATE")                      
	LocalDate enddate;
	@Column(name="LATE_FEE")
	private long latefee;
	@Column(name="PAID_INSTALLMENT")
	private long paidinstallment;
	@Column(name="PENDING_ISTALLMENT")
	private long pendinginstallment;
	
	@ManyToOne
	@JoinColumn(name="CARD_NO")
	private Card_Details carddetails;
	
			
	public int getTransid() {
		return transid;
	}
	public void setTransid(int transid) {
		this.transid = transid;
	}
	public String getEmioption() {
		return emioption;
	}
	public void setEmioption(String emioption) {
		this.emioption = emioption;
	}
	public long getInstallment() {
		return installment;
	}
	public void setInstallment(long installment) {
		this.installment = installment;
	}
	public LocalDate getStartdate() {
		return startdate;
	}
	public void setStartdate(LocalDate startdate) {
		this.startdate = startdate;
	}
	public LocalDate getEnddate() {
		return enddate;
	}
	public void setEnddate(LocalDate enddate) {
		this.enddate = enddate;
	}
	public long getLatefee() {
		return latefee;
	}
	public void setLatefee(long latefee) {
		this.latefee = latefee;
	}
	public long getPaidinstallment() {
		return paidinstallment;
	}
	public void setPaidinstallment(long paidinstallment) {
		this.paidinstallment = paidinstallment;
	}
	public long getPendinginstallment() {
		return pendinginstallment;
	}
	public void setPendinginstallment(long pendinginstallment) {
		this.pendinginstallment = pendinginstallment;
	}
	

}
