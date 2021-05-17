package com.dusanweb.sna.controller;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@SpringBootTest
@ExtendWith(SpringExtension.class)
public class PersonControllerTest {
	
	PersonController personController;

	@BeforeEach
	void setUp() throws Exception {
		personController = new PersonController();
	}

	@Test
	void testGetPerson() throws IOException {
		//arrange
		String firstName ="John";
		String lastName = "Boyd";
		
		//act
		String result = personController.getPerson(firstName, lastName);
		
		//assert
        assertEquals(result, "John", "Boyd");

	}

	@Test
	@Disabled
	void testGetPersonByLastName() {
		fail("Not yet implemented");
	}

	@Test
	@Disabled
	void testGetPersonByAddress() {
		fail("Not yet implemented");
	}

}
