/**
Collection, Set  NO get() method
HasSet  	disorder
TreeSet 	order
**/

import java.util.*;
public class A04_HashSetDemo{
	public static void main(String[] args){
		//HashSet<String> hs = new HashSet<String>(); //ok 
		Set<String> hs= new HashSet<String>();
		hs.add("C");
		hs.add("B");
		hs.add("A");
		hs.add("D");
		hs.add("E");
		hs.add("F");
		System.out.println(hs);

		Set<Person> hsp = new HashSet<Person>();
		hsp.add(new Person(53,"Tom"));
		hsp.add(new Person(43,"Jeck"));
		hsp.add(new Person(43,"Jk"));
		hsp.add(new Person(44,"Jeck"));
		hsp.add(new Person(43,"Jeck"));
		hsp.add(new Person(233,"Aim"));
		hsp.add(new Person(63,"Lili"));
		System.out.println(hsp);		
	}
}
class Person {
	int age;
	String name;
	Person(int age, String name){
		this.age=age;
		this.name=name;
	}
	public boolean equals(Object obj){
		if(obj == this){
			return true;
		}
		if(!(obj instanceof Person)){
			return false;
		}
		Person pp = (Person)obj;
		if(pp.name.equals(this.name)&&(pp.age==this.age)){
			return true;
		}
		else {
			return false;
		}
	}
	public int hashCode(){
		//return this.name.hashCode()*this.age;
		return this.name.hashCode();
	}
	public String toString(){
		return "age: "+this.age+";  name: "+this.name+"\n";
	}
}

