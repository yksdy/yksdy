import java.util.*;

public class B07_ListIteratorDemo01{
	public static void main(String[] args){
		List<String> al = new ArrayList<String>();
		al.add("iterator");
		al.add("test-remove");
		al.add("demo");
		// iterator listIterator hasNext next hasPrevious previous
		ListIterator<String> iter = al.listIterator();
		System.out.println(al);
		while(iter.hasNext()){
			String str = iter.next();
			System.out.print(str+"  ");
			iter.set("Meng-"+str);
		}
		iter.add("Meng");
		System.out.println();
		while(iter.hasPrevious()){
			String str = iter.previous();
			System.out.print(str+"  ");
		}
	}
}