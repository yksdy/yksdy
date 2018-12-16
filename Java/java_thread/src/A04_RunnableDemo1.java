public class A04_RunnableDemo1{
	public static void main(String[] args){
		MyThread3 a = new MyThread3("A");
		MyThread3 b = new MyThread3("B");
		Thread t1 = new Thread(a);
		Thread t2 = new Thread(b);
		t1.start();
		t2.start();
	}
}
class MyThread3 implements Runnable{
	private String name;
	public MyThread3(String name){
		this.name = name;
	}
	public void run(){
		for(int i=0;i<10;++i){
			System.out.println("Thread "+name+" "+i);
		}
	}
}