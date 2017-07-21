import java.lang.reflect.*;
public class A05_InstanceDemo01{
	public static void main(String[] args){
		Class<?> c = null;
		try{
			c = Class.forName("Person");
		}catch(Exception e){
			e.printStackTrace();
		}
		try{
			Method met = c.getMethod("hello");
			met.invoke(c.newInstance());
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
class Person{
	private String name;
	private int age;
	public Person(){ } //if not this, will Error at java.lang.Class.getConstructor0(Unknown Source)
	public Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	public String getName(){
		return this.name;
	}
	public void setName(String name){
		this.name = name;
	}
	public int getAge(){
		return this.age;
	}
	public void setAge(int age){
		this.age = age;
	}
	public String toString(){
		return "name = "+this.name+"; age = "+this.age;
	}
	public void hello(){
		System.out.println("Hello everyone , I'm reflect");
	}
}