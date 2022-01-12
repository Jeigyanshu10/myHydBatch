package com.te.playerservice;

import com.te.playerdto.Player;

public interface PlayerService {

	public boolean addPlayer(Player player);

	public boolean updateMyPlayer(Player updatedPlayer);

	public Player getPlayer(int jerseyNumber);

	public boolean deletePlayer(int jerseyNumber);

}
