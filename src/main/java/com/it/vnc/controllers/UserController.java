package com.it.vnc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.it.vnc.models.User;
import com.it.vnc.services.UserService;

@Controller
public class UserController {

@Autowired UserService service;
@GetMapping("/registration")
public String getRegistrationPage() {
	return "Register.html";
}

@PostMapping("/registration")
public String saveUser(@ModelAttribute("user") User user ,Model model) throws Exception{
	model.addAttribute("message", "Registered Successfull");
	service.save(user);
	return "Register";
}
//@PostMapping("/registration")
//public ResponseEntity<String> saveUser(@RequestBody User user){
//	service.save(user);
//	return ResponseEntity.ok("Register");
//}
}
