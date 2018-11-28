import java.util.*;

public class B09_HashMapDemo01{
	public static void main(String[] args){
		// Map HashMap Hashtable WeakHashMap
		// TreeMap Comparable compareTo
		// put get containsKey containsVale keySet values putAll
		Map<String,String> map = new HashMap<String,String>();
		map.put("meng","zhaoyang");
		map.put("yi","ning");
		map.put("bai","jiaojiao");
		System.out.println(map.get("meng"));
		if(map.containsKey("meng")){
			System.out.println("yse ,containsKey");
		}
		if(map.containsValue("jiaojiao")){
			System.out.println("yse ,containsValue");
		}

		Set<String> keys = map.keySet();
		Iterator<String> iter = keys.iterator();
		while(iter.hasNext()){
			String str = iter.next();
			System.out.print(str+" ");
		}

		Collection<String> values = map.values();
		Iterator<String> iter1 = values.iterator();
		while(iter1.hasNext()){
			String str= iter1.next();
			System.out.print(str+" ");
		}
	}
}