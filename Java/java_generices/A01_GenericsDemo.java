public class A01_GenericsDemo{
	public static void main(String[] args){
		Info<Integer> info = new Info<Integer>(34,90);
		info.pri();
	}
	public static void fun(Info<?> x){}
}
class Info<T>{
	T a;
	T b;
	Info(T a, T b){
		this.a = a;
		this.b = b;
	}
	public void pri(){
		System.out.println(a);
		System.out.println(b);
	}
}
