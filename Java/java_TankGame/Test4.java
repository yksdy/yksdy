
public class Test4{
	public static void main(String[] args){
		Son s = new Son(22,"xiaoming");
		Per(s);
	}
	public static void Per(Person p){
		System.out.println("Per--> "+p);
	}
}
class Person {
	int age;
	String name;
	public String toString(){
		return "Person age: "+age+" name: "+name;
	}
}
class Son extends Person{
	Son(int age, String name){
		this.age= age;
		this.name= name;
	}
	public String toString(){
		return "Son age: "+age+" name: "+name;
	}
}
