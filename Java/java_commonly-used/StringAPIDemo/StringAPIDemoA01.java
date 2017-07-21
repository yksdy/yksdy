
public class StringAPIDemoA01 {
	public static void main(String[] args){
		String str1 = new String("Meng zhao yang");
		System.out.println(str1);

		//char[] c = str1.toCharArray(3,7); error , no this method
		char[] c = str1.toCharArray();
		int i =0;
		for(char x:c){
			i++;
			System.out.println("x"+i+"= "+ x);
		}

		System.out.println(c);
		//System.out.println(c,3); error
		//System.out.println(c,3,7); error
		System.out.println(new String(c));
		//System.out.println(new String(c,3)); error
		System.out.println(new String(c,7,4));

		System.out.println(str1.charAt(3));

		byte[] b = str1.getBytes();
		System.out.println(b);
		System.out.println(new String(b));
		
	}
}
