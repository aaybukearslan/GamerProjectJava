
public class CampaignManager implements CampaignService {

	@Override
	public void add(Campaign campaign) {
		System.out.println("Kampanya eklendi:"+campaign.getCampaignName());
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("Kampanya silindi:"+campaign.getCampaignName());
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("Kampanya güncellendi:"+campaign.getCampaignName());
		
	}

	@Override
	public void discount(Campaign campaign, Game game) {
		double updatedPrice=game.getGamePrice() - ((game.getGamePrice() * campaign.getDiscount() / 100));
		System.out.println(game.getGameName()+"satýldý"+campaign.getCampaignName()+"%"
				+ campaign.getDiscount() + " indirimli fiyat : " + updatedPrice);
		
		
	}

	
}
