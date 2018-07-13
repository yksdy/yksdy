import java.util.*;
public class A17_StackDemo{
	public static void main(String[] args){
		// Stack push pop
		Stack<String> st= new Stack<String>();
		st.push("Apple");
		st.push("Banana");
		st.push("Cat");
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.pop());
		//System.out.println(st.pop());
	}
}
