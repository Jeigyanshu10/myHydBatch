package com.te.playerdto;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonRootName;

@Entity
@JsonRootName("Player-Info")
public class Player implements Serializable {

	@Id
	private int jerseyNumber;
	private String name;
	private String game;
	private String club;
	private String country;

	public int getJerseyNumber() {
		return jerseyNumber;
	}

	public void setJerseyNumber(int jerseyNumber) {
		this.jerseyNumber = jerseyNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGame() {
		return game;
	}

	public void setGame(String game) {
		this.game = game;
	}

	public String getClub() {
		return club;
	}

	public void setClub(String club) {
		this.club = club;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
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
	}

	@Override
	public String toString() {
		return "Player [jerseyNumber=" + jerseyNumber + ", name=" + name + ", game=" + game + ", club=" + club
				+ ", country=" + country + "]";
	}

}
