package com.sadanathil.entities;

import javax.persistence.*;

@Entity
@Table(name="users",uniqueConstraints=@UniqueConstraint(columnNames="email"))
public class User {
	
	private String email;
	private String password;
	private String role;
	private String fullName;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id")
	private Long id;
	
	public User() {
		super();
	}
	
	public User(String email, String password, String role, String fullName) {
		super();
		this.email = email;
		this.password = password;
		this.role = role;
		this.fullName = fullName;
		
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
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
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

}
