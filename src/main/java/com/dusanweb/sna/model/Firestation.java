package com.dusanweb.sna.model;

public class Firestation {

	private String address;
	private Integer station;
	
	public Firestation() {}

	public Firestation(String address, Integer station) {
		this.address = address;
		this.station = station;
	}
	
	public String getAddress() {
		return address;
	}
	public Integer getStation() {
		return station;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setStation(Integer station) {
		this.station = station;
	}

	@Override
	public String toString() {
		return "Firestation [address=" + address + ", station=" + station + "]";
	}	
	
}
