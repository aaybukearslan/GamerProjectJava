
public class UserValidationManager implements UserValidationService{

	@Override
	public boolean validate(Gamer gamer) {
		if(gamer.getBirtDay()==2002 &&  gamer.getFirstName()== "Aybuke" && gamer.getLastName()=="Arslan"
				&& gamer.getIdentityNumber() == 2222222)
		{ 
			return true;
		}
		
		else {
		return false;
	}

	}
	
	}
