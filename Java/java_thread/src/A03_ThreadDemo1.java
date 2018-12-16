public class A03_ThreadDemo1{
	public static void main(String[] args){
		MyThread2 a = new MyThread2("A");
		MyThread2 b = new MyThread2("B");
		a.start();
		b.start();
	}
}
class MyThread2 extends Thread{
	private String name;
	public MyThread2(String name){
		this.name = name;
	}
	public void run(){
		for(int i=0; i<10;++i){
			System.out.println("Thread "+name+"  "+i);
		}
	}
}