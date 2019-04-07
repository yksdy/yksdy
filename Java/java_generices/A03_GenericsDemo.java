
public class A03_GenericsDemo{
	public static void main(String[] args){
		Point<String> p1 = new Point<String>(new String("Meng ZhaoYang"), new String("Engineer"));
	//	Point<?> p1 = new Point<String>(new String("Meng ZhaoYang"), new String("Engineer")); //error ,  but  this + 33 is ok
		System.out.println("X = "+p1.getX() + " Y = " +p1.getY());	
		Point<Object> p2 = null;
		p2 = p1;  //error
		fun(p1);
	}
//	public static void fun(Point<Object> p){  //11 error
//		System.out.println("Point = "+p);
//	}

//	public static void fun(Point p){ //22
//		System.out.println("Point = "+p);
//	}

//	public static void fun(Point<?> p){  //33
//		System.out.println("Point = "+p);
//	}
	public static void fun(Point<String> p){  //44
		System.out.println("Point = "+p);
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

