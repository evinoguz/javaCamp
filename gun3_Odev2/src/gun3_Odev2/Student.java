package gun3_Odev2;

public class Student extends User{
	String lesson;

    public Student() {
		
	}
	public Student(String lesson) {
		super();
		this.lesson = lesson;
	}

	public String getLesson() {
		return lesson;
	}

	public void setLesson(String lesson) {
		this.lesson = lesson;
	}
}
