package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public List<User> findAll() {
		List<User> user = new ArrayList<>();
		user = (List<User>) userRepository.findAll();
		return user;
	}

	@Override
	public List<User> find(String username) {
		return userRepository.findUser(username);
	}

	@Override
	public boolean add(User user) {
		userRepository.save(user);
		return true;
	}

	@Override
	public boolean delete(Long userId) {
		userRepository.deleteById(userId);
		return true;
	}

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

	@Override
	public User updateAdmin(Long userId, User updateUserDetails) {
		Optional<User> user = userRepository.findById(userId);
		user.get().setEmployeeCode(updateUserDetails.getEmployeeCode());
		user.get().setEmployeeStatus(updateUserDetails.getEmployeeStatus());
		user.get().setEmployeeReport(updateUserDetails.getEmployeeReport());
		User updatedUser = userRepository.save(user.get());
		return updatedUser;
	}

}
