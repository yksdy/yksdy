public class A03_StringToInt{
	public static void main(String[] args){
		String s = "123";
		int i = Integer.parseInt(s);
		System.out.println(i);
		String s1 = i+" ";
		String s2 = Integer.toString(i);
		String s3 = String.valueOf(i);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}
}