package com.docker.database.dockerpostgres;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserContoller {

	@Autowired
	UserRepository userRepository;
	
	@RequestMapping("/")
	public String registrationPage() {
			return "user";
	}
	
	
	@RequestMapping("/register")
	@ResponseBody
	public List<UserData> saveUserAndGetData(@ModelAttribute UserData user){
		userRepository.save(user);
		return userRepository.findAll();
	}
			
			
}
