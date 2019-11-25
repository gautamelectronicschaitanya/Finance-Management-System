package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="TBL_PRODUCT_INFORMATION")
public class Product_Information {

	@Id
	@Column(name="P_ID")
	private int pid;
	@Column(name="PRODUCT_IMAGE")
	private String productname;
	@Column(name="P_INFO")
	private String productinfo;
	@Column(name="PRODUCT_AMOUNT")
	private long amount;
	@Column(name="PRODUCT_IMAGE",insertable = false, updatable = false)
	private String image;
		
	
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public String getProductinfo() {
		return productinfo;
	}
	public void setProductinfo(String productinfo) {
		this.productinfo = productinfo;
	}
	public long getAmount() {
		return amount;
	}
	public void setAmount(long amount) {
		this.amount = amount;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	
	
	
	
}
