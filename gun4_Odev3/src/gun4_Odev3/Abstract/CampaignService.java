package gun4_Odev3.Abstract;

import gun4_Odev3.Entities.Campaign;

public interface CampaignService {
	void add(Campaign campaign);
	void update(int id,Campaign campaign);
	void delete(int id,Campaign campaign);
}
