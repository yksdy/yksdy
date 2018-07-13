/**
¼Ì³Ð²âÊÔ
**/

public class Test3{
	public static void main(String[] args){
		B b = new B();
		C c = new C();

		System.out.println("BBBBB--->xxxx: "+b.getX());
		System.out.println("CCCCC--->xxxx: "+c.getX());

		b.setX(10);
		
		System.out.println("b.setX(10);BBBBB--->xxxx: "+b.getX());
		System.out.println("CCCCC--->xxxx: "+c.getX());
	}
}
class A{
	private int x = 4;
	public int getX(){
		return x;
	}
	public void setX(int x){
		this.x=x;
	}
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
class C extends A{

}

