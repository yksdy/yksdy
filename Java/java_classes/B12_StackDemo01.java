import java.util.*;

public class B12_StackDemo01{
	public static void main(String[] args){
		// push pop
		Stack<String> s = new Stack<String>();
		s.push("a1");
		s.push("a2");
		s.push("a3");
		s.push("a4");
		s.push("a5");
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
	}
}