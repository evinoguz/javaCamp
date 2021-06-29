package gun5_Odev1_ETicaret.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import gun5_Odev1_ETicaret.dataAccess.abstracts.UserDao;
import gun5_Odev1_ETicaret.entities.concretes.User;

public class StudentUserDao implements UserDao{

	@Override
	public void signIn(User user) {
		System.out.println("Öðrenci, basarili bir þekilde giriþ yaptý.");		
	}

	@Override
	public void signUp(User user) {
		System.out.println("Öðrenci: '"+user.getFirstName()+"' kaydoldu.");				
	}

	@Override
	public User get(int email) {
		// TODO Auto-generated method stub
		return null;
	}
	
	List<User> users=new ArrayList<User>();
	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return this.users;
	}

}
