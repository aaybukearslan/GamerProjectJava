
public class SalesManager implements SalesService {

	@Override
	public void buyGame(Gamer gamer, Game game) {
		System.out.println(gamer.getFirstName()+"  isimli oyuncu "+game.getGameName()+"  oyununu sat�n ald�. ");
	}

	@Override
	public void giveBack(Gamer gamer, Game game) {
		System.out.println(gamer.getFirstName()+"  isimli oyuncu  "+game.getGameName()+"  oyununu geri iade etti. ");
		
	}

}
