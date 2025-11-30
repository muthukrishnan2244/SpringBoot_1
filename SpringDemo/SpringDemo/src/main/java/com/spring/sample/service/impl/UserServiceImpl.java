package com.spring.sample.service.impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.sample.domain.UserData;
import com.spring.sample.payload.UserDTO;
import com.spring.sample.repository.UserRepo;
import com.spring.sample.service.UserInteface;

@Service
public class UserServiceImpl implements UserInteface {

	@Autowired
	private UserRepo userRepo;
	@Autowired
	private ModelMapper modelMapper;
	@Override
	public void createUser(UserDTO userDTO) {
		UserData userData = modelMapper.map(userDTO, UserData.class);
		
		userRepo.save(userData);		
	}

}
