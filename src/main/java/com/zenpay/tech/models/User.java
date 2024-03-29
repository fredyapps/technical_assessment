package com.zenpay.tech.models;


import com.fasterxml.jackson.annotation.JsonProperty;


//@lombok.Getter
//@lombok.Setter
public class User  {

	
	 @JsonProperty("firstname")
	 String firstname;
	 
	 @JsonProperty("lastname")
	 String lastname;
	 
	 @JsonProperty("email")
	 String email;
	 
	 @JsonProperty("phonenumber")
	 String phonenumber;
	 
	 public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getUsertype() {
		return usertype;
	}

	public void setUsertype(String usertype) {
		this.usertype = usertype;
	}

	@JsonProperty("address")
	 String address;
	 
	 @JsonProperty("usertype")
	 String usertype;
	 
	 @JsonProperty("registered_on")
	 String registered_on;

	public String getRegistered_on() {
		return registered_on;
	}

	public void setRegistered_on(String registered_on) {
		this.registered_on = registered_on;
	}
	 
	 
	

	
	 
}
