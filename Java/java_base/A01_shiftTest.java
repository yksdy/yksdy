public class A01_shiftTest{
	public static void main(String[] args){
		int a = 128;
		int b = -1073741824;
		System.out.println(a>>2);
		System.out.println(a<<2);
		System.out.println(b);
		System.out.println(b>>2);
		System.out.println(b<<1);
		System.out.println(b<<2);
		System.out.println(b<<3);
	}
}