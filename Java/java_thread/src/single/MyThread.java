package single;

public class MyThread extends Thread{
	
	public void run(){
		System.out.println(Thread.currentThread().getName()+ "execute...");
	}

}
