public class A05_ThreadCaseDemo03{
	public static void main(String[] args){
		Info5 info = new Info5();
		Producer5 p = new Producer5(info);
		Consumer5 c = new Consumer5(info);
		new Thread(p).start();
		new Thread(c).start();
	}
}
class Info5{
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
class Producer5 implements Runnable{
	private Info5 info;
	public Producer5(Info5 info){
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
class Consumer5 implements Runnable{
	private Info5 info;
	public Consumer5(Info5 info){
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

































