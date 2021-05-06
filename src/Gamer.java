
public class Gamer {
 
	private int gamerId;
	private String firstName;
	private String lastName;
	private int birtDay;
	private int identityNumber; 
	
	public Gamer() {
					
	}

	public Gamer(int gamerId, String firstName, String lastName, int birtDay, int identityNumber) {
		super();
		this.gamerId = gamerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birtDay = birtDay;
		this.identityNumber = identityNumber;
	}

	public int getGamerId() {
		return gamerId;
	}

	public void setGamerId(int gamerId) {
		this.gamerId = gamerId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getBirtDay() {
		return birtDay;
	}

	public void setBirtDay(int birtDay) {
		this.birtDay = birtDay;
	}

	public int getIdentityNumber() {
		return identityNumber;
	}

	public void setIdentityNumber(int identityNumber) {
		this.identityNumber = identityNumber;
	}
	
	
	
	
	
	
	
	
}

	
	


