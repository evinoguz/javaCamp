package gun4_Odev3;

import java.time.LocalDate;

import gun4_Odev3.Abstract.BaseSaleManager;
import gun4_Odev3.Abstract.GamerManager;
import gun4_Odev3.Adapters.MernisServiceAdapter;
import gun4_Odev3.Concrete.ASaleManager;
import gun4_Odev3.Concrete.BSaleManager;
import gun4_Odev3.Concrete.CampaignManager;
import gun4_Odev3.Concrete.PersonManager;
import gun4_Odev3.Entities.Campaign;
import gun4_Odev3.Entities.Game;
import gun4_Odev3.Entities.Gamer;


public class Main {

	public static void main(String[] args) {
		Gamer user1=new Gamer();
	    user1.setId(1);
	    user1.setFirstName("Evin");
	    user1.setLastName("Oðuz");
	    user1.setDateOfBirth(LocalDate.of(1996, 7, 9));
	    user1.setNationalityId("11286114824");
	    
	    GamerManager manager=new PersonManager(new MernisServiceAdapter());
	    manager.save(user1);
	    manager.update(user1.getId(),user1);
	    manager.delete(user1.getId(),user1);
	    
	    Game game1=new Game();
	    game1.setId(1);
	    game1.setName("Pubg");
	    game1.setSize("672mb");
	    game1.setPrice(25);
	    game1.setDownloadCount(4300);
	    
	    Game game2=new Game(2,"Cs go","10gb",50,25300);
	
	    Campaign campaign1=new Campaign(1,"yaz sezonu",10);
	    
	    System.out.println("\nKampanya iþlemleri\n----------");
	    CampaignManager campaignManager1=new CampaignManager();
	    campaignManager1.add(campaign1);
	    campaignManager1.delete(1, campaign1);
	    campaignManager1.update(2, campaign1);
	    
	    System.out.println("\nSatýþ iþlemleri\n----------");
	    BaseSaleManager saleA=new ASaleManager();
	    saleA.sale(user1, game1,campaign1);
	    BaseSaleManager saleB=new BSaleManager();
	    saleB.sale(user1, game2,campaign1);
	    
	}

}
