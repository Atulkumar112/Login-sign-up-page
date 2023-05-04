package com.login.service;

import java.util.List;

import com.login.dto.LoginDTO;
import com.login.dto.UserDTO;
import com.login.response.LoginResponse;
import com.login.user.User;



public interface UserService {

	String addUser(UserDTO userDTO);

	LoginResponse userLogin(LoginDTO loginDTO);

//	List<User> getAllUser();

}
