public class Test{
	public static void main(String[] args){
		Cat c = new Cat(2,4);
		paintTank(c);
	}
	public static void paintTank(Animal a){
		System.out.println("age="+a.age+" name= "+a.name);
		a.pri();
		a.fun();
	}
}
class Animal{
	private int age;
	int name;
	Animal(){	}
	Animal(int age, int name){
		this.age=3;
		this.name= 3;
	}
	public void pri(){
		System.out.println("I'm animal");
		}
	public void fun(){
		this.pri();
	}
}
class Cat extends Animal{
	Cat(int age, int name){
		this.age=age;
		this.name=name;
	}
	public void pri(){
		System.out.println("I'm cat");
		}
}

