package com.it.vnc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.it.vnc.models.User;
import com.it.vnc.services.UserService;
@RequestMapping("/rest/user")
@RestController
public class UserController {

@Autowired UserService service;
@PostMapping("/save")
public ResponseEntity<String> saveUser(@RequestBody User user) throws Exception{
	service.save(user);
	return ResponseEntity.ok("saved");
}
}
