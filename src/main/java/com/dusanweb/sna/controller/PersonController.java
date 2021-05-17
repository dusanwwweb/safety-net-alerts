package com.dusanweb.sna.controller;

import java.io.IOException;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dusanweb.sna.model.Person;
import com.dusanweb.sna.service.PersonService;

@RestController
@RequestMapping("/person")
public class PersonController {
	
	private static final Logger log = LoggerFactory.getLogger(PersonController.class);

	@Autowired
	private PersonService personService;
	
	@GetMapping(path = "/fullname")
	public String getPerson(@RequestParam(value = "firstName") String firstName, @RequestParam(value = "lastName") String lastName) throws IOException {
		log.trace("Logging a trace");
		return personService.getByFullName(firstName, lastName).toString();
	}
	
	//RequestMapping
	//defaultValue = Boyd
	@RequestMapping(path = "/bylastname", method = RequestMethod.GET)
	public List<Person> getPersonByLastName(@RequestParam(value = "lastName", defaultValue = "Boyd") String lastName) throws IOException {
		return this.personService.getByLastName(lastName);
	}
	
	@GetMapping(path = "/address")
	public List<Person> getPersonByAddress(@RequestParam(value = "address") String address) throws IOException {
		return this.personService.getByAddress(address);	
	}
	
}
