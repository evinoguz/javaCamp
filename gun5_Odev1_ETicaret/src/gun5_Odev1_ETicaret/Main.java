package gun5_Odev1_ETicaret;

import gun5_Odev1_ETicaret.business.abstracts.UserService;
import gun5_Odev1_ETicaret.business.concretes.UserManager;
import gun5_Odev1_ETicaret.core.GoogleEmailManagerAdapter;
import gun5_Odev1_ETicaret.dataAccess.concretes.StudentUserDao;
import gun5_Odev1_ETicaret.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		
		User user1=new User(1,"e","o","oguzevin.b21@gmail.com","123");
		User user2=new User(2,"evin","o","oguzevin.b21@gmail.com","123");
		User user3=new User(3,"evin","oguz","oguzevin.b21","123");
		User user4=new User(4,"evin","oguz","oguzevin.b21@gmail.com","123");
		User user5=new User(5,"evin","oguz","evinoguz.b21@gmail.com","123");
		User user6=new User(6,"evin","oguz","evinoguz.b21@gmail.com","123456");

		UserService userService=new UserManager(new StudentUserDao(), new GoogleEmailManagerAdapter());
		System.out.println("------------");
		userService.signUp(user1);
		userService.signUp(user2);
		userService.signUp(user3);
		userService.signUp(user4);
		userService.signUp(user5);
		userService.signUp(user6);
		
		System.out.println("------------");
		userService.signIn("oguz.b21@gmail.com","123456789");
		userService.signIn("evinoguz.b21@gmail.com","1233333");
		userService.signIn("evinoguz.b21@gmail.com","123456789");

		System.out.println("------------");
		userService.signUpWithGoogleAccount("batmanli.b21@gmail.com","123456789");
		System.out.println("------------");

	}
}
