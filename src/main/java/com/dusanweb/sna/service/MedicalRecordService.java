package com.dusanweb.sna.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dusanweb.sna.model.MedicalRecord;
import com.dusanweb.sna.repository.DataParserJson;

@Service
public class MedicalRecordService implements InterfaceService<MedicalRecord>{

	@Autowired
	private DataParserJson dataJson;
	
	@Override
	public List<MedicalRecord> getList() {
		return this.dataJson.readAll().getMedicalRecords();
	}

	@Override
	public MedicalRecord create(MedicalRecord t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(MedicalRecord t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public MedicalRecord update(MedicalRecord t) {
		// TODO Auto-generated method stub
		return null;
	}


}
