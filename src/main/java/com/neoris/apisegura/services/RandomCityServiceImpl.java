package com.neoris.apisegura.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neoris.apisegura.DAO.IRandomCityDAO;
import com.neoris.apisegura.entity.RandomCity;

@Service
public class RandomCityServiceImpl implements IRandomCityService {
	
	@Autowired
	private IRandomCityDAO randomCityDAO;

	@Override
	public List<RandomCity> getAllRandomCity() {
		// TODO Auto-generated method stub
		 return randomCityDAO.getAllRandomCity();
	}

	@Override
	public RandomCity getRandomCityById(Long Id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean addRandomCity(RandomCity proveedor) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void updateRandomCity(RandomCity proveedor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteRandomCity(Long Id) {
		// TODO Auto-generated method stub
		
	}

}
