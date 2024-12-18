package com.tcs.service;

import java.util.List;

import com.tcs.entity.User;

public interface UserService {
	
	public boolean saveData(User user);
	
	public List<User> getData();

}
