package interfaces;

public class CustomerManager {
	// loosly(gevþek) - tightly(katý baðlýlýk) coupled
	
	private Logger[] loggers= {}; // Sað týkla->Source->Generate Constructor using fields ile otomatik oluþturur.
	
	public CustomerManager() {
	}
	public CustomerManager(Logger[] loggers) {
		this.loggers=loggers;
	}
	
	public void add(Customer customer) {
		System.out.println("Müþteri eklendi "+customer.getFirstName());
		//tightly
		//DatabaseLogger logger=new DatabaseLogger();
		//logger.log(customer.getFirstName()+" veritabanýna loglandý.");
		Utils.runLogger(loggers, customer.getFirstName());
	}
	
	public void delete(Customer customer) {
		System.out.println("Müþteri silindi "+customer.getFirstName());
		//DatabaseLogger logger=new DatabaseLogger();
		//logger.log(customer.getFirstName()+" veritabanýna loglandý.");
		Utils.runLogger(loggers, customer.getFirstName());
	}
}
