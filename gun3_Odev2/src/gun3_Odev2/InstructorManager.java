package gun3_Odev2;

public class InstructorManager extends UserManager{
	public void add(User user) {
		System.out.println(user.getName()+ " eğitmen olarak kaydedildi");
	}
	public void addMultible(User[] users) {
		for(User user:users) {
			add(user);
		}
	}
}
