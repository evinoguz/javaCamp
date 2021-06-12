package inheritance2;

public class EmailLogger extends Logger{
	@Override //kendi kodunu yazacak. Logger var ama onu ezdi
    public void log() {
		System.out.println("Email yollandý.");
	}
}
