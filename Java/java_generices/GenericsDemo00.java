//package java_generics;
public class GenericsDemo00{
	public static void main(String[] args){
		
		Point<String> p1 = new Point<String>(new String("Meng ZhaoYang"), new String("Engineer"));
		System.out.println("X = "+p1.getX() + " Y = " +p1.getY());
		
		Point<Integer> p2 = new Point<Integer>(new Integer(12), new Integer(22));
		System.out.println("X = "+p2.getX() + " Y = " +p2.getY());
		
		Point<Character> p3 = new Point<Character>('M', 'z');
		System.out.println("X = "+p3.getX() + " Y = " +p3.getY());
		
	//	Point<int> p4 = new Point<int>(12, 22);
	//	System.out.println("X = "+p4.getX() + " Y = " +p4.getY());
		
		Point<String> p5 = new Point<String>("Meng ZhaoYang", "Engineer");
		System.out.println("X = "+p5.getX() + " Y = " +p5.getY());
		
		Point<Integer> p6 = new Point<Integer>(12, 22);
		System.out.println("X = "+p6.getX() + " Y = " +p6.getY());

	//	Point<char> p4 = new Point<char>('M', 'z');
	//	System.out.println("X = "+p4.getX() + " Y = " +p4.getY());
	
	}
}
class Point<T>{
	private T x;
	private T y;
	public Point(T x, T y){
		this.x = x;
		this.y = y;
	}
	public void setX(T x){
		this.x = x;
	}
	public void setY(T y){
		this.y = y;
	}
	public T getX(){
		return this.x;
	}
	public T getY(){
		return this.y;
	}
}
