package com.neoris.apisegura.DAO.oracle;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.neoris.apisegura.DAO.IRandomCityDAO;
import com.neoris.apisegura.entity.RandomCity;

@Transactional
@Repository
public class RandomCityImpl implements IRandomCityDAO {
	@PersistenceContext
	private EntityManager entityManager;	

	@SuppressWarnings("unchecked")
	@Override
	public List<RandomCity> getAllRandomCity() {
		// TODO Auto-generated method stub
		String hql = "FROM RandomCity as ciu ORDER BY ciu.id";
		return (List<RandomCity>) entityManager.createQuery(hql).getResultList();
	}

	@Override
	public RandomCity getRandomCityById(Long randomCityId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addRandomCity(RandomCity cityId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateRandomCity(RandomCity city) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteRandomCity(Long cityId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean randomCityExists(String name) {
		// TODO Auto-generated method stub
		return false;
	}

}
