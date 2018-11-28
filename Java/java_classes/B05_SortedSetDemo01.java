import java.util.*;

public class B05_SortedSetDemo01{
	public static void main(String[] args){
	// HashSet TreeSet
	// add
	// first last headSet tailSet subSet
		SortedSet<String> ts = new TreeSet<String>();
		ts.add("AA");
		ts.add("A");
		ts.add("B");
		ts.add("C");
		ts.add("D");
		ts.add("E");
		ts.add("C");
		System.out.println(ts);
		System.out.println(ts.first());
		System.out.println(ts.last());
		System.out.println(ts.headSet("B"));
		System.out.println(ts.tailSet("B"));
		System.out.println(ts.subSet("C","E"));
		System.out.println(ts);
	}
}



