package com.example.demo.service;

import javax.mail.MessagingException;

import com.example.demo.model.UserLogin;

/**
 * @author suvrat.aggarwal
 *
 */
public interface UserLoginService {
	
	/**
	 * @param userLogin
	 * @return
	 * @throws MessagingException 
	 */
	public boolean registerUser(UserLogin userLogin);
	
	/**
	 * @param username
	 * @return
	 */
	public UserLogin findUsername(String username);
	
	/**
	 * @param password
	 * @return
	 */
	UserLogin checkPassword(String password);
	
	/**
	 * @param userLogin
	 * @return
	 */
	public boolean add(UserLogin userLogin);
	
	/**
	 * @param username
	 * @return
	 */
	public int deleteUser(String username);
}
