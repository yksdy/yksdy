import java.util.*;
public class A01_MapDemo{
	public static void main(String[] args){
		Map<String,Integer> map = new HashMap<String,Integer>();
		//-------------put get---------------------------
		map.put("heo",1);
		map.put("abc",1);
		map.put("hec",2);
		map.put("hbc",3);
		System.out.println(map);
		System.out.println(map.get("heo"));
		//--------------containsKey containsValue---------------------------------
		if(map.containsKey("hec")){
			System.out.println("yes contains key");
		}else{
			System.out.println("no, not contains key word");
		}
		if(map.containsValue(5)){
			System.out.println("yes contains value");
		}else{
			System.out.println("no, not contains key value");
		}
		//---------------keySet values-----------------------------
		Set<String> keys = map.keySet();
		Iterator<String> iter = keys.iterator();
		while(iter.hasNext()){
			String str = iter.next();
			System.out.print(str+"  ");
		}
		Collection<Integer> value = map.values();
		Iterator<Integer> iter1 = value.iterator();
		while(iter1.hasNext()){
			int i = iter1.next();
			System.out.print(i+"   ");
		}
	}	
}





