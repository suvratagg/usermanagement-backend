package com.example.demo.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author suvrat.aggarwal
 *
 */
@Entity(name = "login")
@Table(name = "login")
public class UserLogin implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * This field contains username
	 */
	@Id
	@Column(name = "username")
	private String username;

	/**
	 * This field contains password
	 */
	@Column(name = "password")
	private String password;

	/**
	 * This field contains first name
	 */
	@Column(name = "firstname")
	private String firstName;

	/**
	 * This field contains last name
	 */
	@Column(name = "lastname")
	private String lastName;

	/**
	 * This field contains user type
	 */
	@Column(name = "usertype")
	private String userType;

	/**
	 * Constructor without fields
	 */
	public UserLogin() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param username
	 * @param password
	 * @param firstName
	 * @param lastName
	 * @param userType
	 */
	public UserLogin(String username, String password, String firstName, String lastName, String userType) {
		super();
		this.username = username;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.userType = userType;
	}

	/**
	 * @return
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return
	 */
	public String getUserType() {
		return userType;
	}

	/**
	 * @param userType
	 */
	public void setUserType(String userType) {
		this.userType = userType;
	}
}
