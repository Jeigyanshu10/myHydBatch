package com.te.daolayer;

import com.te.playerdto.Player;

public interface PlayerDAO {

	public boolean addPlayer(Player player);

	public boolean updatePlayer(Player updatedPlayer);

	public Player getPlayer(int jerseyNumber);

	public boolean deletePlayer(int jerseyNumber);

}
