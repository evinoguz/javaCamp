package gun3_Odev2;

public class Main {

	public static void main(String[] args) {
		
		Student evin=new Student();
		evin.setId(1);
		evin.setName("Evin");
		evin.setEmail("evinoguz.b21@gmail.com");
		evin.setPassword("123456");
		evin.setLesson("Java & React Kampý");
		
		Student oguz=new Student();
		oguz.setId(1);
		oguz.setName("Oðuz");
		oguz.setEmail("oguzevin.b21@gmail.com");
		oguz.setPassword("123456");
		oguz.setLesson("C# & Angular");
		
		Instructor engin=new Instructor();
		engin.setId(2);
		engin.setName("Engin");
		engin.setEmail("");
		engin.setPassword("987654");
		engin.setContentName("Ödev3");
		engin.setCountStudent(5);
		
		Student[] students= {evin,oguz};
		
		StudentManager studentManager=new StudentManager();
		InstructorManager instructorManager=new InstructorManager();
		studentManager.addMultible(students);
		instructorManager.add(engin);		
		instructorManager.signIn(engin);
		studentManager.logOut(evin);
	}

}
