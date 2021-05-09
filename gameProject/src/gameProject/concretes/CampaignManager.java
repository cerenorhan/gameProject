package gameProject.concretes;

import gameProject.abstracts.CampaingService;
import gameProject.entities.Campaign;

public class CampaignManager implements CampaingService {

	@Override
	public void add(Campaign campaing) {
		System.out.println("Kampanya eklendi: " + campaing.getName());
		
	}

	@Override
	public void delete(Campaign campaing) {
		System.out.println("Kampanya silindi: " + campaing.getName());
		
	}

	@Override
	public void update(Campaign campaing) {
		System.out.println("Kampanya güncellendi: " + campaing.getName());
		
	}
	
	

}
