package interfaces;

public class Main {

	public static void main(String[] args) {
		Customer evin=new Customer(1,"Evin","Oðuz");
		Logger[] loggers= {new SmsLogger(),new DatabaseLogger()};
		CustomerManager customerManager=new CustomerManager(loggers); // interface sýnýfýnda baðýmlýlýðý smstir
		customerManager.add(evin);
	}

}