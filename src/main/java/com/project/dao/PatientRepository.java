package com.project.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.springframework.stereotype.Repository;


import com.project.model.PatientEntity;



@Repository("PatientRepository")
public class PatientRepository   extends AbstractDAO{
	

	public int saveObject(PatientEntity object) {
		
		
		persist(object);
		return object.getId();
	}

	
	public List<PatientEntity> findAllObjects() {
		
		Criteria criteria = getSession().createCriteria(PatientEntity.class);
		criteria.addOrder(Order.asc("id"));
		return (List<PatientEntity>) criteria.list();
	}

}
