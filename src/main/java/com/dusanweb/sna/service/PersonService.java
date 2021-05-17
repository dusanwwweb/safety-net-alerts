package com.dusanweb.sna.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dusanweb.sna.model.Person;
import com.dusanweb.sna.repository.DataParserJson;

@Service
public class PersonService implements InterfaceService<Person>{

//	@Autowired
//	private DataParserJson dataJson;

	private final DataParserJson dataJson;
	
	@Autowired
	public PersonService(DataParserJson dataJson) {
		this.dataJson = dataJson;
	}
	
	//READ
	@Override
	public List<Person> getList() {
		return this.dataJson.readAll().getPersons();
	}

	@Override
	public Person create(Person t) {
		return null;
	}

	@Override
	public void delete(Person t) {
	}

	@Override
	public Person update(Person t) {
		return null;
	}


	public Person getByFullName(String firstName, String lastName) {
		Person person = new Person();
		
		for(Person p : this.dataJson.readAll().getPersons()) {
			if(p.getFirstName().equals(firstName) && p.getLastName().equals(lastName)) {
				person.setFirstName(p.getFirstName());
				person.setLastName(p.getLastName());
				person.setEmail(p.getEmail());
				person.setAddress(p.getAddress());
			}
		}
		return person;
	}
	
	public List<Person> getByLastName(String lastName) {
		List<Person> personsByLastName = new ArrayList<Person>();
		
		for(Person p : this.dataJson.readAll().getPersons()) {
			if(p.getLastName().equals(lastName)) {
				personsByLastName.add(p);
			}
		}
		return personsByLastName;
	}

	
	public List<Person> getByAddress(String address) {
		List<Person> personByAddress = new ArrayList<Person>();
		
		for(Person p : this.dataJson.readAll().getPersons()) {
			if(p.getAddress().equals(address)) {
				personByAddress.add(p);
			}
		}
		return personByAddress;
	}


}
