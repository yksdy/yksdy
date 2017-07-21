
public class StringAPIDemoB01_RAM {
	public static void main(String[] args){
		String str1  = "hello";
		String str2  = "hello";
		String str3  = new String("hello");
		String str4  = new String("hello");
		String str5  = new String("abc");

		System.out.println(str1 == str2);
		System.out.println(str3 == str2);
		System.out.println(str3.equals(str2));
		System.out.println(str3 == str4);
		System.out.println(str5 == str2);
	}
}
