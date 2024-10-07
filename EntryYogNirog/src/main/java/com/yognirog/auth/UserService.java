package com.yognirog.auth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	@Autowired
	private UserRepo userRepo;

	private PasswordEncoder passwordEncoder;

	public String addUser(User user) {
		
		String encodedPass = passwordEncoder.encode(user.getPassword());

		User user1 = new User(user.getUserId(), user.getEmail(), user.getName(), user.getRole(), user.getContact_no(),
				user.getUsername(), encodedPass);

		userRepo.save(user1);
		return user.getName();
	}
}
