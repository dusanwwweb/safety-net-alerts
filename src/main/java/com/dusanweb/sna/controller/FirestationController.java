package com.dusanweb.sna.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
//@RequestMapping("/firestation")
public class FirestationController {
    
	@GetMapping
	public String helloWorld() {
		return "Hello Wooorld";	
	}
}
