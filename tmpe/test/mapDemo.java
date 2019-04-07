import java.util.*;
public class mapDemo{
	public static void main(String[] args){
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("abcd",1);
		map.put("homa",2);
		map.put("hobe",3);
		map.put("homd",4);
		map.put("home",5);
		System.out.println(map.get("abcd"));
		Set<String> key = map.getKeys();
		System.out.println(key);
	
	}
}