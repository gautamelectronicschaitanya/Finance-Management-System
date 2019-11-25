package com.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="TBL_PRODUCT_PURCHASE")
public class Product_Purchase_Information {

	@Id
	@Column(name="PRODUCT_ID")
	private int  productpid;
	@Column(name="PRODUCT_NAME")
	private String product_name;
	@Column(name="AMOUNT")
	private long amount;
	@Column(name="PAID_AMOUNT")
	private long paidamount;
	@Column(name="BALANCE_AMOUNT")
	private long balanceamount;
	
	public Product_Information getProductinformation() {
		return productinformation;
	}
	public void setProductinformation(Product_Information productinformation) {
		this.productinformation = productinformation;
	}
	
	@OneToOne
	@JoinColumn(name="PRODUCT_ID")
	private Product_Information productinformation;
	
	@OneToOne
	@JoinColumn(name="CARD_NO")
	private Card_Details carddetails;
	
	
	public Card_Details getCarddetails() {
		return carddetails;
	}
	public void setCarddetails(Card_Details carddetails) {
		this.carddetails = carddetails;
	}
	public int getProductpid() {
		return productpid;
	}
	public void setProductpid(int productpid) {
		this.productpid = productpid;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public long getAmount() {
		return amount;
	}
	public void setAmount(long amount) {
		this.amount = amount;
	}
	public long getPaidamount() {
		return paidamount;
	}
	public void setPaidamount(long paidamount) {
		this.paidamount = paidamount;
	}
	public long getBalanceamount() {
		return balanceamount;
	}
	public void setBalanceamount(long balanceamount) {
		this.balanceamount = balanceamount;
	}
	
	
	
}
