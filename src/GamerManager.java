
public class GamerManager implements GamerService  {

	
	private UserValidationService userValidationService;
	
	
	public GamerManager( UserValidationService userValidationService) {
		super();
		
		this.userValidationService = userValidationService;
	}

	@Override
	public void add(Gamer gamer) {
		
		if(userValidationService.validate(gamer))
		{
			System.out.println("Oyuncu Eklendi: "+gamer.getFirstName());
		}
		else
		{
			System.out.println("Hatalý giriþ yapýldý.");  
		}
		
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println("Oyuncu güncellendi:"+ gamer.getFirstName());
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println("Oyuncu silindi:"+ gamer.getFirstName());
	}

	
	
}
