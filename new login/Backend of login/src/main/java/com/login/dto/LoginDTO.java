package com.login.dto;

public class LoginDTO {
	private String userEmail;
	private String password;
	
	public LoginDTO(String userEmail, String password) {
		super();
		this.userEmail = userEmail;
		this.password = password;
	}

	public LoginDTO() {
		
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
