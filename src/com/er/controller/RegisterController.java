package com.er.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.er.model.User;
import com.er.service.UserService;

@Controller
@RequestMapping("/register")
public class RegisterController {
	
   @Autowired
   UserService userService;
	
   @RequestMapping(value = "/registerUser", method = RequestMethod.POST,produces="application/json")
   public ResponseEntity<String> register(@RequestBody User user)
   {
	   boolean emailExists = userService.emailExist(user.getEmail());
	   if(!emailExists)
	   {
		   userService.register(user);
		   return new ResponseEntity<String>("User registered successfully.", HttpStatus.OK);
	   }
	   else
	   {
		   return new ResponseEntity<String>("Email already exists.", HttpStatus.OK);
	   }
   }
}
