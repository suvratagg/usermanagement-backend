package com.example.demo.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "user")
@Table(name = "user")
public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "userId")
	private Long userId;
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "username")
	private String username;

	@Column(name = "address")
	private String address;
	
	@Column(name = "age")
	private int age;
	
	@Column(name = "user_type")
	private String userType;
	
	@Column(name = "employee_code")
	private String employeeCode;

	@Column(name = "employee_status")
	private String employeeStatus;

	@Column(name = "employee_report")
	private String employeeReport;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(Long userId, String firstName, String lastName, String username, String address, int age,
			String userType, String employeeCode, String employeeStatus, String employeeReport) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.username = username;
		this.address = address;
		this.age = age;
		this.userType = userType;
		this.employeeCode = employeeCode;
		this.employeeStatus = employeeStatus;
		this.employeeReport = employeeReport;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
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

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String getEmployeeCode() {
		return employeeCode;
	}

	public void setEmployeeCode(String employeeCode) {
		this.employeeCode = employeeCode;
	}

	public String getEmployeeStatus() {
		return employeeStatus;
	}

	public void setEmployeeStatus(String employeeStatus) {
		this.employeeStatus = employeeStatus;
	}

	public String getEmployeeReport() {
		return employeeReport;
	}

	public void setEmployeeReport(String employeeReport) {
		this.employeeReport = employeeReport;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
