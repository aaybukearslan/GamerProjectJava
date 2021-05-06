
public class Main {

	public static void main(String[] args) {
	  GamerManager gamerManager = new GamerManager(new UserValidationManager());
	  
	  Gamer gamer=new Gamer(1,"Aybuke","Arslan",2002,2222222) ;
		  
	
	  gamerManager.add(gamer);
	  
	  Game game1= new Game(1,"Valorant",160);
	  
	  GameManager gameManager =new GameManager();
	  gameManager.add(game1);
	  
	  Campaign campaign1 = new Campaign(1," Kurban bayramı ",20);
	  
	  CampaignManager campaignManager =new CampaignManager();
	  campaignManager.discount(campaign1,game1);
	  
	  SalesManager salesManager = new SalesManager();
	  salesManager.buyGame(gamer, game1);
	  
	  
	 
	  
	}

}
