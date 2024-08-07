package com.train.booking.pojo;

import java.util.ArrayList;

public class Person {
	String firstName;
	String lastName;
	ArrayList<Address> adList;
	Profile profile;
	
	
	 public Profile getProfile() {
		return profile;
	}
	public void setProfile(Profile profile) {
		this.profile = profile;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public ArrayList<Address> getAdList() {
		return adList;
	}
	public void setAdList(ArrayList<Address> adList) {
		this.adList = adList;
	}
	
	
}
