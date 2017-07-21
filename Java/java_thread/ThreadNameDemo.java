//currentThread().getName()
public class ThreadNameDemo {
	public static void main(String[] args) {
		MyThread mt = new MyThread();
		
		new Thread(mt).start();
		new Thread(mt,"AAAA").start();
		new Thread(mt).start();
		new Thread(mt,"BBBB").start();
	}
}
class CurrentThreadDemo{  //currentThread()
	public static void main(String[] args){
		MyThread mt = new MyThread();
		new Thread(mt,"QQ").start();
		mt.run();
	}
}
class ThreadJoinDemo{  // join()  force start join thread
	public static void main(String[] args){
		MyThread mt = new MyThread();
		Thread t = new Thread(mt,"Join");
		t.start();
		try{
		t.join();
		mt.run();
		//t.join();
			}catch (Exception e){}
	}
}
class ThreadAliveDemo{ //isAlive()
	public static void main(String[] args){
		MyThread mt = new MyThread();
		Thread t = new Thread(mt,"Alive");
		System.out.println("before t.start() Thread is live = " + t.isAlive());
		t.start();
		System.out.println("after t.start() Thread is live = " + t.isAlive());
	//	mt.run();
		System.out.println("code end Thread is live = " + t.isAlive()); // not sure
	}
}
class ThreadInterruptDemo{  // imterrupt()
	public static void main(String[] args){
		MyThread mt = new MyThread();
		Thread t = new Thread(mt,"interrupt");
		t.start();
		try{
			Thread.sleep(12);
			}catch (Exception e){}
		t.interrupt();
		mt.run();
	}
}
class ThreadDaemonDemo {
	public static void main(String[] args){
		MyThread mt = new MyThread();
		Thread t = new Thread(mt," setDaemon");
		t.start();
		t.setDaemon(true);
		System.exit(0);
	}
}
class ThreadPriorityDemo {
	public static void main(String[]  args) {
		MyThread mt = new MyThread();
		Thread t1 = new Thread(mt,"AAAA");
		Thread t2 = new Thread(mt,"BBBB");
		Thread t3 = new Thread(mt,"CCCC");
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.NORM_PRIORITY);
		t3.setPriority(Thread.MIN_PRIORITY);
		t1.start();
		t2.start();
		t3.start();
		mt.run();
	}
}
class MyThread implements Runnable { //currentThread().getName() , Thread.sleep()
	public void run(){
		for(int i = 0; i<10; i++){
			try{
				Thread.sleep(5);
				if(i==3){
					Thread.currentThread().yield();
				}
				System.out.println(Thread.currentThread().getName() +"  Run "+i +" Thread Priority "+ Thread.currentThread().getPriority());
				}catch (Exception e){
				System.out.println(Thread.currentThread().getName() +"  interrupt "+i);
				}
			
		}
	}
}


