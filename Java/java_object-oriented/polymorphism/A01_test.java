public class A01_test{
	public static void main(String[] args){
		A a = new B();
		a.fun2();
		B b = (B)a;
		b.fun1();
		b.fun3();
	}
}
class A{
	private void fun1(){
		System.out.println("---A---fun1");
	}
	public void fun2(){
		fun1();
		System.out.println("---A---fun2");
	}
}
class B extends A{
	public void fun1(){
		System.out.println("---B---fun1");
	}
	public void fun3(){
		System.out.println("---B---fun3");
	}
}