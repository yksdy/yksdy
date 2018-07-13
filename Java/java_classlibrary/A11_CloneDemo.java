/**
实现Cloneable 接口的对象才可以被克隆

protected Object clone() throws CloneNotSupportedException

public Object clone() throws CloneNotSupportedException
**/
public class A11_CloneDemo {
	public static void main(String[] args) throws Exception{
		Person p1 = new Person("zhangsan");
		Person p2 = (Person)p1.clone();
		System.out.println("p1= "+p1+"\np2= "+p2);
		p2.setName("lisi");
		System.out.println(" after clone p1= "+p1.name+"\np2= "+p2.name);
	}
}
class Person implements Cloneable{
	String name;
	Person(String name){
		this.name = name;
	}
	public void setName(String name){
		this.name = name;
	}
	//public
	protected	Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
}

