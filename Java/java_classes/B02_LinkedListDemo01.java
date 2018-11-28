import java.util.*;

public class B02_LinkedListDemo01{
	public static void main(String[] args){
		// offer/add peek/element poll/remove 
		LinkedList<String> link = new LinkedList<String>();
		link.add("A");
		link.add("B");
		link.add("C");
		System.out.println(link);
		link.offer("D");
		link.offer("E");
		link.offer("F");
		System.out.println(link);
		System.out.println("link.element(): "+link.element());
		System.out.println(link);
		System.out.println("link.peek(): "+link.peek());
		System.out.println(link);
		System.out.println("link.poll(): "+link.poll());
		System.out.println(link);
		System.out.println("link.remove(2): "+link.remove(2));
		System.out.println(link);
	}
}
