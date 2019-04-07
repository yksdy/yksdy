public class ThreadCaseDemo02{
	public static void main(String[] args){
		Info info = new Info();
		new Thread(new Product(info)).start();
		new Thread(new Consumer(info)).start();
	}
}
class Info{
	private String name ;
	private String career;
	private boolean flag = false;
	public synchronized void set(String name, String career){
		
		try{
			Thread.sleep(5);
		}catch (Exception e){}
		if(flag == true){
			try{
				super.wait();
			}catch (Exception e){}
		}
		this.setName(name);
		this.setCareer(career);
		flag = true;
		super.notify();
	}
	public synchronized void get(){
		try{
			Thread.sleep(5);
		}catch (Exception e){}
		if(flag == false){
			try{
				super.wait();
			}catch (Exception e){}	
		}
	    System.out.println( "name = "+this.getName() +" career = "+ this.getCareer());	
		flag = false;
		super.notify();
	}
	public void setName(String name){
		this.name = name;
	}
	public void setCareer(String career){
		this.career = career;
	}
	public String getName(){
		return this.name;
	}
	public String getCareer(){
		return this.career;
	}
}
class Product implements Runnable{
	private Info info = null;
	public Product(Info info){
		this.info = info;
	}
	public void run(){
		for(int i = 0; i<20; i++){
			try{
				Thread.sleep(90);
			}catch (Exception e){}
			if(i%2==0){
			//	this.info.setName("mengzhaoyang");
			//	this.info.setCareer("Engineer");	
				this.info.set("mengzhaoyang "+i, "Engineer "+i);
			}
			else{
			//	this.info.setName("yining");
			//	this.info.setCareer("SuperMan");
				this.info.set("yining "+i, "SuperMan "+i);
			}
		}
	}
}
class Consumer implements Runnable {
	private Info info = null;
	public Consumer(Info info){
		this.info = info;
	}
	public void run(){
		for(int i=0; i<20; i++){
			try{
				Thread.sleep(9);
			}catch (Exception e){}
			this.info.get();
		//	System.out.println( "name = "+info.getName() +" career = "+ info.getCareer());	
		}
	}
}
