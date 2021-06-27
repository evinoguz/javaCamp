package gun4_Odev3.Abstract;

import gun4_Odev3.Entities.Gamer;

public class GamerManager implements GamerManagerService{

	@Override
	public void save(Gamer gamer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(int id,Gamer gamer) {
		System.out.println("Oyuncu '"+gamer.getFirstName()+" "+gamer.getLastName()+"' güncellendi.");
	}

	@Override
	public void delete(int id,Gamer gamer) {
		System.out.println("Oyuncu '"+gamer.getFirstName()+" "+gamer.getLastName()+" silindi.");			
	}
	
}
