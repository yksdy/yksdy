package java_commonly_used.StringAPIDemo;
//public int length()
public class StringAPIDemo10 {
	public static void main(String[] arg){
		String str = "MengZhaoYang";
		if(str.equals("mengzhaoyang")){
			System.out.println("if equals mengzhaoyang == MengZhaoYang");
		}
		else
		{
			System.out.println("if equals mengzhaoyang != MengZhaoYang");
		}
		if(str.equalsIgnoreCase("mengzhaoyang")){
			System.out.println("if equalsIgnoreCase mengzhaoyang == MengZhaoYang");
		}
	}
}
