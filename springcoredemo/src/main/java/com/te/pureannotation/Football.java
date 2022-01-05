package com.te.pureannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Football {

	@Autowired
	private Players player;

	public Players getPlayer() {
		return player;
	}

	public void setPlayer(Players player) {
		this.player = player;
	}

	public Football() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Football(Players player) {
		super();
		this.player = player;
	}

	@Override
	public String toString() {
		return "Football [player=" + player + "]";
	}

}
