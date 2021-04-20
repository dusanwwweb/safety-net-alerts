package com.dusanweb.sna.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dusanweb.sna.model.MedicalRecord;
import com.dusanweb.sna.service.MedicalRecordService;

@RestController
@RequestMapping("/medicalrecord")
public class MedicalRecordController {
	
	@Autowired
	private MedicalRecordService medicalRecordService;
	
	@GetMapping
	public List<MedicalRecord> getMedicalRecord() throws IOException{
		return medicalRecordService.getList();
	}

}
