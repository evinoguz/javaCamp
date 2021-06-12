package inheritance;

public class Main {

	public static void main(String[] args) {
		IndividualCustomer evin=new IndividualCustomer();
		evin.customerNumber="123";
		
		CorporateCustomer hepsiBurada=new CorporateCustomer();
		hepsiBurada.customerNumber="567";
		
		Customer[] customers= {evin,hepsiBurada};
		CustomerManager customerManager=new CustomerManager();
		customerManager.addMultible(customers);
	}

}
