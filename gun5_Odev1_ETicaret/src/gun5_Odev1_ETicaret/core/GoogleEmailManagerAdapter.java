package gun5_Odev1_ETicaret.core;

import JEmail.GoogleEmailManager;

public class GoogleEmailManagerAdapter implements EmailService{

	@Override
	public void signIn(String email, String password) {
		GoogleEmailManager manager=new GoogleEmailManager();
		manager.signIn(email, password);
	}

}
