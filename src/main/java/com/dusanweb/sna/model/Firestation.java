package com.dusanweb.sna.model;

import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Firestation {

	@JsonIgnore
	//Ignore l'attribut 
	private UUID id;
    private String address;
    private int station;

    public Firestation() {}

	public Firestation(UUID id, String address, int station) {
		this.id = id;
		this.address = address;
		this.station = station;
	}

	public UUID getId() {
		return id;
	}

	public String getAddress() {
		return address;
	}

	public int getStation() {
		return station;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setStation(int station) {
		this.station = station;
	}

	@Override
	public String toString() {
		return "Firestation [id=" + id + ", address=" + address + ", station=" + station + "]";
	}
}
