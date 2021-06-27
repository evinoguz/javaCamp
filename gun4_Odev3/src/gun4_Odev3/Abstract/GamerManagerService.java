package gun4_Odev3.Abstract;

import gun4_Odev3.Entities.Gamer;

public interface GamerManagerService {
	void save(Gamer gamer);
	void update(int id,Gamer gamer);
	void delete(int id,Gamer gamer);
}
