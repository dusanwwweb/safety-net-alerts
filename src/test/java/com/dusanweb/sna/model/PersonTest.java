package com.dusanweb.sna.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class PersonTest {

	public Person person;
	
	@BeforeEach
	void setUp() throws Exception {
		person = new Person();
	}

	@Test
	void testPerson() {
		person.setFirstName("John");
		String firstName = person.getFirstName();
		assertEquals("John", firstName);
	}

}
