package gun4_Odev2;

import java.time.LocalDate;

import gun4_Odev2.Abstract.BaseCustomerManager;
import gun4_Odev2.Adapters.MernisServiceAdapter;
import gun4_Odev2.Concrete.NeroCustomerManager;
import gun4_Odev2.Concrete.StarbucksCustomerManager;
import gun4_Odev2.Entities.Customer;


public class Main {

	public static void main(String[] args) {

		Customer user1=new Customer();
	    user1.setId(1);
	    user1.setFirstName("Evin");
	    user1.setLastName("Oðuz");
	    user1.setDateOfBirth(LocalDate.of(1996, 7, 9));
	    user1.setNationalityId("11286114828");

		BaseCustomerManager customerNero=new NeroCustomerManager();
		customerNero.save(user1);
		
		BaseCustomerManager customerStarbuck=new StarbucksCustomerManager(new MernisServiceAdapter());
		customerStarbuck.save(user1);
	}

}
