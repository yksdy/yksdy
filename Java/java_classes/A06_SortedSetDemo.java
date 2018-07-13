
import java.util.*;

public class A06_SortedSetDemo{
	public static void main(String[] args){
		SortedSet<String> ss= new TreeSet<String>();
		//SortedSet ss= new SortedSet(); // error  SortedSet is abstract class
		ss.add("C");
		ss.add("B");
		ss.add("A");
		ss.add("D");
		ss.add("E");
		ss.add("F");
		System.out.println(ss);
		System.out.println("first "+ss.first());
		System.out.println("start to headSet() "+ss.headSet("D"));
		System.out.println("sub "+ss.subSet("B","E"));
		System.out.println("tailSet() to last "+ss.tailSet("C"));
		System.out.println("last "+ss.last());
		
	}
}
