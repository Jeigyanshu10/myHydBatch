package com.te.purepureannotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Football {

	@Autowired
	private Players player;

	public Football(Players player) {
		super();
		this.player = player;
	}

	public Players getPlayer() {
		return player;
	}

	public void setPlayer(Players player) {
		this.player = player;
	}

	@Override
	public String toString() {
		return "Football [player=" + player + "]";
	}

	public void getDetails(Players player) {
		player.playerDetails();
	}

}
