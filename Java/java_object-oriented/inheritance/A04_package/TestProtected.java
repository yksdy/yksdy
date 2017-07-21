package mzy.test;
import mzy.father.Father;
public class TestProtected{
	public static void main(String[] args){
		Son s = new Son();
	}
}
class Son extends Father{
	public Son(){
	// System.out.println(a);
	// System.out.println(b);
	System.out.println(c);
	System.out.println(d);
	}
}