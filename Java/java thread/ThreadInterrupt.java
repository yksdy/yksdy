public class ThreadInterrupt{
	public static void main(String[] args){
		MyThread mt = new MyThread();
		Thread t = new Thread(mt,"InterruptThread");
		t.start();
		try{
			Thread.sleep(100);
			System.out.println(Thread.currentThread().getName() + "  sleep");
		}catch (Exception e){
			System.out.println(Thread.currentThread().getName() + "Exception");
		}
		t.interrupt();
	}
}
class MyThread implements Runnable{
	public void run(){
		
		try{
				Thread.sleep(1000);
				System.out.println(Thread.currentThread().getName() + "sleep");
			}catch (Exception e){
			 	System.out.println(Thread.currentThread().getName() + "  intterupt");
			}
	}
}
