package gun5_Odev1_ETicaret.dataAccess.concretes;

import java.util.List;

import gun5_Odev1_ETicaret.dataAccess.abstracts.UserDao;
import gun5_Odev1_ETicaret.entities.concretes.User;

public class InstructorUserDao implements UserDao{

	@Override
	public void signIn(User user) {
		System.out.println("Eðitmen, basarili bir þekilde giriþ yaptý.");				
	}

	@Override
	public void signUp(User user) {
		
		System.out.println("Eðitmen: '"+user.getEmail()+"' kaydoldu.");		
	}

	@Override
	public User get(int email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
