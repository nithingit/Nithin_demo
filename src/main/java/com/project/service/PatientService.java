package com.project.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.project.dao.PatientRepository;
import com.project.model.PatientEntity;

@Service("PatientService")
@Transactional
public class PatientService {

	@Autowired
	private PatientRepository dao;

	public int saveObject(PatientEntity object) {
		dao = new PatientRepository();
		dao.saveObject(object);
		return object.getId();
	}

	public List<PatientEntity> findAllObjects() {
		dao = new PatientRepository();
		List<PatientEntity> patients = new ArrayList<>();
		patients = dao.findAllObjects();

		return patients;
	}

}
