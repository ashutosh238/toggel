package com.kcr.KCRDatabase.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity(name="USER")
@Table
@Component
public class User {
	
private String name;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmailId() {
	return emailId;
}
public void setEmailId(String emailId) {
	this.emailId = emailId;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getPhoneNumber() {
	return phoneNumber;
}
public void setPhoneNumber(String phoneNumber) {
	this.phoneNumber = phoneNumber;
}
public String getSecurityQuestion() {
	return securityQuestion;
}
public void setSecurityQuestion(String securityQuestion) {
	this.securityQuestion = securityQuestion;
}
public String getSecurityAnswer() {
	return securityAnswer;
}
public void setSecurityAnswer(String securityAnswer) {
	this.securityAnswer = securityAnswer;
}
public int getHouseNumber() {
	return houseNumber;
}
public void setHouseNumber(int houseNumber) {
	this.houseNumber = houseNumber;
}

public int getSeqId() {
	return seqId;
}
public void setSeqId(int seqId) {
	this.seqId = seqId;
}

private String emailId;
private String password;
private String phoneNumber;
private String securityQuestion;
private String securityAnswer;
private int houseNumber;
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int seqId;
}
