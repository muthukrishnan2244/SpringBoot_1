package com.spring.sample.usercontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spring.sample.payload.UserDTO;
import com.spring.sample.service.UserInteface;

@RestController
public class UserController {
//
//	@Autowired
//	private UserInteface userInteface;
	private final UserInteface userInteface;
	
  public UserController(UserInteface userInteface) {
		this.userInteface = userInteface;
	}
  
    @PostMapping("/user")
   public ResponseEntity<?> createUser(@RequestBody UserDTO usrDto){
	   userInteface.createUser(usrDto);
	   return new ResponseEntity<>(HttpStatus.OK).ok("Success");
   }
    
  
}
