import java.util.*;

public class B01_ArrayListDemo01{
	public static void main(String[] args){
		// add addAll get set remove toArray contains isEmpty subList  indexOf size iterator listIterator
		List<String> all = new ArrayList<String>();
		all.add("ArrayList Hello");
		all.add("World ArrayList");
		System.out.println(all);
		Collection<String> ac = new ArrayList<String>();
		ac.add("Collection Hello");
		ac.add("World Collection");
		System.out.println(ac);

		all.addAll(ac);
		System.out.println(all);
		all.addAll(0,ac);
		System.out.println(all);

		all.remove(0);
		System.out.println(all);
		all.remove("World Collection");
		System.out.println(all);

		for(int i=0;i<all.size();i++){
			System.out.print(all.get(i)+", ");
		}
		System.out.println();
		for(int i=all.size()-1;i>=0;i--){
			System.out.print(all.get(i)+", ");
		}
		System.out.println();

		String[] str = all.toArray(new String[]{});
		for(String s :str){
			System.out.print(s+" ;  ");
		}
		System.out.println();

		// to Array
		Object[] obj = all.toArray();
		for(String s :str){
			System.out.print(s+" -  ");
		}
		System.out.println();
		
		// contains
		System.out.println(all.contains("meng") ? "all contains meng" : "all is not contains meng");

		// sublist
		System.out.println(all.subList(2,3));
		// indexOf
		System.out.println(all.indexOf("Collection Hello"));
		// isEmpty
		System.out.println(all.isEmpty());

		//---------------------------------------
		System.out.prpintln("---------------------------------");

		
	}
}
