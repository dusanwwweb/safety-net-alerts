package com.dusanweb.sna.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dusanweb.sna.model.Firestation;
import com.dusanweb.sna.repository.DataParserJson;

@Service
public class FirestationService implements InterfaceService<Firestation> {

	@Autowired
	private DataParserJson dataJson;

	// READ
	@Override
	public List<Firestation> getList() {
		return this.dataJson.readAll().getFirestations();
	}

	@Override
	public Firestation create(Firestation t) {
		return null;
	}

	@Override
	public void delete(Firestation t) {
	}

	@Override
	public Firestation update(Firestation t) {
		return null;
	}

	public List<Firestation> findFirestationsByStationNumber(int stationNum) {
		List<Firestation> firestations = new ArrayList<Firestation>();
		
		for(Firestation f : this.dataJson.readAll().getFirestations()) {
			if(f.getStation() == stationNum) {
				firestations.add(f);
			}
		}
		return firestations;
	}

}
