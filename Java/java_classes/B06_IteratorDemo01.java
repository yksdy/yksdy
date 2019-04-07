import java.util.*;

public class B06_IteratorDemo01{
	public static void main(String[] args){
		// iterator hasNext next remove 
		List<String> al = new ArrayList<String>();
		al.add("iterator");
		al.add("test-remove");
		al.add("demo");
		
		Iterator<String> iter = al.iterator();
		System.out.println(al);
		while(iter.hasNext()){
			String str = iter.next();
			if("test-remove".equals(str)){
			//	iter.remove();
				al.remove(str); 
			}else{
				System.out.println(str);
			}
			
		}
		System.out.println(al);
	}
}