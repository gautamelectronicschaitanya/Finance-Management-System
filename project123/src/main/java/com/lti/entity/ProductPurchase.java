package com.lti.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PRODUCT_PURCHASE_INFO")
public class ProductPurchase {

	@Id
	@GeneratedValue
	private int pp_id;
	
	private int product_id;
	private String product_name;
	private double amount;
	private double paid_amount;
	private double balance_amount;
	private double card_number;
	public int getPp_id() {
		return pp_id;
	}
	public void setPp_id(int pp_id) {
		this.pp_id = pp_id;
	}
	public int getProduct_id() {
		return product_id;
	}
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public double getPaid_amount() {
		return paid_amount;
	}
	public void setPaid_amount(double paid_amount) {
		this.paid_amount = paid_amount;
	}
	public double getBalance_amount() {
		return balance_amount;
	}
	public void setBalance_amount(double balance_amount) {
		this.balance_amount = balance_amount;
	}
	public double getCard_number() {
		return card_number;
	}
	public void setCard_number(double card_number) {
		this.card_number = card_number;
	}
	
	
}
