import java.util.*;
public class A13_TreeMapDemo{
	public static void main(String[] args){
		Map<String,String> map = new TreeMap<String, String>();
		map.put("B","Banana");
		map.put("C","Cups");
		map.put("D","Dog");
		map.put("A","Apple");
		System.out.println(map);
		Set<String> s=map.keySet();
		Iterator<String> si=s.iterator();
		while(si.hasNext()){
			String str=si.next();
			System.out.println(" key: "+str+" value:"+map.get(str));
		}
	}
}
