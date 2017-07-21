public class A03_functional_character{
	
	public static void main(String[] args){
		Son s = new Son();
	}
}
class Father{
	private int a = 1;
	int b = 2;
	protected int c = 3;
	public int d =4;
}
class Son extends Father{
	public Son(){
	// System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	System.out.println(d);
	}
}