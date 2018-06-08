package com.example.demo.service;

import java.util.List;
import com.example.demo.model.User;

/**
 * @author suvrat.aggarwal
 *
 */
public interface UserService {

	/**
	 * @return
	 */
	public List<User> findAll();

	/**
	 * @param userId
	 * @return
	 */
	public List<User> find(String userId);

	/**
	 * @param user
	 * @return
	 */
	public boolean add(User user);

	/**
	 * @param userId
	 * @return
	 */
	public boolean delete(Long userId);

	/**
	 * @param userId
	 * @param updateUserDetails
	 * @return
	 */
	public User updateUser(Long userId, User updateUserDetails);

	/**
	 * @param userId
	 * @param updateUserDetails
	 * @return
	 */
	public User updateAdmin(Long userId, User updateUserDetails);
	
	/**
	 * @param userId
	 * @param updateUserDetails
	 * @return
	 */
	public User update(Long userId, User updateUserDetails);
}
