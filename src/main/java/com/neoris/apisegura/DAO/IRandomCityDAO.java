package com.neoris.apisegura.DAO;

import java.util.List;

import com.neoris.apisegura.entity.RandomCity;

public interface IRandomCityDAO {
	List<RandomCity> getAllRandomCity();
    RandomCity getRandomCityById(Long randomCityId);
    void addRandomCity(RandomCity cityId);
    void updateRandomCity(RandomCity city);
    void deleteRandomCity(Long cityId);
    boolean randomCityExists(String name);

}
