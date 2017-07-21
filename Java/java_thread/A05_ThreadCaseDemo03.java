public class A05_ThreadCaseDemo03{
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
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return this.name;
	}
	public void setContent(String content){
		this.content = content;
	}
	public String getContent(){
		return this.content;
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
				this.info.setName("mzy");
				try{
					Thread.sleep(80);
				}catch(Exception e){
					e.printStackTrace();
				}
				this.info.setContent("never give up");
				flag = false;
			}else{
				this.info.setName("java");
				try{
					Thread.sleep(100);
				}catch(Exception e){
					e.printStackTrace();
				}
				this.info.setContent("Hello World");
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
			System.out.println("naem = "+this.info.getName()+"\tcontent = "+this.info.getContent());
		}
	}
}

































