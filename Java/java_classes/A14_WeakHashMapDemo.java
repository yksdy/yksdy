import java.util.*;
public class A14_WeakHashMapDemo{
	public static void main(String[] args){
		Map<String,String> map = new WeakHashMap<String,String>();
		map.put("A","Apple");
		map.put(new String("D"),new String("Dog"));
		map.put(new String("B"),new String("Banana"));
		map.put(new String("C"),new String("Cat"));
		System.out.println(map);
		System.gc();
		map.put(new String("B"),new String("Banana"));
		System.out.println(map);
	}
}
