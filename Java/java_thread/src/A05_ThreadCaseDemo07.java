public class A05_ThreadCaseDemo07{
	public static void main(String[] args){
		Info info = new Info();
		Producer p = new Producer(info);
		new Thread(p).start();
	}
}
class Info{
	private String name="a";
	private String content="b";
	private boolean flag = false;
	public synchronized void setter(String name,String content){
		this.name = name;
		this.content = content;	
		try{
			super.fun();
		}catch(Exception e){
			
		}
		
	}
	public synchronized void getter(){
		System.out.println("name = "+this.name+"\tcontent = "+this.content);
		super.notify();
	}
}
class Producer implements Runnable{
	private Info info;
	public Producer(Info info){
		this.info = info;
	}
	public void run(){
		for(int i=0;i<10;++i){
			this.info.setter("mzy","never giver up");
			this.info.getter();
		}
	}
	public void fun(){
		System.out.println("agc");
	}
}


































