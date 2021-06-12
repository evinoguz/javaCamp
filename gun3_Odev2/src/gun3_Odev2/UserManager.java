package gun3_Odev2;

public class UserManager {
	
	public void signIn(User user) {
		System.out.println(user.getName() + ", giriþ yaptý.");
	}

	public void logOut(User user) {
		System.out.println(user.getName() + ", çýkýþ yaptý.");
	}
}
