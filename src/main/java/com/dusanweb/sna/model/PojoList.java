package com.dusanweb.sna.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


public class PojoList {
    //Imena lista moraju da budu jednaka nazivima u data.json !!!
	//Les noms des lists devoir etre les mêmes que les noms dans le data.json
	//Possibilité d'utiliser l'annotation @JsonCreator/@JsonProperty("medicalrecords")	
    List<Person> persons;
    List<Firestation> firestations;
    List<MedicalRecord> medicalRecords;

    public PojoList() {}

     
    public PojoList(List<Person> persons, List<Firestation> firestations, @JsonProperty("medicalrecords") List<MedicalRecord> medicalRecords) {
        this.persons = persons;
        this.firestations = firestations;
        this.medicalRecords = medicalRecords;
    }

    public List<Person> getPersons() {
        return persons;
    }

    public void setPersons(List<Person> persons) {
        this.persons = persons;
    }

    public List<Firestation> getFirestations() {
        return firestations;
    }

    public void setFirestations(List<Firestation> firestations) {
        this.firestations = firestations;
    }

    public List<MedicalRecord> getMedicalRecords() {
        return medicalRecords;
    }

    public void setMedicalRecords(List<MedicalRecord> medicalRecords) {
        this.medicalRecords = medicalRecords;
    }

    @Override
    public String toString() {
        return "PojoList{" +
                "persons=" + persons +
                ", firestations=" + firestations +
                ", medicalrecords=" + medicalRecords +
                '}';
    }
}
