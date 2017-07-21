public class A04_RunnableDemo1{
	public static void main(String[] args){
		MyThread a = new MyThread("A");
		MyThread b = new MyThread("B");
		Thread t1 = new Thread(a);
		Thread t2 = new Thread(b);
		t1.start();
		t2.start();
	}
}
class MyThread implements Runnable{
	private String name;
	public MyThread(String name){
		this.name = name;
	}
	public void run(){
		for(int i=0;i<10;++i){
			System.out.println("Thread "+name+" "+i);
		}
	}
}