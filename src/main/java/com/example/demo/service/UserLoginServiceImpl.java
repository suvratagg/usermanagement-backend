package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.UserLogin;
import com.example.demo.repository.UserLoginRepository;

/**
 * @author suvrat.aggarwal
 *
 */
@Service
public class UserLoginServiceImpl implements UserLoginService {

	@Autowired
	private UserLoginRepository userLoginRepository;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.example.demo.service.UserLoginService#registerUser(com.example.demo.model
	 * .UserLogin)
	 */
	@Override
	public boolean registerUser(UserLogin userLogin) {
		userLoginRepository.save(userLogin);
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.example.demo.service.UserLoginService#findUsername(java.lang.String)
	 */
	@Override
	public UserLogin findUsername(String username) {
		UserLogin userName = userLoginRepository.findUsername(username);
		return userName;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.example.demo.service.UserLoginService#checkPassword(java.lang.String)
	 */
	@Override
	public UserLogin checkPassword(String password) {
		return userLoginRepository.findPassword(password);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.example.demo.service.UserLoginService#add(com.example.demo.model.
	 * UserLogin)
	 */
	@Override
	public boolean add(UserLogin userLogin) {
		userLoginRepository.save(userLogin);
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.example.demo.service.UserLoginService#deleteUser(java.lang.String)
	 */
	@Override
	public int deleteUser(String username) {
		userLoginRepository.deleteUser(username);
		return 1;
	}
}
