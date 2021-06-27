package gun4_Odev3.Abstract;

import gun4_Odev3.Entities.Campaign;
import gun4_Odev3.Entities.Game;
import gun4_Odev3.Entities.Gamer;

public interface SaleService {
	void sale(Gamer gamer,Game game,Campaign campaign);
}
