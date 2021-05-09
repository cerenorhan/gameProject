package gameProject.concretes;

import gameProject.abstracts.GamerService;
import gameProject.abstracts.UserCheckService;
import gameProject.entities.Gamer;


public class GamerManager implements GamerService{

	
	UserCheckService checkService;
	public GamerManager(UserCheckService checkService) {
		this.checkService = checkService;
	}

	@Override
	public void add(Gamer gamer) {
		System.out.println("Oyuncu eklendi : " + gamer.getFirstName() + " " + gamer.getLastName());
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println("Oyuncu silindi : " + gamer.getFirstName() + " " + gamer.getLastName());
		
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println("Oyuncu güncellendi : " + gamer.getFirstName() + " " + gamer.getLastName());
		
	}
		
	
	@SuppressWarnings("unused")
	private void personControl(Gamer gamer) {
		if(checkService.checkIfRealPerson(gamer)) {
			System.out.println("Oyuncu bulundu");
		}else {
			System.out.println("Oyuncu bululnamadý");
		}
		
	}

}
