package com.te.playerservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.daolayer.PlayerDAO;
import com.te.playerdto.Player;

@Service
public class PlayerServiceImpl implements PlayerService {

	@Autowired
	private PlayerDAO dao;

	@Override
	public boolean addPlayer(Player player) {
		return dao.addPlayer(player);
	}

	@Override
	public boolean updateMyPlayer(Player updatedPlayer) {
		return dao.updatePlayer(updatedPlayer);
	}

	@Override
	public Player getPlayer(int jerseyNumber) {
		return dao.getPlayer(jerseyNumber);
	}

	@Override
	public boolean deletePlayer(int jerseyNumber) {
		return dao.deletePlayer(jerseyNumber);
	}

}
