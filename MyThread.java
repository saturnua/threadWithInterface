package myPack;

public class MyThread implements Runnable{

	@Override
	public void run() {
		System.out.println("Побочный поток завршен......");
	}
}
