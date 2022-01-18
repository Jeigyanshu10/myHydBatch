package com.te.myplayerapp.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Player {

	@Id
	private int jerseyNumber;
	private String name;
	private String game;
	private String club;
	private String country;
	public final int getJerseyNumber() {
		return jerseyNumber;
	}
	public final void setJerseyNumber(int jerseyNumber) {
		this.jerseyNumber = jerseyNumber;
	}
	public final String getName() {
		return name;
	}
	public final void setName(String name) {
		this.name = name;
	}
	public final String getGame() {
		return game;
	}
	public final void setGame(String game) {
		this.game = game;
	}
	public final String getClub() {
		return club;
	}
	public final void setClub(String club) {
		this.club = club;
	}
	public final String getCountry() {
		return country;
	}
	public final void setCountry(String country) {
		this.country = country;
	}
	public Player(int jerseyNumber, String name, String game, String club, String country) {
		super();
		this.jerseyNumber = jerseyNumber;
		this.name = name;
		this.game = game;
		this.club = club;
		this.country = country;
	}
	public Player() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Player [jerseyNumber=" + jerseyNumber + ", name=" + name + ", game=" + game + ", club=" + club
				+ ", country=" + country + "]";
	}
	
	
	
	
}
