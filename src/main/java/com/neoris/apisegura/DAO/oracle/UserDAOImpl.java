package com.neoris.apisegura.DAO.oracle;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.neoris.apisegura.DAO.IUserDAO;

import com.neoris.apisegura.entity.User;

@Transactional
@Repository
public class UserDAOImpl implements IUserDAO{
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public User getByUsername(String username) {
		String hql = "FROM User as usuario WHERE usuario.username like :nombre";
		//String hql = "FROM User as usuario WHERE usuario.username as :nombre";
		return (User) entityManager.createQuery(hql).setParameter("nombre", username)
		                        .getResultList().get(0);
		
		//return resultado.size() > 0 ?resultado.get(0)  : false;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<User> getAllUsers() {
		String hql = "FROM User as usuario ORDER BY usuario.id";
		return (List<User>) entityManager.createQuery(hql).getResultList();
	}

}
