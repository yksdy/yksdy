
import java.util.*;

public class A10_EnumerationDemo{
	public static void main(String[] args){
		Vector<String> list = new Vector<String>();
		list.add("Hello");
		list.add("-");
		list.add("Enumeration");
		// List,	vector,	elements,	hasMoreElements,	nextElement
		Enumeration<String> enu = list.elements();
		while(enu.hasMoreElements()){
			System.out.println(enu.nextElement());
		}
	}
}
