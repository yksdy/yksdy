public class A01_AbstractClassDemo{
	public static void main(String[] args){
		A a = new B();
		a.prin();
		InterA ia= new InterB();
		ia.p();
	}
}
abstract class A{
	public abstract void prin();
}
class B extends A{
	public void prin(){
		System.out.println("hi ,I'm abstract class A");
	}
}
interface  InterA{
	public abstract void p();
}
class InterB implements InterA{
	public void p(){
		System.out.println("hi, I'm interface A");
	}
}
