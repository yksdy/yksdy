public class A01_OverridAnnotationDemo1{
	public static void main(String[] args){



		new Student().priInfo();
	}
}
class Person {
	public void priInfo(){
		System.out.println("I'm person");
	}
}
class Student extends Person {
	@Override
	public void priInfo(){ //priInf
		System.out.println("I'm Student");
	}
}