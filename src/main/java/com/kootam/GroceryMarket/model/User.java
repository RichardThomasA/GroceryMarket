package com.kootam.GroceryMarket.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "user_login")
public class User {

	public static final String USERTYPE_ADMIN = "ADMIN";
	public static final String USERTYPE_BACKOFFICE = "BACKOFFICE";
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "u_id")
	private Long id;
	
	@Column(name = "u_username", length = 45,nullable = false )
	private String username;
	
	@Column(name = "u_password", length = 45,nullable = false )
	private String password;
	
	@Column(name = "u_usertype", length = 45,nullable = false )
	private String usertype;
	
	public User() {
		
	}

	public User(String username, String password, String usertype) {
		super();
		this.username = username;
		this.password = password;
		this.usertype = usertype;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsertype() {
		return usertype;
	}

	public void setUsertype(String usertype) {
		this.usertype = usertype;
	}
	
	
}
