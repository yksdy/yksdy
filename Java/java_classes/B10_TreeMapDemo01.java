import java.util.*;

public class B10_TreeMapDemo01 {
	public static void main(String[] args){
		Map<String, String> tm = new TreeMap<String, String>();
		tm.put("Ameng","zhaoyang");
		tm.put("Cbai","jiaojiao");
		tm.put("Byi","ning");
		Set<String> keys = tm.keySet();
		Iterator<String> iter = keys.iterator();
		while(iter.hasNext()){
			System.out.print(tm.get(iter.next())+" , ");
		}
	}
}