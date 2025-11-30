package com.spring.latest.DependendcyInterface.serviceimpl;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.spring.latest.DependendcyInterface.service.AuthService;

@Service("DBAuth")
public class DbService implements AuthService {

	@Override
	public boolean authenticate(String username, String password) {
		// TODO Auto-generated method stub
		System.out.println("DB Service");
		return false;
	}

}
