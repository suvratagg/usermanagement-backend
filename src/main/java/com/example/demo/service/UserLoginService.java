package com.example.demo.service;

import com.example.demo.model.UserLogin;

/**
 * @author suvrat.aggarwal
 *
 */
public interface UserLoginService {
	
	/**
	 * @param userLogin
	 * @return
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
