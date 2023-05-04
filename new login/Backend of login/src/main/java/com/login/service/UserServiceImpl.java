package com.login.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.login.dto.LoginDTO;
import com.login.dto.UserDTO;
import com.login.response.LoginResponse;
import com.login.user.User;
import com.login.userRepo.UserRepo;



@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserRepo userRepo;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@Override
	public String addUser(UserDTO userDTO) {
		User user = new User(
				userDTO.getUserId(),
				userDTO.getUserName(),
				userDTO.getUserEmail(),
				this.passwordEncoder.encode(userDTO.getPassword())
		);
		userRepo.save(user);
		return user.getUserName();
	}

	@Override
	public LoginResponse userLogin(LoginDTO loginDTO) {
		String msg = "";
		System.out.println("atul kumar saini");
		User user = userRepo.findByEmail(loginDTO.getUserEmail());
		if(user != null) {
			String password = loginDTO.getPassword();
			String encodedPassword = user.getPassword();
			boolean isPwdRight = passwordEncoder.matches(password, encodedPassword);
			if(isPwdRight) {
				Optional<User> user1 = userRepo.findOneByEmailAndPassword(loginDTO.getUserEmail(), encodedPassword);
				if(user1.isPresent()) {
					return new LoginResponse("Login Success", true); 
				}
				else {
					return new LoginResponse("Login Faild", false);
				}
			}
			else {
				return new LoginResponse("Password not match", false);
			}
		}
		else {
			return new LoginResponse("Email not exits", true);
		}
		
	
	}

//	@Override
//	public List<User> getAllUser() {
//		return userRepo.findAll();
//	}
}
