package com.neoris.apisegura.services;

import java.util.List;

import com.neoris.apisegura.entity.User;



public interface IUserService {
	List<User> getAllUsers();
	User getByUsername(String username);

}
