package service;

import model.Trainer;

public interface TrainerService {

public boolean trainerSignUp(Trainer t);
	
	public String updatePassword(int id, Trainer t);

}
