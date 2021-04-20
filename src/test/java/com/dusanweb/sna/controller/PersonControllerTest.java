package com.dusanweb.sna.controller;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PersonControllerTest {
	
	PersonController personController;

	@BeforeEach
	void setUp() throws Exception {
		personController = new PersonController();
	}

	@Test
	void testGetPerson() throws IOException {
		String firstName ="John";
		String lastName = "Boyd";
		String result = personController.getPerson(firstName, lastName);
        assertEquals(result, "John", "Boyd");

	}

	@Test
	void testGetPersonByLastName() {
		fail("Not yet implemented");
	}

	@Test
	void testGetPersonByAddress() {
		fail("Not yet implemented");
	}

}
