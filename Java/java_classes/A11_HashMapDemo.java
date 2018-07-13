import java.util.*;
public class A11_HashMapDemo{
	public static void main(String[] args){
		// put,	get
		Map<String,String> map = new HashMap<String,String>();
		map.put("A","Apple");
		map.put("B","Banana");
		map.put("C","Cup");
		System.out.println(map.get("A"));
		System.out.println(map);
		//containsKey,	containsValue
		if(map.containsKey("A"))
			System.out.println("containsKey('A'): true");
		else
			System.out.println("containsKey('A'): false");
		if(map.containsValue("A"))
			System.out.println("containsValue('A'): true");
		else
			System.out.println("containsValue('A'): false");

		// keySet, iterator
		Set<String> s= map.keySet();
		Iterator i=s.iterator();
		while(i.hasNext())
			System.out.println(i.next());

		// values, iterator
		Collection<String> c= map.values();
		Iterator ci=c.iterator();
		while(ci.hasNext())
			System.out.println(ci.next());

// put,	get
//containsKey,	containsValue
//Set  keySet, iterator
// Collection  values, iterator
	}
}
