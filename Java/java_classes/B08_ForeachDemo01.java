import java.util.*;

public class B08_ForeachDemo01{
	public static void main(String[] args){
		List<String> al = new ArrayList<String>();
		al.add("iterator");
		al.add("test-remove");
		al.add("demo");
		
		for(String str:al){
			System.out.println(str);
		}
	}
}