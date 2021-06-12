package gun3_Odev2;

public class StudentManager  extends UserManager{
	public void add(User user) {
		System.out.println(user.getName()+ " öğrenci olarak kaydedildi");
	}
	public void addMultible(User[] users) {
		for(User user:users) {
			add(user);
		}
	}
}

