package com.te.purepureannotation;

import org.springframework.beans.factory.annotation.Value;

public class Players {

	@Value("Messi")
	private String name;
	@Value("Argentina")
	private String country;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Players(String name, String country) {
		super();
		this.name = name;
		this.country = country;
	}

	public Players() {
		super();
	}

	@Override
	public String toString() {
		return "Players [name=" + name + ", country=" + country + "]";
	}

	public void playerDetails() {
		System.out.println("The player name is: " + this.name + " and the player is from : " + this.country);
	}

}
