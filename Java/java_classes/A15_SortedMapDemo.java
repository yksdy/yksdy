import java.util.*;
public class A15_SortedMapDemo{
	public static void main(String[] args){
		SortedMap<String,String> map = new TreeMap<String,String>();
		map.put("B","Banana");
		map.put("C","Cups");
		map.put("D","Dog");
		map.put("E","Element");
		map.put("A","Apple");
		System.out.println(map);
		System.out.println("first key: "+map.firstKey()+" valus: "+map.get(map.firstKey()));
		for(Map.Entry<String,String> me :map.headMap("B").entrySet()){
			System.out.println("head: start to B key: "+me.getKey()+" valus: "+me.getValue());
		}
		for(Map.Entry<String,String> me :map.subMap("B","D").entrySet()){
			System.out.println("sub: B to D key: "+me.getKey()+" valus: "+me.getValue());
		}
		for(Map.Entry<String,String> me :map.tailMap("B").entrySet()){
			System.out.println("tail: B to last key: "+me.getKey()+" valus: "+me.getValue());
		}
		System.out.println("last key: "+map.lastKey()+" valus: "+map.get(map.lastKey()));
		
	}
}
