package com.neoris.apisegura.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.neoris.apisegura.DAO.IUserDAO;
import com.neoris.apisegura.entity.User;



@Component
public class AppUserDetailsService implements UserDetailsService{
	 @Autowired
	    private IUserDAO userDAO;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
                User user = userDAO.getByUsername(username);

	        if(user == null) {
	            throw new UsernameNotFoundException(String.format("El username %s no Existe", username));
	        }

	        List<GrantedAuthority> authorities = new ArrayList<>();
	        user.getRoles().forEach(role -> {
	            authorities.add(new SimpleGrantedAuthority(role.getRoleName()));
	        });

	        UserDetails userDetails = new org.springframework.security.core.userdetails.
	                User(user.getUsername(), user.getPassword(), authorities);

	        return userDetails;
	}

}
