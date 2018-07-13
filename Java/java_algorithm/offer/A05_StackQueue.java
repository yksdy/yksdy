/*

20170627
*/

import java.util.Stack;
public class A05_StackQueue { 
//public class Solution { 
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    
    public void push(int node) {
        stack1.push(node);
		System.out.println("push:"+node);
    }
    
    public int pop() {
		while(!stack1.empty()){
			System.out.println("pop stack1:");
			stack2.push(stack1.pop());
		}
		int i=0;
		if(!stack2.empty()){
			i=stack2.pop();
		}
		while(!stack2.empty()){
			
			System.out.println("pop stack2:");
			
			stack1.push(stack2.pop());
			
		}
		
		System.out.println("pop:"+i);
		return i;
    }
	public static void main(String[] args){
		A05_StackQueue sq = new A05_StackQueue();
		sq.push(1);
		sq.push(2);
		sq.push(3);
		System.out.println(sq.pop());
		System.out.println(sq.pop());
		System.out.println(sq.pop());
	}
}