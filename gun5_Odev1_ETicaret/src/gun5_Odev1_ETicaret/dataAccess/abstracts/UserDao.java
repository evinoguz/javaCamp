package gun5_Odev1_ETicaret.dataAccess.abstracts;

import java.util.List;

import gun5_Odev1_ETicaret.entities.concretes.User;

public interface UserDao {
	void signIn(User user);
	void signUp(User user);
	User get(int email);
	List<User> getAll();
}
