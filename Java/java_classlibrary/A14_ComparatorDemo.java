/**
public interface Comparator<T>{
	public int compare(T o1, To2);
	public boolean equals(Object o);
}
**/
import java.util.*;
public class A14_Comparatordemo{
	public static void main(String[] args){
		Student[] stu = {new Student("merry",12,34.3),new Student("hunrry",22,59.5),new Student("Andy",52,123.2),new Student("xiaoming",16,100)}
		Array.sort(stu);//
		for(Student s:stu){
			System.out.println(s);
		}
	}
}
class Student{
	private String name;
	private int age;
	private float score;
	Student(String name, int age, float score){
		this.name = name;
		this.age = age;
		this.score = score;
	}
	public String toString(){
		return "name = "+this.name+"age = "+ this.age+" score = "+this.score;
	}
}
