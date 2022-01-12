package com.te.servicelayer;

import java.util.List;

import com.te.dtolayer.Trainees;

public interface TraineeService {
	public boolean addTrainee(Trainees trainee);

	public Trainees getTrainee(int id);

	public Trainees serviceAuthentication(int userId, String password);

	public boolean deleteTrainee(int id);

	public boolean updateTrainee(Trainees trainee);

	public List<Trainees> getAllTrainees();
}
