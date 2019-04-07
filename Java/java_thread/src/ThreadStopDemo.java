public class ThreadStopDemo {
	public static void main(String[] args){
		MyThread mt = new MyThread();
		new Thread(mt,"Stop").start();
		try{
			Thread.sleep(4);
			}catch (Exception e){}
		mt.stop();
	}
}
class MyThread implements Runnable {
	private boolean flag = true;
	public void run(){
		int i = 0;
		while(flag){
			System.out.println(Thread.currentThread().getName() + " run "+ i);
			i++;
		}
	}
	public void stop(){
		this.flag = false;
	}
}
