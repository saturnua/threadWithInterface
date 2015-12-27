package myPack;

public class Main {

	static MyThread thread;
	
	public static void main(String[] args) {
		thread = new MyThread();
		
		Thread mainThread = new Thread(thread); 
		mainThread.start();
	
		System.out.println("Главный поток завершен...");
	}
}
