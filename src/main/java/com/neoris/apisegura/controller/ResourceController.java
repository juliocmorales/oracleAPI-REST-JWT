package com.neoris.apisegura.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.neoris.apisegura.entity.RandomCity;
import com.neoris.apisegura.entity.User;

//import com.neoris.apisegura.DAO.IRandomCityDAO;
//import com.neoris.apisegura.entity.RandomCity;
//import com.neoris.apisegura.entity.User;

import com.neoris.apisegura.services.IRandomCityService;
import com.neoris.apisegura.services.IUserService;


@RestController
@RequestMapping("/springjwt")
public class ResourceController {
    //@Autowired
    //private GenericService userService;
    
    @Autowired
	private IRandomCityService randomCityService;
    
    @Autowired
   	private IUserService userService;

    @GetMapping(value ="/cities")
    @PreAuthorize("hasAuthority('ADMIN_USER') or hasAuthority('STANDARD_USER')")
    public List<RandomCity> getUser(){
        //return userService.findAllRandomCities();
    	
        return randomCityService.getAllRandomCity();
        
        
    }
    
    @GetMapping(value ="/usuarios")
      @PreAuthorize("hasAuthority('ADMIN_USER')")
      public List<User> getUsuarios(){
          //return userService.findAllRandomCities();
          return userService.getAllUsers();
      }
    @GetMapping(value ="/usuario/{name}")
      @PreAuthorize("hasAuthority('ADMIN_USER')")
      public User getUsuario(@PathVariable("name") String n){
          //return userService.findAllRandomCities();
          return userService.getByUsername(n);
      }
   
    


    //@RequestMapping(value ="/users", method = RequestMethod.GET)
    //@PreAuthorize("hasAuthority('ADMIN_USER')")
    //public List<User> getUsers(){
      //  return userService.findAllUsers();
    //}
}