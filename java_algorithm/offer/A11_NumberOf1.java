/*
20170628
*/
import java.util.Scanner;
public class A11_NumberOf1 {
//public class Solution {
    public int NumberOf1(int n) {
		int x =0;
		int m =0;
		if(n>0){
			m=n;
		}else{
			m=Integer.MAX_VALUE+n+1;
		}
		while(m>0){
			x+=m%2;
			m=m/2;
		}
		if(n>=0){
			return x;
		}else{
			return x+1;
		}
		
    }
	public static void main(String[] args){
		A11_NumberOf1 num= new A11_NumberOf1();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		System.out.println(num.NumberOf1(n));
	}
}