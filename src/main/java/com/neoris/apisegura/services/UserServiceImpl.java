package com.neoris.apisegura.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neoris.apisegura.DAO.IUserDAO;
import com.neoris.apisegura.entity.User;

@Service
public class UserServiceImpl implements IUserService {
	@Autowired
	private IUserDAO userDAO;

	@Override
	public List<User> getAllUsers() {
		return userDAO.getAllUsers();
	}

	@Override
	public User getByUsername(String username) {
		// TODO Auto-generated method stub
		return userDAO.getByUsername(username);
	}

}
