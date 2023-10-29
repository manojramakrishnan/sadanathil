package com.sadanathil.services;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.sadanathil.dto.UserRegistrationDto;
import com.sadanathil.entities.Users;

public interface UserService extends UserDetailsService{
	Users save(UserRegistrationDto registrationDto);
}