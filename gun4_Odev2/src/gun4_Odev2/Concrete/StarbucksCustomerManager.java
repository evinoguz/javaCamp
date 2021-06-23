package gun4_Odev2.Concrete;

import gun4_Odev2.Abstract.BaseCustomerManager;
import gun4_Odev2.Abstract.CustomerCheckService;
import gun4_Odev2.Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager{
	private CustomerCheckService customerCheckService;
	
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService=customerCheckService;
	}
	
	@Override
	public void save(Customer customer) {
		if(customerCheckService.checkIfRealCustomer(customer)) {
			System.out.println("save customer");
		} 
		else {
			System.out.println("Not a valid customer");
		}
	}

}
