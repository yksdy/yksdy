class AbcThread implements Runnable { //extends Thread {
	private String name;
	
	AbcThread(String name){
		this.name = name;
		new Thread(this).start();
	}
	public void run(){
		/*try{
			Thread.sleep(10);
			}catch(Exception e){
			}
			*/
		for(int i=0; i<10; i++){
			System.out.println(name + "= "+ i);
		}
	}
}

public class ThreadDemo00{	
	public static void main(String[] args){
		AbcThread mt1 = new AbcThread("xiancheng 11111");
		AbcThread mt2 = new AbcThread("xiancheng 22222");
		//mt1.run();
		//mt2.run();
		//mt1.start();
		//mt2.start();
	}
}

