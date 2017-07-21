import java.util.*;
public class A02_ArrayListDemo01{
	public static void main(String[] args){
		List<String> list = new ArrayList<String>(); 
		list.add("Hello");
		list.add("  World");
		System.out.println(list);
		list.add("hahaha");
		list.add(0,"ohhhhh");
		for(String s:list)
			System.out.println(s);
		String[] str1 = list.toArray(new String[]{});
		for(String s:str1)
			System.out.println(s);
	}
	public static void bufferString(){
		StringBuffered sb = new StringBuffered();
		System.out.println("----Array List----");
	}
}
