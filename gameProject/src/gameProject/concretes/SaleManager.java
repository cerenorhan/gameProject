package gameProject.concretes;

import gameProject.abstracts.SaleService;
import gameProject.entities.Campaign;
import gameProject.entities.Game;
import gameProject.entities.Gamer;

public class SaleManager implements SaleService{

	@Override
	public void sale(Game game, Gamer gamer) {
		System.out.println(gamer.getFirstName() + " " + gamer.getLastName() +  " isimli ki�iye " + game.getName() + " isimli oyun sat�ld�.");
		
	}

	@Override
	public void campaignsale(Game game, Gamer gamer, Campaign campaign) {
		System.out.println(gamer.getFirstName() + " " + gamer.getLastName() +  " isimli ki�iye " + game.getName() + " isimli oyun "
							+ campaign.getName() + " isimli kampanya arac�l��� ile "
							+ "% " + campaign.getDiscountRate() + " indirim oran�yla "
							+ discountPrice(game.getUnitPrice(), campaign.getDiscountRate()) +  " fiyat�na sat�ld�");
		
	}
	
	private double discountPrice(double unitPrice, double discount) {
		return unitPrice - ((unitPrice * discount) / 100);
	}
		
}
