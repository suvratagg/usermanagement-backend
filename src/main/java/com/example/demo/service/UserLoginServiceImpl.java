package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.UserLogin;
import com.example.demo.repository.UserLoginRepository;

@Service
public class UserLoginServiceImpl implements UserLoginService {
	
	@Autowired 
	private UserLoginRepository userLoginRepository;

	@Override
	public boolean registerUser(UserLogin userLogin) {
		userLoginRepository.save(userLogin);
		return true;
	}

	@Override
	public UserLogin findUsername(String username) {
		UserLogin userName = userLoginRepository.findUsername(username);
		return userName;
	}

	@Override
	public UserLogin checkPassword(String password) {
		return userLoginRepository.findPassword(password);
	}

	@Override
	public boolean add(UserLogin userLogin) {
		userLoginRepository.save(userLogin);
		return true;
	}

	@Override
	public int deleteUser(String username) {
		userLoginRepository.deleteUser(username);
		return 1;
	}
}
