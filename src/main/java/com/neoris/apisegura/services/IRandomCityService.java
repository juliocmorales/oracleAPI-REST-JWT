package com.neoris.apisegura.services;

import java.util.List;

import com.neoris.apisegura.entity.RandomCity;

public interface IRandomCityService {
	 List<RandomCity> getAllRandomCity();
	   
	 RandomCity getRandomCityById(Long Id);
     
     boolean addRandomCity(RandomCity proveedor);
    
     void updateRandomCity(RandomCity proveedor);
    
     void deleteRandomCity(Long Id);

}
