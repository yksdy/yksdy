public class A06_TestSuper{
	public static void main(String[] args){
		Meng m = new Meng(new Info());
		m.info.haha();
	}
	
}
class Info{
	private String name;
	public void haha(){
		try{
			super.wait();
		}catch(Exception e){
			System.out.println("haha ");
			e.printStackTrace();
		}
		
	}
}
class Meng implements Runnable{
	public Info info = null;
	public Meng(Info info){
		this.info = info;
	}
	public void fun(){
		System.out.println("I'm fun,just fun");
	}
	public void run(){
		
	}
}