/**
TreeSet  排序原理
Set 接口中重复元素定义
**/
import java.util.*;
public class A05_TreeSetDemo{
	public static void main(String[] args){
		TreeSet<Person> ts = new TreeSet<Person>();
		ts.add(new Person(53,"Tom"));
		ts.add(new Person(43,"Jeck"));
		ts.add(new Person(43,"Jk"));
		ts.add(new Person(44,"Jeck"));
		ts.add(new Person(43,"Jeck"));
		ts.add(new Person(233,"Aim"));
		ts.add(new Person(63,"Lili"));
		System.out.println(ts);
	}
}
class Person implements Comparable<Person>{
	int age;
	String name;
	Person(int age, String name){
		this.age=age;
		this.name=name;
	}

	public int compareTo(Person per){
		if(this.age>per.age)
			return 1;
		else if(this.age<per.age)
			return -1;
		else
			return this.name.compareTo(per.name);// #####
	}
	public String toString(){
		return "age: "+this.age+";  name: "+this.name+"\n";
	}
}

