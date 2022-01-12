package com.te.servicelayer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.daolayer.TraineeDao;
import com.te.dtolayer.Trainees;
import com.te.mycustomexceptions.InvalidPasswordException;

@Service
public class TraineeServiceImpl implements TraineeService {

	@Autowired
	private TraineeDao dao;

	public boolean addTrainee(Trainees trainee) {
		if (trainee.getPassword().equals(trainee.getUsername())) {
			throw new InvalidPasswordException("You cannot have same username and password");
		}
		return dao.insertTrainee(trainee);

	}

	public Trainees getTrainee(int id) {
		return dao.fetchTrainee(id);
	}

	public Trainees serviceAuthentication(int userId, String password) {
		return dao.authenticate(userId, password);
	}

	public boolean deleteTrainee(int id) {
		return dao.deleteTrainee(id);
	}

	public boolean updateTrainee(Trainees trainee) {
		return dao.updateTrainee(trainee);
	}

	public List<Trainees> getAllTrainees() {
		return dao.getAllTrainees();
	}

}
