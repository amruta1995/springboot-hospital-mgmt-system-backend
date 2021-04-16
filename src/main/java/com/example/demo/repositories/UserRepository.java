package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.example.demo.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
	
	
	@Query("select u from User u where u.user_name = :user_name and u.user_pwd= :user_pwd")
	public User checkUser(String user_name , String user_pwd);
	

}