import java.util.*;

public class B03_SetDemo01{
	public static void main(String[] args){
	//  HashSet TreeSet
	//  add
		Set<String> hs = new HashSet<String>();
		hs.add("AA");
		hs.add("WA");
		hs.add("fsB");
		hs.add("C");
		hs.add("D");
		hs.add("fseE");
		hs.add("C");
		System.out.println("HashSet: "+hs);

		Set<String> ts = new TreeSet<String>();
		ts.add("AA");
		ts.add("WA");
		ts.add("fsB");
		ts.add("C");
		ts.add("D");
		ts.add("fseE");
		ts.add("C");
		System.out.println("TreeSet: "+ts);
		
	}
}
