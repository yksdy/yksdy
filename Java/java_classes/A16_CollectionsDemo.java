import java.util.*;

public class A16_CollectionsDemo{
	public static void main(String[] args){
		//List<String> list = Collections.emptyList();
		Set<String> set = Collections.emptySet();
		//list.add("hello");
		List<String> list = new ArrayList<String>();
		Collections.addAll(list,"hello","Collections");
		//System.out.println(list);
		Iterator it = list.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		for(String str:list){
			System.out.println(str);
		}
		//add, addAll,		replaceAll,	reverse,	sort,		swap,	binarySearch
	}
}
