import java.util.List;
import java.util.ArrayList;
import java.util.Collection;

import java.util.*;
	
public class A01_ArrayListDemo {
	public static void main(String[] args) {
		List<String> list = null; //add
		list = new ArrayList<String>();
		list.add("Hello");
		list.add("ArrayList");
		list.add(0,"I'm first");
		System.out.println(list);

		Collection<String> collection = null;
		collection = new ArrayList<String>();
		collection.add("Hello");
		collection.add("I'm Collection");
		System.out.println(collection);

		list.addAll(collection); //addAll
		list.addAll(0,collection);
		System.out.println(list);

		list.remove(1); //remove
		System.out.println(list);

		for(int i=0;i<list.size();i++){  //size, get
			System.out.println(list.get(i));
		}
	//<<<---toArray()---->>
		//toArray()  
		//String[] str =(Stirng[])list.toArray(); //error
		//String[] str =list.toArray(new String[]); //error
		String[] str =list.toArray(new String[]{});
		for(int i=0;i<str.length;i++){
			System.out.println("String[] str =list.toArray(new String[]{}) : "+str[i]);
		}

		//toArray()
		Object[] obj = list.toArray();
		for(int i=0;i<obj.length;i++){
			System.out.println("(String)obj[i] : "+(String)obj[i]);
		}

		//isEmpty()
		System.out.println("list isEmpty(): "+list.isEmpty());
		//contains
		System.out.println("list contains(Hello):  "+list.contains("Hello")+"  list contains(aff): "+list.contains("aff"));
		//indexOf
		System.out.println("list indesOf(ArrayList); "+list.indexOf("ArrayList")+"  list indexOf(aff): "+list.indexOf("aff"));
		//subList
		List<String> ls= list.subList(2,4);
		System.out.println("ls subList(2,4): "+ ls);
		System.out.println("list subList(2,4): "+ list.subList(2,4));

//add		
//addAll
//remove
//size, get		
//toArray()
//toArray()
//isEmpty()
//contains
//indexOf
//subList

	}
}
