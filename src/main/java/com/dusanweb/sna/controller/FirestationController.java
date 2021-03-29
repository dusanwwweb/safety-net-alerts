package com.dusanweb.sna.controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dusanweb.sna.model.PojoList;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
@RequestMapping("/firestation")
public class FirestationController {
	  
	@GetMapping
	public String helloWorld() throws IOException {
		
		String filePath = "C:\\Users\\Utilisateur\\eclipse-workspace\\safety-net-alerts\\src\\main\\resources\\json\\data.json";
		
		String dataFile = new String(Files.readAllBytes(Paths.get(filePath)));
		
		ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.findAndRegisterModules();

		PojoList pojoList;
		
		pojoList = objectMapper.readValue(dataFile, PojoList.class);
		
		// pretty print
		String prettyPojo= objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(pojoList.getFirestations());
		System.out.println(prettyPojo);
		return prettyPojo;
	}
}
