/**
public interface Comparable<T> {
	public int compareTo(T O){}
}
Arrays.sort(T[])
Arrays.sort(T[], Comparator)
**/
import java.util.*;
public class A13_ComparableDemo{
	public static void main(String[] args){
		Student[] stu = {new Student("Able",14,30.3f),new Student("Sun",11,12.3f),new Student("Invi",44,193.4f), new Student("Key",33,30.3f)};
		for(Student s: stu){
			System.out.println(s.toString());
		}
		Arrays.sort(stu);
		for(Student s: stu){
			System.out.println("sort Comparable"+s.toString());
		}
	}
}
class Student implements Comparable<Student> {
	private String name;
	private int age;
	private float score;
	Student(String name, int age, float score){
		this.name = name;
		this.age = age;
		this.score =score;
	}
	public String toString(){
		return this.name+"\t\t"+this.age+"\t"+this.score;
	}
	public int compareTo(Student s){
		if(this.score> s.score){
			return 1;
		}
		else if(this.score< s.score){
			return -1;
		}
		else if(this.age< s.age){
			return 1;
		}
		else if(this.age> s.age){
			return -1;
		}
		else{
			return 0;
		}
	}
}
