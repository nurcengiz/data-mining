package com.seher.dataxml.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.seher.dataxml.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{
	
	boolean existsByEmailAndPassword(String email,String password);

}
