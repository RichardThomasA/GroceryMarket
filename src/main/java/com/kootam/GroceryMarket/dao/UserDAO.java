package com.kootam.GroceryMarket.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.kootam.GroceryMarket.model.User;

public interface UserDAO extends JpaRepository<User, Long>{

	//@Query("select u from User u where u.username = :name and u.password = :pass")
	@Query(
			value ="select * from user_login u where u.u_username = :name and u.u_password = :pass",
			nativeQuery = true)
	public User getUserByUsernameAndPassword(@Param("name")String name,@Param("pass")String pass);
	
}
