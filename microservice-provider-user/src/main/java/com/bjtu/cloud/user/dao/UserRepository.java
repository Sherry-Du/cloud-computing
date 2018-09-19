package com.bjtu.cloud.user.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.bjtu.cloud.user.entity.User;
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	
	@Query("select u FROM User u WHERE u.loginName=? AND u.password=?")
	User getByLoginNameAndPassword(String loginName, String password);
	
	@Modifying
	@Query("update User u set u.loginName=?, u.password=?, u.name=?, u.gender=?, u.phoneNumber=?,"
			+ "u.email=?, u.description=? WHERE u.id=?")
	int update(String loginName, String password, String name, String gender, String phoneNumber,
			String email, String description, Long id);
	
	@Modifying
	@Query("update User u set u.password=? WHERE u.id=?")
	int initPassword(String password, Long id);

}
