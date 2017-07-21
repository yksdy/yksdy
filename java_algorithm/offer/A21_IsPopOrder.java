import java.util.ArrayList;
import java.util.Stack;
/*
20170706
1-->public Stack()´´½¨Ò»¸ö¿Õ¶ÑÕ»
2-->public boolean empty()²âÊÔ¶ÑÕ»ÊÇ·ñÎª¿Õ;
3-->public E pop()ÒÆ³ý¶ÑÕ»¶¥²¿µÄ¶ÔÏó£¬²¢×÷Îª´Ëº¯ÊýµÄÖµ·µ»Ø¸Ã¶ÔÏó¡£ 
4-->public E push(E item)°ÑÏîÑ¹Èë¶ÑÕ»¶¥²¿
5-->public E peek()²é¿´¶ÑÕ»¶¥²¿µÄ¶ÔÏó£¬µ«²»´Ó¶ÑÕ»ÖÐÒÆ³ýËü¡£ 
6-->public boolean empty()²âÊÔ¶ÑÕ»ÊÇ·ñÎª¿Õ
*/
public class A21_IsPopOrder {
    public boolean IsPopOrder(int [] pushA,int [] popA) {
		for(int x:pushA){
			System.out.print(x+" ");
			}
		System.out.println();
		for(int x:popA){
			System.out.print(x+" ");
			}
		System.out.println();
      Stack<Integer> s = new Stack<Integer>();
	  int l = pushA.length;
	  if(l==0){
	  	return true;
	  }
	  int i=1;
	  int j=0;
	  s.push(pushA[0]);
	  while(i<pushA.length||j<popA.length){
	  	if(i<(pushA.length)&&j<(popA.length)){
	  	System.out.println("i= "+i+" pushA[i]= "+pushA[i]+" j= "+j+" popA[j]="+popA[j]);
	  		}
	//	System.out.println(" popA[j]= "+popA[j]);
	//	System.out.println("s.peek()= "+s.peek()+" popA[j]= "+popA[j]);
			if(s.peek()==popA[j]){
				
				s.pop();
				++j;
			}
			else if(i<pushA.length){
				System.out.println("i= "+i+" pushA[i]= "+pushA[i]);
				s.push(pushA[i]);
				++i;
			}else {
			return false;
			}
			

	  }
	  if(s.empty()){
	  	return true;
	  	}else{
	  	return false;
	  		}
	  
    }
	public static void main(String[] args){
		A21_IsPopOrder po = new A21_IsPopOrder();
		int[] a={1,2,3,4,5};
		int[] b1={4,5,3,2,1};
		int[] b2={4,3,2,5,1};
		int[] b3={4,3,5,2,1};
		int[] c={4,3,5,1,2};
		System.out.println(po.IsPopOrder(a,b1));
		System.out.println(po.IsPopOrder(a,b2));
		System.out.println(po.IsPopOrder(a,b3));
		System.out.println(po.IsPopOrder(a,c));
	}
}