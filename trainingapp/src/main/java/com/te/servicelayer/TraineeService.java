package com.te.servicelayer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.daolayer.TraineeDAO;
import com.te.dtolayer.Trainees;
import com.te.mycustomexceptions.InvalidPasswordException;

@Service
public class TraineeService {

	@Autowired
	private TraineeDAO dao;

	public boolean addTrainee(Trainees trainee) {
		if (trainee.getPassword().equals(trainee.getUsername())) {
			throw new InvalidPasswordException("You cannot have same username and password");
		}
		return dao.insertTrainee(trainee);

	}

}
