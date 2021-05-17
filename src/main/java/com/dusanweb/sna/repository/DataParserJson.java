package com.dusanweb.sna.repository;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import com.dusanweb.sna.controller.PersonController;
import com.dusanweb.sna.model.PojoList;
import com.fasterxml.jackson.databind.ObjectMapper;

@Repository
public class DataParserJson {

//	@Value("${json.file.location}")
//	private File file;
	
	private static final Logger log = LoggerFactory.getLogger(PersonController.class);
	
	public PojoList readAll() {

		String filePath = "C:\\Users\\Utilisateur\\eclipse-workspace\\safety-net-alerts\\src\\main\\resources\\json\\data.json";	
		String dataFile = null;
		
		try {
			dataFile = new String(Files.readAllBytes(Paths.get(filePath)));
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		
		ObjectMapper objectMapper = new ObjectMapper();
		//OBLIGATOIRE - "can not use as Creator"
        objectMapper.findAndRegisterModules();
		
        PojoList data = new PojoList();

		// pretty print
//		String prettyPojo = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(pojoList.getFirestations());
//		System.out.println(prettyPojo);
//		return prettyPojo;
		
		try {
			data = objectMapper.readValue(dataFile, PojoList.class);
			log.info("SUCCESS JSON");
		} catch (Exception e) {
			log.info("ERROR JSON", e);
		}
		return data;
	}
	
	
}
