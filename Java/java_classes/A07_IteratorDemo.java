
import java.util.*;
public class A07_IteratorDemo{
	public static void main(String[] args){
		List<String> list = new ArrayList<String>();
		list.add("Hello");
		list.add("-");
		list.add("Interator");
		Iterator<String> inter= list.iterator();
		//list,	ArrayList,	 hasNext,	next,	iterator,	remove, set,	add
		while(inter.hasNext()){
			String str = inter.next();
			if(str.equals("-")){
				inter.remove();
			}
			else
			{
				System.out.println(str);
			}			
		}
		System.out.println(list);
	}
}
