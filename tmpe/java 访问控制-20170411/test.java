// public
// proteced
// 
// private


public class test{
	public static void main(String[] args){
		Person per = new Person();
	}
}
class Person{
	String name;
	public void Person(){
		System.out.println("I'm new le");
	}
	public String getName(){
		return name;
	}
	public void putName(String name){
		this.name = name;
	}
}
class Bjj extends Person{
	
	public void pir(){
		System.out.println("hahaha wo shi£º "+name);
	}
}
class Mzy {
	public void pir(){
	//	System.out.println("hahaha wo shi£º "+getName());
	}
}