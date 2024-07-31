package com.coderscampus.domain;

import java.time.LocalDate;

/** 
 * Branches
 * main/master -> represents the code that's actually live on the internet (ie coderscampus.com)
 * UAT (not typical)
 * QA
 * Development 
 * 
 * 
 * Environments
 * Production -> main/master 
 * QA
 * Dev
 */

public class Profile {
	private Integer id;
	private String profileName;
	private LocalDate createdDate;
	
	public LocalDate getCreatedDate() {
		return createdDate;
	}
	
	public void setCreatedDate (LocalDate createdDate) {
		this.createdDate = createdDate;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getprofileName() {
		return profileName;
	}
	public void setprofileName(String name) {
		this.profileName = name;
		
	}
}
