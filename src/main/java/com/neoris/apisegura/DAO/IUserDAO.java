package com.neoris.apisegura.DAO;

import java.util.List;

import com.neoris.apisegura.entity.User;



public interface IUserDAO {
	 User getByUsername(String username);

	    List<User> getAllUsers();


}
