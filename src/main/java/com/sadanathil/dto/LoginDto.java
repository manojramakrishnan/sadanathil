package com.sadanathil.dto;

public class LoginDto {

	private Long tcNumber;
	private String password;
	private String role;
	
	public LoginDto() {
		super();
	}
	
	public LoginDto(Long tcNumber, String password, String role) {
		super();
		this.tcNumber = tcNumber;
		this.password = password;
		this.role = role;
	}
	
	public Long getTcNumber() {
		return tcNumber;
	}
	public void setTcNumber(Long tcNumber) {
		this.tcNumber = tcNumber;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
}
