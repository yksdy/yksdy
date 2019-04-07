
public class DuotaiTest{
	public static void main(String[] args){
	     B b1 = new B();
		System.out.println("========");
		B b2 = new B(2);
	}
}

class A{
	public A(){
		System.out.println("A====");
		prin();	
}
	public void prin(){
		System.out.println("======println AAA===");
	}
}
class B extends A{
	public B(){
//		super();
System.out.println("B()");
	}
	public B(int i){
		System.out.println("B=="+i);
	}
	public void prin(){
		System.out.println("===println BBB===");
	}
}


