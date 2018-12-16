
public class A01_ThreadDemo {
	public static void main(String[] args){
		MyThread1 mt1 = new MyThread1("A");
		MyThread1 mt2 = new MyThread1("B");
		mt1.start();
		mt2.start();
	}
}
class MyThread1 extends Thread{
	String str;
	public MyThread1(String str){
		this.str  = str;
	}
	public void run(){
		for(int i = 0;i<10;i++){
			System.out.println(str+" "+i);
		}
	}
}
