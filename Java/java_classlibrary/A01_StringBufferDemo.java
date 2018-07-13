
/**
1/append()  #
2/insert(int, String) #
3/reverse() #
4/length() 
5/toString() 
6/replace(int, int, String)
7/String substring(int, int)
8/delete()
9/indexOf()
**/
public class A01_StringBufferDemo{
	public static void main(String[] args){
		StringBuffer buf = new StringBuffer();
		buf.append("abc");
		buf.append("\n append :").append(" mengzhaoyang ").append("hahah");
		//fun(buf);
		buf.insert(0,"123 ");
		buf.insert(buf.length(),"@end");
		String str = buf.reverse().toString();
		buf.replace(4,buf.length(),"replace");
		buf.delete(2,7);
		str = buf.substring(3,buf.length());
		System.out.println(buf);
		if(buf.indexOf("ace")!= -1 )
			System.out.println("yes, ace is exists, in "+ buf.indexOf("ace"));
		else
			System.out.println("no, ace is not exists");
		System.out.println("str = "+str);
	}
	public static void fun(StringBuffer s){
		s.append(" good").append(" what's worry!!");	
	}
}
