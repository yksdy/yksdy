public class PolymorphicDemo {
	public static void main(String[] args){
		/*
		B b = new B(); 
		A a = b;
		a.fun1();
		System.out.println("x =  "+a.x);
		*/
		//A a = new B(); //new A();
		B bb = new B(); 
		System.out.println("B bb = new B(); = B "+(bb instanceof B));
		System.out.println("x =  "+bb.x);
		A a = bb;
		System.out.println("A a = bb; = B "+(a instanceof B));
		System.out.println("x =  "+a.x);
		B b = (B)a;
		System.out.println("B b = (B)a; = B "+(a instanceof B));
		b.fun1();
		b.fun2();
		System.out.println("x =  "+b.x);		
		System.out.println("y =  "+b.y);
		
	}
}
class A{
	int x =2;
	A(){
		x =5;
	}
	public void fun1(){
		System.out.println("A----fun1");
	}
}
class B extends A{
	int y =6;
	B(){
		x =4;
	}
	public void fun1(){
		System.out.println("B----fun1");
	}
	public void fun2(){
		System.out.println("B----fun2");
	}
}

