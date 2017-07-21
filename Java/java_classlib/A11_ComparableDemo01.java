import java.util.*;
public class A11_ComparableDemo01{
	public static void main(String[] args){
		Student stu1 = new Student("Jeck",12,98);
		Student stu2 = new Student("Tom",11,98);
		Student stu3 = new Student("Lily",11,91);
		Student[] stu ={stu1,stu2,stu3};
		Arrays.sort(stu);
		for(Student s:stu)
			System.out.println(s.toString());
	}
}
class Student implements Comparable<Student>{
	private String name;
	private int age;
	private int score;
	public Student(String name,int age,int score){
		this.name = name;
		this.age = age;
		this.score = score;
	}
	public String toString(){
		return name+"\t\t"+ age+"\t\t "+this.score;
	}
	public int compareTo(Student stu){
		if(this.score>stu.score)
			return 1;
		else if(this.score<stu.score)
			return -1;
		else if(this.age<stu.age)
			return 1;
		else 
			return -1;
	}
	
}
