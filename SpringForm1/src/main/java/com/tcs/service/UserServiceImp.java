package com.tcs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.entity.User;
import com.tcs.repo.UserRepo;

@Service
public class UserServiceImp implements UserService {
	
	@Autowired
	private UserRepo userRepo;

	@Override
	public boolean saveData(User user) {
		
		User save = userRepo.save(user);
		
		return save != null;
	}

	@Override
	public List<User> getData() {
		
		List<User> all = userRepo.findAll();
		
		return all;
	}

}
