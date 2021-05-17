package com.dusanweb.sna.controller;

import java.io.IOException;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dusanweb.sna.model.MedicalRecord;
import com.dusanweb.sna.service.MedicalRecordService;

@RestController
@RequestMapping("/medicalrecord")
public class MedicalRecordController {
	
	private static final Logger log = LoggerFactory.getLogger(MedicalRecordController.class);
	
	@Autowired
	private MedicalRecordService medicalRecordService;
	
	@GetMapping
	public List<MedicalRecord> getMedicalRecord() throws IOException{
		log.trace("MedicalRecordController 200");
		return medicalRecordService.getList();
	}

}
