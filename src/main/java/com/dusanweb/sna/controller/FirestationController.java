package com.dusanweb.sna.controller;

import java.io.IOException;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dusanweb.sna.model.Firestation;
import com.dusanweb.sna.service.FirestationService;

@RestController
@RequestMapping("/firestation")
public class FirestationController {

	private static final Logger log = LoggerFactory.getLogger(FirestationController.class);

	@Autowired
	private FirestationService firestationService;

	@GetMapping
	public List<Firestation> getFirestations() throws IOException {
		log.trace("200 (OK)");
		return firestationService.getList();
	}

	@RequestMapping(path = "/{stationNumber}", method = RequestMethod.GET)
	public List<Firestation> getAddressByStationNumber(@PathVariable(name = "stationNumber") int stationNum) {
		log.trace("getFirestationByStationNumber method successful :)");
		
		return firestationService.findFirestationsByStationNumber(stationNum);
	}

}
