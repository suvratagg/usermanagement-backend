package com.example.demo.service;

import com.example.demo.model.UserLogin;

public interface UserLoginService {
	
	public boolean registerUser(UserLogin userLogin);
	
	public UserLogin findUsername(String username);
	
	UserLogin checkPassword(String password);
	
	public boolean add(UserLogin userLogin);
	
	public int deleteUser(String username);
}
