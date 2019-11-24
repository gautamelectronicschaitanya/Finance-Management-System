package com.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TBL_ADMIN_DETAILS")
public class AdminDetails {
 @Id
 @Column(nullable=false) 
 private int adminId;
 @Column(name="USER_NAME")
 private String adminName;
 @Column(name="PASSWORD")
 private String adminPassword;
public int getAdminId() {
	return adminId;
}
public void setAdminId(int adminId) {
	this.adminId = adminId;
}
public String getAdminName() {
	return adminName;
}
public void setAdminName(String adminName) {
	this.adminName = adminName;
}
public String getAdminPassword() {
	return adminPassword;
}
public void setAdminPassword(String adminPassword) {
	this.adminPassword = adminPassword;
}
@Override
public String toString() {
	return "adminId=" + adminId + ", adminName=" + adminName + ", adminPassword=" + adminPassword;
}
 
}
