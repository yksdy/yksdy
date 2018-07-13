/**
Queue
1/ offer
2/ remove
3/ element
    peek
    poll
LinkedList extends List<E>, Queue<E>
1/ addFirst
    addLast
    offer
2/ removeFirst
    removeLast
**/
import java.util.*;
public class A03_LinkedListDemo{
	public static void main(String[] args){
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("e");
		ll.add("d");
		ll.add("X");
		ll.add("Y");
	//	ll.add('d'); error
		ll.addFirst("Link");
		ll.addLast("List");
		System.out.println(ll);

		//’“±ÌÕ∑element(), peek, poll()
		//element
		System.out.println("element: "+ll.element());
		System.out.println("after element ll: "+ll);
		//peek
		System.out.println("peek: "+ll.peek());
		System.out.println("after peed ll: "+ll);
		//poll
		//System.out.println("poll: "+ll.poll());
		//System.out.println("after poll ll: "+ll);

		//FIFO
		System.out.println("\n\n\n FIFO\n ");
		//for(int i=0;i<ll.size();i++){ //error
		for(int i=0;i<ll.size();){ //ok
			System.out.println("ll.size() "+ll.size()+" ; "+" : "+ll.poll());
			System.out.println("after poll ll: "+ll);
		}
	}
}

