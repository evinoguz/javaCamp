package gun4_Odev3.Abstract;

import gun4_Odev3.Entities.Campaign;
import gun4_Odev3.Entities.Game;
import gun4_Odev3.Entities.Gamer;

public abstract class BaseSaleManager implements SaleService{

	@Override
	public void sale(Gamer gamer, Game game, Campaign campaign) {
		System.out.println("'"+game.getName()+"' oyunu, '"+campaign.getName()
		+"' kampanyasý uygulanarak '"+gamer.getFirstName()+"' adlý kullanýcýya satýlmýþtýr.");
	}

}
