public class A03_InstanceDemo01{
	public static void main(String[] args){
		Class<?> c = null;
		try{
			c = Class.forName("Person");
		}catch(Exception e){
			e.printStackTrace();
		}
		Person per = null;
		try{
			per = (Person)c.newInstance();
		}catch(Exception e){
			e.printStackTrace();
		}
		per.setAge(28);
		per.setName("MXY");
		System.out.println(per);
	}
}
class Person{
	private String name;
	private int age;
	//public Person(){ } //if not this, will Error at java.lang.Class.getConstructor0(Unknown Source)
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
}