package gun4_Odev2.Concrete;

import gun4_Odev2.Abstract.CustomerCheckService;
import gun4_Odev2.Entities.Customer;

public class CustomerCheckManager implements CustomerCheckService {

	@Override
	public boolean checkIfRealCustomer(Customer customer) {
		return true;
	}

}
