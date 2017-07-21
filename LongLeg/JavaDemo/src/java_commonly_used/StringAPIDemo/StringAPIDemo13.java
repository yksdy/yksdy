package java_commonly_used.StringAPIDemo;
//public byte[] getBytes()
//public String(byte[])
//public String(byte[],int, int)
public class StringAPIDemo13 {
	public static void main(String[] arg){
		String str = "mengzhaoyang";
		byte[] b = str.getBytes();
		System.out.println(new String(b));
		System.out.println(new String(b,4,6));
	}
}
