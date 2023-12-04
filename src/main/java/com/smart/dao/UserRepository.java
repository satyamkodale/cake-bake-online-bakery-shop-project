package com.smart.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.smart.entities.User;
@Service //no need to use coz its already in samrt pak
public interface UserRepository extends JpaRepository<User,Integer> {
	

}
