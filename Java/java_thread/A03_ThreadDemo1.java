public class A03_ThreadDemo1{
	public static void main(String[] args){
		MyThread a = new MyThread("A");
		MyThread b = new MyThread("B");
		a.start();
		b.start();
	}
}
class MyThread extends Thread{
	private String name;
	public MyThread(String name){
		this.name = name;
	}
	public void run(){
		for(int i=0; i<10;++i){
			System.out.println("Thread "+name+"  "+i);
		}
	}
}