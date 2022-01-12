package com.te.daolayer;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;

import org.springframework.stereotype.Repository;

import com.te.playerdto.Player;

@Repository
public class PlayerDaoImpl implements PlayerDAO {

	@PersistenceUnit
	private EntityManagerFactory factory;

	@Override
	public boolean addPlayer(Player player) {
		boolean isInserted = false;
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {

			transaction.begin();
			manager.persist(player);
			transaction.commit();
			isInserted = true;
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
		}
		return isInserted;
	}

	public boolean updatePlayer(Player updatedPlayer) {
		boolean isUpdated = false;
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();

		try {
			transaction.begin();
			Player currentPlayer = manager.find(Player.class, updatedPlayer.getJerseyNumber());

			if (updatedPlayer.getName() != null && updatedPlayer.getName() != "") {
				currentPlayer.setName(updatedPlayer.getName());
			}

			if (updatedPlayer.getGame() != null && updatedPlayer.getGame() != "") {
				currentPlayer.setGame(updatedPlayer.getGame());
			}

			if (updatedPlayer.getClub() != null && updatedPlayer.getClub() != "") {
				currentPlayer.setClub(updatedPlayer.getClub());
			}

			if (updatedPlayer.getCountry() != null && updatedPlayer.getCountry() != "") {
				currentPlayer.setCountry(updatedPlayer.getCountry());
			}

			transaction.commit();
			isUpdated = true;
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
		}
		return isUpdated;
	}

	@Override
	public Player getPlayer(int jerseyNumber) {

		EntityManager manager = factory.createEntityManager();
		Player player = manager.find(Player.class, jerseyNumber);

		return player;
	}

	@Override
	public boolean deletePlayer(int jerseyNumber) {
		boolean isDeleted = false;
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();

		try {
			transaction.begin();
			Player deleteMe = manager.find(Player.class, jerseyNumber);
			manager.remove(deleteMe);
			transaction.commit();
			isDeleted = true;
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
		}
		return isDeleted;
	}

}
