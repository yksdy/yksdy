package java_object_Oriented.encapsulation;
public class A01_Singeton{
	public static void main(String[] args){
		Singeton s = Singeton.getInstance();
		s.prin("hahaha");
	}
}
class Singeton{
	private static Singeton instance = new Singeton();
	public static Singeton getInstance(){
		return instance;
	}
	private Singeton(){
	}
	public void prin(String s){
		System.out.println(s);
	}
		
}
