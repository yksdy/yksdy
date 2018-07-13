public class ThreadSynchronizedDemo{
	public static void main(String[] args){
	    MyThread mt = new MyThread();
		Thread t1 = new Thread(mt,"Thread AAA");
		Thread t2 = new Thread(mt,"Thread BBB");
		Thread t3 = new Thread(mt,"Thread CCC");
		Thread t4 = new Thread(mt,"Thread DDD");
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}
class MyThread implements Runnable {
	private int ticket = 10;
	public void run(){
		try{
			Thread.sleep(5);
			}catch (Exception e){}
		
			while(ticket>0){
				synchronized(this){
					ticket--;				
					System.out.println(Thread.currentThread().getName() + " get ticket " + ticket);
				}
			}
		}
}
