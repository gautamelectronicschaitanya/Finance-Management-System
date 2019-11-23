package com.lti.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CARD_DETAILS")
public class CardDetails {

	@Id
	@GeneratedValue
	private int card_number;
	private int us_id;
	private String us_name;
	private Date issue_date;
	private Date valid_till;
	private String card_type;
	private String card_status;
	private double total_credit;
	private double used_credit;
	private double remaining_credit;
	private double card_limit;
	public int getCard_number() {
		return card_number;
	}
	public void setCard_number(int card_number) {
		this.card_number = card_number;
	}
	public int getUs_id() {
		return us_id;
	}
	public void setUs_id(int us_id) {
		this.us_id = us_id;
	}
	public String getUs_name() {
		return us_name;
	}
	public void setUs_name(String us_name) {
		this.us_name = us_name;
	}
	public Date getIssue_date() {
		return issue_date;
	}
	public void setIssue_date(Date issue_date) {
		this.issue_date = issue_date;
	}
	public Date getValid_till() {
		return valid_till;
	}
	public void setValid_till(Date valid_till) {
		this.valid_till = valid_till;
	}
	public String getCard_type() {
		return card_type;
	}
	public void setCard_type(String card_type) {
		this.card_type = card_type;
	}
	public String getCard_status() {
		return card_status;
	}
	public void setCard_status(String card_status) {
		this.card_status = card_status;
	}
	public double getTotal_credit() {
		return total_credit;
	}
	public void setTotal_credit(double total_credit) {
		this.total_credit = total_credit;
	}
	public double getUsed_credit() {
		return used_credit;
	}
	public void setUsed_credit(double used_credit) {
		this.used_credit = used_credit;
	}
	public double getRemaining_credit() {
		return remaining_credit;
	}
	public void setRemaining_credit(double remaining_credit) {
		this.remaining_credit = remaining_credit;
	}
	public double getCard_limit() {
		return card_limit;
	}
	public void setCard_limit(double card_limit) {
		this.card_limit = card_limit;
	}
	
	
}
