public class Demo1{
	public static vid main(String[] args){
		A a= new B();
		a.fun1();
		a.fun2();
	}
}
class A{
	public void fun1(){
		System.out.println("A-->fun1");
	}
	private void fun2(){
		System.out.println("A-->fun2");
	}
}
class B extends A{
	public void fun1(){
		System.out.println("B-->fun1");
	}
	public void fun3(){
		System.out.println("B---->fun3");
	}
}