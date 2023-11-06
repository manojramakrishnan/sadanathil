package com.sadanathil.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.sadanathil.dto.RegistrationDto;
import com.sadanathil.entities.User;
import com.sadanathil.repositories.UserRepository;

@Service
public class RegistrationServiceImpl implements IRegistrationService {

	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public User save(RegistrationDto registrationDto) {
		User user= new User(registrationDto.getEmail(),passwordEncoder.encode(registrationDto.getPassword()),registrationDto.getFullName(),registrationDto.getRole());
		
		return userRepository.save(user);
	}

}
