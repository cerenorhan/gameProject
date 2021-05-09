package gameProject;

import java.util.Date;

import gameProject.concretes.CampaignManager;
import gameProject.concretes.GameManager;
import gameProject.concretes.GamerManager;
import gameProject.concretes.SaleManager;
import gameProject.entities.Campaign;
import gameProject.entities.Game;
import gameProject.entities.Gamer;
import gameProject.mernis.MernisSystem;

public class Main {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		Gamer gamer = new Gamer(1, "Ceren", "Orhan", "corhan@yahoo.com", new Date(1988, 11, 15), "12345678978");
		GamerManager gamerManager = new GamerManager(new MernisSystem());
		gamerManager.add(gamer);
		
		Game game = new Game(1, "Call of Duty", 100);
		GameManager gameManager = new GameManager();
		gameManager.add(game);
		
		Game game2 = new Game(2, "Age of Empires", 80);
		GameManager gameManager2 = new GameManager();
		gameManager2.add(game2);
		gameManager2.delete(game2);
		
		Campaign campaign = new Campaign(1, "Karne Ýndirimi", 20);
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(campaign);
		
		SaleManager saleManager = new SaleManager();
		saleManager.campaignsale(game, gamer, campaign);
	}


}
