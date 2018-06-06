package com.example.demo.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.model.UserLogin;

@Repository
public interface UserLoginRepository extends JpaRepository<UserLogin, Long> {

	@Query("FROM com.example.demo.model.UserLogin u where u.username = ?1")
	UserLogin findUsername(String username);

	@Query("FROM com.example.demo.model.UserLogin u where u.password = ?1")
	UserLogin findPassword(String password);

	@Transactional
	@Modifying
	@Query("Delete FROM com.example.demo.model.UserLogin u where u.username = ?1")
	int deleteUser(String username);
}
