import java.util.*;
public class queueDemo{
	public static void main(String[] args){
		Queue<String> queue= new LinkedList<String>();
		queue.offer("haha");
		queue.offer("hello");
		queue.offer("���");
		for(String q : queue){
            System.out.println(q);
        }
        System.out.println("===");
		
        System.out.println("poll="+queue.poll()); //���ص�һ��Ԫ�أ����ڶ�����ɾ��
        for(String q : queue){
            System.out.println(q);
        }
        System.out.println("===");
        System.out.println("element="+queue.element()); //���ص�һ��Ԫ�� 
        for(String q : queue){
            System.out.println(q);
        }
        System.out.println("===");
        System.out.println("peek="+queue.peek()); //���ص�һ��Ԫ�� 
        for(String q : queue){
            System.out.println(q);
        }
	}
}