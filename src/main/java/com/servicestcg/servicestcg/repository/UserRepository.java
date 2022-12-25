package com.servicestcg.servicestcg.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.servicestcg.servicestcg.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{
	User findById(long id);
	User findByUsername(String username);

}