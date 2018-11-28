import java.util.*;
public class A01_QueueDemo{
	//http://tool.oschina.net/apidocs/apidoc?api=jdk-zh
	public static void main(String[] args){
		Queue<String> q = new LinkedList<String>();
		q.offer("hello");
		q.offer("meng");
		q.offer("nice");
		q.offer("day");
		q.offer("good");
		System.out.println(q);
		String s1 = q.element();
		String s2 = q.element();
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(q);
		String ss1 = q.peek();
		String ss2 = q.peek();
		System.out.println(ss1);
		System.out.println(ss2);
		System.out.println(q);
		String sss1 = q.remove();
		String sss2 = q.poll();
		System.out.println(sss1);
		System.out.println(sss2);
		System.out.println(q);
		
	}
}