package gun4_Odev3.Concrete;

import gun4_Odev3.Abstract.PersonCheckService;
import gun4_Odev3.Entities.Gamer;

public class PersonCheckManager implements PersonCheckService{

	@Override
	public boolean checkIfRealCustomer(Gamer gamer) {
		return true;
	}

}
