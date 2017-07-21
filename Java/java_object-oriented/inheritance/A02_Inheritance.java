public class A02_Inheritance{
	public static void main(String[] args){
		Apple a = new Apple();
		//a.rePri();
		a.reDef();
	}
}
class Fruit{
	private int color = 1;
	public Fruit(){
		System.out.println("I'm Fruit");
	}
	private void rePri(){
		
		System.out.println("I'm rePri color = "+this.color);
	}
	void reDef(){
		
		System.out.println("I'm reDef color = "+this.color);
	}
}
class Apple extends Fruit{
	public Apple(){
		System.out.println("I'm apple");
	}
}

