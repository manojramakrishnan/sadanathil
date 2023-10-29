package com.sadanathil.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sadanathil.entities.Users;

@Repository
public interface UserRepository extends JpaRepository<Users, Long>{
	Users findByEmail(String email);
}