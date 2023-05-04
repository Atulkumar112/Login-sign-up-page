package com.login.userController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.login.dto.LoginDTO;
import com.login.dto.UserDTO;
import com.login.response.LoginResponse;
import com.login.service.UserService;
import com.login.user.User;
import antlr.collections.List;


//in postman use the key as userDTO variables define like userEmail not email okkk!
@CrossOrigin
@Controller
@RequestMapping("api/v1")
public class userController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/save")
	public String creatUser(@RequestBody UserDTO userDTO) {
		String id = userService.addUser(userDTO);
		return id;
	}
	
	@PostMapping(path="/login")
	public ResponseEntity<?> userLogin(@RequestBody LoginDTO loginDTO){
		LoginResponse loginResponse = userService.userLogin(loginDTO);
		return ResponseEntity.ok(loginResponse);
	}
	

}

