package com.lti.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="EMI_DETAILS")
@SequenceGenerator(name="seq", initialValue=1, allocationSize=100)
public class EMIDetails {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq")
	private int transactionId;
	private int userId;
	private String emi_option;
	private int installmentMonth;
	private LocalDate start_date;
	private LocalDate end_date;
	private int late_fee;
	private int paid_installment;
	private int pending_installment;
	private int cardno;
	public int getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getEmi_option() {
		return emi_option;
	}
	public void setEmi_option(String emi_option) {
		this.emi_option = emi_option;
	}
	public int getInstallmentMonth() {
		return installmentMonth;
	}
	public void setInstallmentMonth(int installmentMonth) {
		this.installmentMonth = installmentMonth;
	}
	public LocalDate getStart_date() {
		return start_date;
	}
	public void setStart_date(LocalDate start_date) {
		this.start_date = start_date;
	}
	public LocalDate getEnd_date() {
		return end_date;
	}
	public void setEnd_date(LocalDate end_date) {
		this.end_date = end_date;
	}
	public int getLate_fee() {
		return late_fee;
	}
	public void setLate_fee(int late_fee) {
		this.late_fee = late_fee;
	}
	public int getPaid_installment() {
		return paid_installment;
	}
	public void setPaid_installment(int paid_installment) {
		this.paid_installment = paid_installment;
	}
	public int getPending_installment() {
		return pending_installment;
	}
	public void setPending_installment(int pending_installment) {
		this.pending_installment = pending_installment;
	}
	public int getCardno() {
		return cardno;
	}
	public void setCardno(int cardno) {
		this.cardno = cardno;
	}
	
	
	
	
}
