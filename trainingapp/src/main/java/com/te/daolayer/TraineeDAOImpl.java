package com.te.daolayer;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.te.dtolayer.Trainees;

@Repository
public class TraineeDAOImpl implements TraineeDao {

	@PersistenceUnit
	private EntityManagerFactory factory;

	public boolean insertTrainee(Trainees trainee) {
		boolean isInserted = false;
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();

		try {
			transaction.begin();
			manager.persist(trainee);
			transaction.commit();
			isInserted = true;
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
		}

		return isInserted;
	}

	public Trainees fetchTrainee(int id) {
		EntityManager manager = factory.createEntityManager();
		Trainees trainee = manager.find(Trainees.class, id);
		return trainee;
	}

	public Trainees authenticate(int userId, String password) {
		EntityManager manager = factory.createEntityManager();
		Trainees trainee = manager.find(Trainees.class, userId);
		if (password.equals(trainee.getPassword())) {
			return trainee;
		} else
			return null;
	}

	public boolean deleteTrainee(int id) {
		boolean isDeleted = false;

		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			Trainees trainee = manager.find(Trainees.class, id);
			manager.remove(trainee);
			transaction.commit();
			isDeleted = true;

		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
		}

		return isDeleted;
	}

	public boolean updateTrainee(Trainees updateTrainee) {
		boolean isUpdated = false;
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		Trainees currentTrainee = manager.find(Trainees.class, updateTrainee.getUserId());

		try {
			transaction.begin();
			if (updateTrainee.getEmailAddress() != null && updateTrainee.getEmailAddress() != "") {
				currentTrainee.setEmailAddress(updateTrainee.getEmailAddress());
			}
			if (updateTrainee.getUsername() != null && updateTrainee.getUsername() != "") {
				currentTrainee.setUsername(updateTrainee.getUsername());
			}

			if (updateTrainee.getMobile() != null && updateTrainee.getMobile() != "") {
				currentTrainee.setMobile(updateTrainee.getMobile());
			}
			if (updateTrainee.getPassword() != null && updateTrainee.getPassword() != "") {
				currentTrainee.setPassword(updateTrainee.getPassword());
			}

			transaction.commit();
			isUpdated = true;

		} catch (Exception e) {
			e.printStackTrace();
		}

		return isUpdated;
	}

	public List<Trainees> getAllTrainees() {
		EntityManager manager = factory.createEntityManager();
		Query query = manager.createQuery("from Trainees");
		ArrayList<Trainees> traineeList = new ArrayList<Trainees>();
		try {
			traineeList = (ArrayList<Trainees>) query.getResultList();
		} catch (Exception e) {
			e.printStackTrace();
			traineeList = null;
		}
		return traineeList;
	}

}
