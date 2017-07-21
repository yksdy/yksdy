public class A01_PolymorphismDemo1{
	public static void main(String[] args){
		Person p = new Student();
	//	p.fun0();
		p.fun1();
		p.fun3();
	}
}
class Person{
	private void fun0(){
		System.out.println("Person: fun0 private");
	}
	public void fun1(){
		System.out.println("Person: fun1 public");
	}
	public void fun3(){
		System.out.println("Person: fun3 public");
	}
}
class Student extends Person{
	public void fun1(){
		System.out.println("Student: fun1 public");
	}
	public void fun2(){
		System.out.println("Student: fun2 public");
	}
	
}