package gun3_Odev2;

public class Instructor extends User{
	String contentName;
	int countStudent;
	
	public Instructor() {
		
	}
	public Instructor(String contentName, int countStudent) {
		super();
		this.contentName = contentName;
		this.countStudent = countStudent;
	}
	
	public String getContentName() {
		return contentName;
	}
	public void setContentName(String contentName) {
		this.contentName = contentName;
	}
	public int getCountStudent() {
		return countStudent;
	}
	public void setCountStudent(int countStudent) {
		this.countStudent = countStudent;
	}
}
