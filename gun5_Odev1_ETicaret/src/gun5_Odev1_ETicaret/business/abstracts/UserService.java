package gun5_Odev1_ETicaret.business.abstracts;

import gun5_Odev1_ETicaret.entities.concretes.User;

public interface UserService {
	void signIn(String email, String password);
	void signUp(User user);
	void verifyAccount(String email, String password);
	void signUpWithGoogleAccount(String googleMail, String password);

}
