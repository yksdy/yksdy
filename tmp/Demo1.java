public class Demo1{
	public static void main(String[] args){
		A a= new B();
		B b =(B)a;
		a.fun1();
	//	a.fun3();
		b.fun3();
		A c = new A();
		System.out.println("a instanceof A " + (a instanceof A));
		System.out.println("a instanceof B " + (a instanceof B));
		System.out.println("b instanceof A " + (b instanceof A));
		System.out.println("b instanceof B " + (b instanceof B));
		System.out.println("c instanceof B " + (c instanceof B));
	//	a.fun2();
	}
}
class C{
	
}
class A{
	private int a;
	public A(){
		System.out.println("A()");
		a=2;
		System.out.println("A()-->a = "+a);
	}
	public void fun1(){
		System.out.println("A-->fun1");
	}
	private void fun2(){
		System.out.println("A-->fun2");
	}
}
class B extends A{
	private int a;
	private int b;
	public B(){
		System.out.println("B()");
		a=3;
		b=4;
		System.out.println("A()-->a = "+a);
		System.out.println("B()-->b = "+b);
	}
	public void fun1(){
		System.out.println("B-->fun1");
		System.out.println("B()-->fung1 b = "+b);
	}
	public void fun3(){
		System.out.println("B---->fun3");
	}
}