package gun4_Odev3.Entities;

public class Game {
	int id;
	String name;
	String size;
	int price;
	int downloadCount;
	
	public Game() {}

	public Game(int id, String name, String size, int price, int downloadCount) {
		super();
		this.id = id;
		this.name = name;
		this.size = size;
		this.price = price;
		this.downloadCount = downloadCount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getDownloadCount() {
		return downloadCount;
	}

	public void setDownloadCount(int downloadCount) {
		this.downloadCount = downloadCount;
	}
	
	
}
