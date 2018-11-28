import java.util.*;
public class queueDemo{
	public static void main(String[] args){
		Queue<String> queue= new LinkedList<String>();
		queue.offer("haha");
		queue.offer("hello");
		queue.offer("你好");
		for(String q : queue){
            System.out.println(q);
        }
        System.out.println("===");
		
        System.out.println("poll="+queue.poll()); //返回第一个元素，并在队列中删除
        for(String q : queue){
            System.out.println(q);
        }
        System.out.println("===");
        System.out.println("element="+queue.element()); //返回第一个元素 
        for(String q : queue){
            System.out.println(q);
        }
        System.out.println("===");
        System.out.println("peek="+queue.peek()); //返回第一个元素 
        for(String q : queue){
            System.out.println(q);
        }
	}
}