package com.spring.sample.payload;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDTO {

	private String username;
	private String firstname;
	private String lastname;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
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
	
	
}
