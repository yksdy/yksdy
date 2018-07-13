
import java.util.*;

public class A09_ForeachDemo{
	public static void main(String[] args){
		List<String> list = new ArrayList<String>();
		list.add("Hello");
		list.add("-");
		list.add("Foreach");
		for(String str:list){
		System.out.println(str);
		}
	}
}
