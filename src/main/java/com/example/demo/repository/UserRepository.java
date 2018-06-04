package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	
	@Query("SELECT new com.example.demo.model.User(u.userId, u.firstName, u.lastName, u.username, u.address, u.age, u.userType, u.employeeCode, u.employeeStatus, u.employeeReport) FROM com.example.demo.model.User u where u.username like ?1%")
	List<User> findUser(String username);
}
