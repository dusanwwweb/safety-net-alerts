package com.dusanweb.sna.model;

import java.time.LocalDate;
import java.util.List;

public class MedicalRecord {
	private String firstName;
	private String lastName;
	private LocalDate birthdate;
	//medication & allergies peuvent etre plusieurs ou null
	private List<String> medications;
	private List<String> allergies;
	
	public MedicalRecord() {}

	public MedicalRecord(String firstName, String lastName, LocalDate birthdate, List<String> medications,
			List<String> allergies) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthdate = birthdate;
		this.medications = medications;
		this.allergies = allergies;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public LocalDate getBirthdate() {
		return birthdate;
	}

	public List<String> getMedications() {
		return medications;
	}

	public List<String> getAllergies() {
		return allergies;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setBirthdate(LocalDate birthdate) {
		this.birthdate = birthdate;
	}

	public void setMedications(List<String> medications) {
		this.medications = medications;
	}

	public void setAllergies(List<String> allergies) {
		this.allergies = allergies;
	}

	@Override
	public String toString() {
		return "MedicalRecord [firstName=" + firstName + ", lastName=" + lastName + ", birthdate=" + birthdate
				+ ", medications=" + medications + ", allergies=" + allergies + "]";
	}
	
}
