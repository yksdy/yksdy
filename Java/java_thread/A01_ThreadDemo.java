
public class A01_ThreadDemo {
	public static void main(String[] args){
		MyThread mt1 = new MyThread("A");
		MyThread mt2 = new MyThread("B");
		mt1.start();
		mt2.start();
	}
}
class MyThread extends Thread{
	String str;
	public MyThread(String str){
		this.str  = str;
	}
	public void run(){
		for(int i = 0;i<10;i++){
			System.out.println(str+" "+i);
		}
	}
}
