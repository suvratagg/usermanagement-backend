package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;

/**
 * @author suvrat.aggarwal
 *
 */
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.example.demo.service.UserService#findAll()
	 */
	@Override
	public List<User> findAll() {
		List<User> user = new ArrayList<>();
		user = (List<User>) userRepository.findAll();
		return user;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.example.demo.service.UserService#find(java.lang.String)
	 */
	@Override
	public List<User> find(String username) {
		return userRepository.findUser(username);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.example.demo.service.UserService#add(com.example.demo.model.User)
	 */
	@Override
	public boolean add(User user) {
		userRepository.save(user);
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.example.demo.service.UserService#delete(java.lang.Long)
	 */
	@Override
	public boolean delete(Long userId) {
		userRepository.deleteById(userId);
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.example.demo.service.UserService#updateUser(java.lang.Long,
	 * com.example.demo.model.User)
	 */
	@Override
	public User updateUser(Long userId, User updateUserDetails) {
		Optional<User> user = userRepository.findById(userId);
		user.get().setFirstName(updateUserDetails.getFirstName());
		user.get().setLastName(updateUserDetails.getLastName());
		user.get().setAddress(updateUserDetails.getAddress());
		user.get().setUsername(updateUserDetails.getUsername());
		user.get().setAge(updateUserDetails.getAge());
		User updatedUser = userRepository.save(user.get());
		return updatedUser;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.example.demo.service.UserService#updateAdmin(java.lang.Long,
	 * com.example.demo.model.User)
	 */
	@Override
	public User updateAdmin(Long userId, User updateUserDetails) {
		Optional<User> user = userRepository.findById(userId);
		user.get().setEmployeeCode(updateUserDetails.getEmployeeCode());
		user.get().setEmployeeStatus(updateUserDetails.getEmployeeStatus());
		user.get().setEmployeeReport(updateUserDetails.getEmployeeReport());
		User updatedUser = userRepository.save(user.get());
		return updatedUser;
	}

	@Override
	public User update(Long userId, User updateUserDetails) {
		Optional<User> user = userRepository.findById(userId);
		user.get().setAddress(updateUserDetails.getAddress());
		user.get().setAge(updateUserDetails.getAge());
		user.get().setEmployeeCode(updateUserDetails.getEmployeeCode());
		user.get().setEmployeeStatus(updateUserDetails.getEmployeeStatus());
		user.get().setEmployeeReport(updateUserDetails.getEmployeeReport());
		User updatedUser = userRepository.save(user.get());
		return updatedUser;
	}
}
