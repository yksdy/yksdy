package java_object_Oriented.inheritance;
public class A02_SuperDemo{
	public static void main(String[]args){
	//	Student stu = new Student("meng",27,"NWPU");
	//	System.out.println(stu.info());
	    Student stu = new Student("meng",27,"NWPU");
		System.out.println(stu instanceof Student);
		System.out.println(stu instanceof Person);
	}
	
}
class Person{
	private String name;
	private int age;
	public Person(String name, int age){
		System.out.println("Person: I'mPerson");
		this.name=name;
		this.age=age;
	}
	public void setName(String name){
		System.out.println("Person: setName");
		this.name=name;
	}
	public void setAge(int age){
		System.out.println("Person: setAge");
		this.age=age;
	}
	public String getName(){
		System.out.println("Person: getName");
		return this.name;
	}
	public int getAge(){
		System.out.println("Person: getAge");
		return this.age;
	}
	public String info(){
		return ("Person: info name = "+this.getName()+" age = "+this.getAge());
	}
}
class Student extends Person{

	
	public Student(String name, int age, String school ){
		super(name,age);
		System.out.println("Student: I'm Student");
		this.school=school;
	}
	public String info(){
		return ("Student: info school = "+this.getSchool()+super.getName());
	}
	private String school;
	public void setSchool(){
		System.out.println("Student: setSchool");
		this.school=school;
	}
	public String getSchool(){
		System.out.println("Student: getSchool");
		return this.school;
	}
	/*
	public void setName(String name){
		System.out.println("Student: setName");
		this.name=name;
	}
	public void setAge(int age){
		System.out.println("Student: setAge");
		this.age=age;
	}
	public String getName(){
		System.out.println("Student: getName");
		return this.name;
	}
	public int getAge(){
		System.out.println("Student: getAge");
		return this.age;
	}
	*/
}