import java.util.*;
public class A03_BacktrackingDemo{
	public static void main(String[] args){
		Solution s = new Solution();
		List<Integer> ll = s.grayCode(1);
		for(int i=0;i<ll.size();i++){
			System.out.println("ll.size()= "+ll.size()+" "+ll.get(i));
		}
	}
}
class Solution {
	public static boolean flag = true;
	List<Integer> l = new ArrayList<Integer>();
	int val;
	public List<Integer> grayCode(int n) 
		{
	/*
		boolean flag1 = true;
		
		for(int i=0;i<2;i++){
			if(n>1) {
				if(flag1){
					grayItem(n-1);
					flag1 = false;
				}
				else{
				 	(int)Math.pow(2,n-1)+grayItem(n-1);
					System.out.println("val111==  "+val);
					System.out.println("Math.pow(2,n-1)==  "+Math.pow(2,n-1));
				}
			}
			else{
				if(flag1){
					val=0;
					flag1 = false;
				}
				else{
					val=1;
				}
			}
			System.out.println("val==  "+val);
			l.add(val);
		}	
	*/
		int a = grayItem(n);
		return l;


	
	}
		
	
	public int grayItem(int n){
		int x=0;
		for(int i=0;i<2;i++){
			if(n>1) {
				if(flag){
					x=0*((int)Math.pow(2,n-1))+grayItem(n-1);
					flag = false;
				}
				else{
				 	x=1*((int)Math.pow(2,n-1))+grayItem(n-1);
				}
			}
			else{
				if(flag){
					x=0;
					flag = false;
				}
				else{
					x=1;
				}
			}			
			System.out.println("grayItem x="+ x);
			l.add(x);
			
		}
		return x;
	}
}

