public class A02_RunnableDemo {
	public static void main(String[] args){
		MyRunnable mt1 = new MyRunnable("Q");
		MyRunnable mt2 = new MyRunnable("W");
		new Thread(mt1).start();
		try{
			Thread.sleep(1);
			}catch(Exception e){}
		new Thread(mt2).start();
	}
}
class MyRunnable implements Runnable{
	String str;
	public MyRunnable(String str){
		this.str  = str;
	}
	public void run(){	
		for(int i = 0;i<10;i++){
			System.out.println(str+" "+i);
		}
	}
}

