
public class Game {
	private int gameId;
	private String GameName;
	private int gamePrice;  
	
	public Game() {
		
	}

	public Game(int gameId, String gameName, int gamePrice) {
		super();
		this.gameId = gameId;
		GameName = gameName;
		this.gamePrice = gamePrice;
	}

	public int getGameId() {
		return gameId;
	}

	public void setGameId(int gameId) {
		this.gameId = gameId;
	}

	public String getGameName() {
		return GameName;
	}

	public void setGameName(String gameName) {
		GameName = gameName;
	}

	public int getGamePrice() {
		return gamePrice;
	}

	public void setGamePrice(int gamePrice) {
		this.gamePrice = gamePrice;
	}


	
}
