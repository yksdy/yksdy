
public class ExtendsDemo {
	public static void main(String[] args){
		//new Person(3,"hehe");
		//new Son();
		new Son(25,"xiaoming");
		new Sons(5,"qqqqqqqq");
	}
}
class Person{
	//private int age;
	private String name;
	private int age;
	Person(int age,String name){
		this.age = age;
		this.name = name;
		System.out.println("Person age = "+ this.age);
		System.out.println("Person age = "+ this.name);
	}
	
	Person(){
	
		System.out.println("Person age = ");
		System.out.println("Person age = ");
	}
	public int getAge(){
		return age;
	}
	public void setAge(int age){
		this.age = age;
	}
	
}

class Son extends Person{

	public Son(int age,String name){
		setAge(111);
		System.out.println("Son age = "+getAge());
	
	}
	Son(){
		this();
		System.out.println("Son age = ");
		System.out.println("Son age = ");
	}
}
class Sons extends Son{

	public Sons(int age,String name){
		//super();
		setAge(123);
		System.out.println("Sons age = "+getAge());
	
	}
	public Sons(){
	
	}
	

}




