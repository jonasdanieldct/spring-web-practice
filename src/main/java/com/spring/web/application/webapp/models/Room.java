package com.spring.web.application.webapp.models;

public class Room {

	private int number;
	private String name;
	private String address;

	public Room(int number, String name, String address) {
		
		this.number = number;
		this.name = name;
		this.address = address;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
