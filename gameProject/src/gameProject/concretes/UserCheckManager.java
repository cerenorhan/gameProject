package gameProject.concretes;

import gameProject.abstracts.UserCheckService;
import gameProject.entities.Gamer;

public class UserCheckManager implements UserCheckService {

	@Override
	public boolean checkIfRealPerson(Gamer gamer) {
		
		return true;
	}

}
