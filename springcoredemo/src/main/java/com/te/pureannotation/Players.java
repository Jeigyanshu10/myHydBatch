package com.te.pureannotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@ComponentScan("com.te.pureannotation")
public class Players {

	@Value("Prudhvi")
	private String name;
	@Value("India")
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
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Players [name=" + name + ", country=" + country + "]";
	}

}
