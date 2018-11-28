import java.util.*;

public class B11_TreeMapDemo02 {
	public static void main(String[] args){
		// entrySet
		Map<String, String> tm = new TreeMap<String, String>();
		tm.put("Ameng","zhaoyang");
		tm.put("Cbai","jiaojiao");
		tm.put("Byi","ning");
		Set<Map.Entry<String, String>> allSet = tm.entrySet();
		Iterator<Map.Entry<String, String>> iter = allSet.iterator();
		while(iter.hasNext()){
			Map.Entry<String, String> me = iter.next();
			System.out.print(me.getKey()+" ,"+ me.getValue()+" ;  ");
		}
	}
}
