package gun4_Odev3.Concrete;

import gun4_Odev3.Abstract.PersonCheckService;
import gun4_Odev3.Abstract.GamerManager;
import gun4_Odev3.Entities.Gamer;

public class PersonManager extends GamerManager{
private PersonCheckService gamerCheckService;
	
	public PersonManager(PersonCheckService gamerCheckService) {
		this.gamerCheckService=gamerCheckService;
	}
	@Override
	public void save(Gamer gamer) {
		if(gamerCheckService.checkIfRealCustomer(gamer)) {
			System.out.println("Oyuncu '"+gamer.getFirstName()+" "+gamer.getLastName()+"' kaydedildi.");		
		} 
		else {
			System.out.println("Kimlik bilgileri doðrulanamadý.");
		}
	}
	
}
