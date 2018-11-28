public class IntToString{
	public static void main(String[] args){
		int x=1534236469;
		System.out.println(-23%10);
		StringBuffer s = new StringBuffer(Integer.toString(x));
		StringBuffer s1 =new StringBuffer(x+"");
		StringBuffer s2 =new StringBuffer(String.valueOf(x));
		s.reverse();
		s1.reverse();
		s2.reverse();
		System.out.println(s);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(Integer.parseInt("234"));
		System.out.println(Integer.valueOf("456").intValue());
	}
}