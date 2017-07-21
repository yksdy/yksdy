package java_commonly_used.StringAPIDemo;
//public char[] toCharArray()
//public String(char[])
//public String(char[], int, int)
public class StringAPIDemo12 {
	public static void main(String[] arg){
		String str = "mengzhaoyang";
		char[] c_array = str.toCharArray();
		for(char c:c_array ){
			System.out.println( c);
		}	
		String str1 = new String(c_array);
		String str2 = new String(c_array, 0,4);
		System.out.println( str1);
		System.out.println( str2);
	}
}
