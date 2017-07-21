public class A05_ThreadCaseDemo05{
	public static void main(String[] args){
		Info info = new Info();
		Producer p = new Producer(info);
		Consumer c = new Consumer(info);
		new Thread(p).start();
		new Thread(c).start();
	}
}
class Info{
	private String name="a";
	private String content="b";
	private boolean flag = false;
	public synchronized void setter(String name,String content){
		if(flag==true)
		{
			 try{
				 super.wait();
			 }catch(Exception e){
				 e.printStackTrace();
			 }
		}
		
			//System.out.println("--set--");
			this.name = name;
			try{
				Thread.sleep(200);
			}catch(Exception e){
				e.printStackTrace();
			}
			this.content = content;
			flag = true;
			super.notify();
			
		
		
	}
	public synchronized void getter(){
		if(flag==false)
		{
			try{
				super.wait();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		
			try{
				Thread.sleep(123);
			}catch(Exception e){
				e.printStackTrace();
			}
			//System.out.println("--get--");
			System.out.println("name = "+this.name+"\tcontent = "+this.content);
			flag = false;
			super.notify();
		
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

































