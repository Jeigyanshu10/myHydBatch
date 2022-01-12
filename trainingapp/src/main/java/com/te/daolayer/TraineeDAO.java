package com.te.daolayer;

import java.util.List;

import com.te.dtolayer.Trainees;

public interface TraineeDao {

	public boolean insertTrainee(Trainees trainee);

	public Trainees fetchTrainee(int id);

	Trainees authenticate(int userId, String password);

	public boolean deleteTrainee(int id);

	public boolean updateTrainee(Trainees trainee);

	public List<Trainees> getAllTrainees();
}
