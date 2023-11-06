package com.sadanathil.services;

import com.sadanathil.dto.RegistrationDto;
import com.sadanathil.entities.User;

public interface IRegistrationService {

	User save(RegistrationDto registrationDto);

}
