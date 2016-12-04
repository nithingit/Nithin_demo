package com.project.controller;

import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.project.model.PatientEntity;
import com.project.service.PatientService;

@Controller
@RequestMapping("/patientService")
public class PatientController {

	public PatientController() {

	}

	@RequestMapping(value = "/persistObject", method = RequestMethod.POST)
	public @ResponseBody int persistObject(@RequestBody PatientEntity entity) {

		PatientService service = new PatientService();
		return service.saveObject(entity);

	}

	@RequestMapping(value = "findAllObjects", method = RequestMethod.POST)
	public @ResponseBody List<PatientEntity> findAllObjects() {
		PatientService service = new PatientService();
		return service.findAllObjects();

	}
}