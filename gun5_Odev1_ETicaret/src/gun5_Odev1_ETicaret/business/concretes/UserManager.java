package gun5_Odev1_ETicaret.business.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import gun5_Odev1_ETicaret.business.abstracts.UserService;
import gun5_Odev1_ETicaret.core.EmailService;
import gun5_Odev1_ETicaret.dataAccess.abstracts.UserDao;
import gun5_Odev1_ETicaret.entities.concretes.User;

public class UserManager implements UserService{

	private UserDao userDao;
	private EmailService emailService;
	public UserManager(UserDao userDao,EmailService emailService) {
		super();
		this.userDao = userDao;
		this.emailService = emailService;
	}

	@Override
	public void signIn(String email, String password) {
		if(email=="evinoguz.b21@gmail.com") {
			if(password=="123456789") {
				System.out.println("Giris basarili bir sekilde gerceklesti.");
				return;
			}
			else {
				System.out.println("Uyari: Sifre hatali");
				return;
			}
		}
		System.out.println("Uyari: Eposta hatali");

		/*for(User user:userDao.getAll()) {
			if(user.getEmail()==email && user.getPassword()==password) {
				System.out.println("Giris basarili");
				return;
			}
		}*/
	}

	@Override
	public void signUp(User user) {
		if(user.getFirstName().length()<2) {
			System.out.println("Uyari: Ad alaný en az iki karekterli olmalý");
			return;
		}
		if(user.getLastName().length()<2) {
			System.out.println("Uyari: Soyad alaný en az iki karekterli olmalý");
			return;
		}
		String regex="^(.+)@(.+)$";
		Pattern pattern=Pattern.compile(regex);
		Matcher matcher=pattern.matcher(user.getEmail());
		if(!matcher.matches()) {
			System.out.println("Uyari: Email geçersiz.");
			return;
		}
		else {
			if(user.getEmail()=="oguzevin.b21@gmail.com") {
				System.out.println("Uyari: Bu eposta zaten kayýtlý, lütfen farkli bir eposta deneyiniz.");
				return;
			}
			/*for(User userEmail:userDao.getAll()) {
				if(userEmail.getEmail()==user.getEmail()) {
					System.out.println("Bu eposta zaten kayýtlý. Lütfen farkli bir eposta deneyiniz.");
					return;
				}
			}*/
		}
		if(user.getPassword().length()<6)
		{
			System.out.println("Uyari: Sifre en az 6 karekter olmalýdýr.");
			return;
		}
		this.verifyAccount(user.getEmail(), user.getPassword());
		this.userDao.signUp(user);		
	}

	@Override
	public void verifyAccount(String email, String password) {
		System.out.println("Uyari: '"+email+"' emailinize dogrulama kodu gonderilmistir.");
		System.out.println("Kullanici, dogrulama kodunu onaylanmistir.");
	}

	@Override
	public void signUpWithGoogleAccount(String email, String password) {
		this.emailService.signIn(email, password);
	}

}
