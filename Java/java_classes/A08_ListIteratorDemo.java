
import java.util.*;

public class A08_ListIteratorDemo{
	public static void main(String[] args){
		List<String> list = new ArrayList<String>();
		list.add("Hello");
		list.add("-");
		list.add("ListInterator");
		System.out.println(list);
		//List,	ArrayList,		listIterator,	hasNext,	next,	hasPrevious,	previous,	set,	add,	remove

		ListIterator<String> liter =list.listIterator();
		while(liter.hasNext()){
			String str = liter.next();
			if(str.equals("-")){
				liter.set("good");
				liter.add("Night");
			//	System.out.println(liter.previous());
			}
			else{
				System.out.println(str);
			}
		}
		while(liter.hasPrevious()){
			System.out.println(liter.previous());
		}
			
	}
}
