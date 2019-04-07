import java.util.*;

public class B04_TreeSetDemo01{
	public static void main(String[] args){
	// HashSet TreeSet
	// add
	//	Set<Person> sp = new TreeSet<Person>();
		Set<Person> sp = new HashSet<Person>();
		sp.add(new Person("A",6));
		sp.add(new Person("B",6));
		sp.add(new Person("B",6));
		sp.add(new Person("C",7));
		sp.add(new Person("D",4));
		sp.add(new Person("A",12));
		sp.add(new Person("A",44));
		System.out.println(sp);
		
	}
}
class Person {
	int age;
	String name;
	public Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	public boolean equals(Object obj){
		if(this == obj){
			return true;
		}
		if(!(obj instanceof Person)){
			return false;
		}
		Person p = (Person)obj;
		if(this.name.equals(p.name) && this.age == p.age){
			return true;
		}else{
			return false;
		}
	}
	public int hashCode(){
		return this.name.hashCode()*this.age;
	}
	public String toString(){
		return "name: "+name+" ,age: "+age;
	}
	
}

/*
class Person implements Comparable<Person>{
	int age;
	String name;
	public Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	public String toString(){
		return "name: "+name+" ,age: "+age;
	}
	public int compareTo(Person p){
		if(this.age>p.age){
			return 1;
		}else if(this.age<p.age){
			return -1;
		}else{
			return this.name.compareTo(p.name);
		}
	}
}
*/
