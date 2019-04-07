public class A05_ThreadCaseDemo04{
	public static void main(String[] args){
		Info info = new Info();
		Producer p = new Producer(info);
		Consumer c = new Consumer(info);
		new Thread(p).start();
		new Thread(c).start();
	}
}
class Info{
	private String name;
	private String content;
	public synchronized void setter(String name,String content){
		this.name = name;
		try{
			Thread.sleep(200);
		}catch(Exception e){
			e.printStackTrace();
		}
		this.content = content;
	}
	public synchronized void getter(){
		try{
			Thread.sleep(123);
		}catch(Exception e){
			e.printStackTrace();
		}
		System.out.println("naem = "+this.name+"\tcontent = "+this.content);
		
	}
}
class Producer implements Runnable{
	private Info info;
	public Producer(Info info){
		this.info = info;
	}
	public void run(){
		boolean flag = false;
		for(int i=0;i<10;++i){
			if(flag){
				this.info.setter("mzy","never giver up");
				flag = false;
			}else{
				this.info.setter("java","Hello, world");
				flag = true;
			}
		}
	}
}
class Consumer implements Runnable{
	private Info info;
	public Consumer(Info info){
		this.info = info;
	}
	public void run(){
		for(int i = 0;i<10;++i){
			try{
				Thread.sleep(94);
			}catch(Exception e){
				e.printStackTrace();
			}
			this.info.getter();
		}
	}
}

































