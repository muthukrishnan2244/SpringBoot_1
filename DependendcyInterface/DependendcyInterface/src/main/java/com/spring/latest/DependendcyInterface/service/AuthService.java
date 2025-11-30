package com.spring.latest.DependendcyInterface.service;

import org.springframework.stereotype.Service;


public interface AuthService {

	boolean authenticate(String username,String password);
}
