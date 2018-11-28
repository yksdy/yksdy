public class A02_Inheritance{
	public static void main(String[] args){
		Student stu = new Student();
		stu.fun();
	}
}
class Person{
	private void prin(){
		System.out.println("Person----->>print");
	}
	public void fun(){
		this.prin();
	}
}
class Student extends Person{
	public void prin(){
		System.out.println("Student----->>print");
	}
	public void fun(){
		this.prin();
	}
}