public class A01_Inheritance{
	public static void main(String[] args){
		Apple a = new Apple();
		//a.prin();
		//System.out.println(a.setX());
		//a.pl();
		Fruit f = a;
		f.prin();
		//f.pl();
		//System.out.println(f.setX());
		System.out.println(f.setY());
		Apple aa = (Apple)f;
		//aa.pl();
		//aa.prin();
		//System.out.println(aa.setX());
		System.out.println(aa == a);
	}
}
class Fruit{
	public int color = 1;
	protected int z = 2;
	int x = 3;
	private int y = 4;
	public int setColor(){
		return color;
	}
	protected int setZ(){
		return z;
	}
	private int setX(){
		return x;
	}
	int setY(){
		return y;
	}
	public Fruit(){
		System.out.println("I'm fruit");
	}
	public void prin(){
		System.out.println(setColor() );
		System.out.println(setX());
		System.out.println(setZ());
		System.out.println(setY());
	}
}
class Apple extends Fruit{
	public Apple(){
		System.out.println("I'm apple");
	//	System.out.println(setColor() );
	//	System.out.println(setZ());
	//	System.out.println(setY());
	}
	public void pl(){
		System.out.println(setColor() );
		//System.out.println(setX());
		System.out.println(setZ());
		System.out.println(setY());
	}
}
