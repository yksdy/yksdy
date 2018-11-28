public class test{
	public static void main(String[] args){
		System.out.println(0%2);
		String str = "abcde";
		char[] c = str.toCharArray();
		for(char a:c){
			System.out.println(a);
		}
		System.out.println(new String(c));
	}
}