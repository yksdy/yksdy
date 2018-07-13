/**
¼Ì³Ð²âÊÔ
**/

public class Test2{
	public static void main(String[] args){
		B b = new B();
		A a = b;
		a.fun1();
		a.fun2();
		B b2 =(B)a;
		b2.fun3();
		b2.fun1();
		b2.fun2();
	}
}
class A{
	public void fun1(){
		System.out.println("AAAA--->public void fun1111()");
	}
	public void fun2(){
		fun1();
	}
}
class B extends A{
	public void fun1(){
		System.out.println("BBB--->public void fun1111()");
	}
	public void fun3(){
		System.out.println("BBB--->public void fun3333()");
	}
}
