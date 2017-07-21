/*
20170628
*/
import java.util.Scanner;
public class A07_Fibonacci {
//public class Solution {
    public int Fibonacci(int n) {
		if(n==1){
			return 0;
		}
		if(n==2){
			return 1;
		}
		return Fibonacci(n-1)+Fibonacci(n-2);
    }
	public static void main(String[] args){
		A07_Fibonacci f = new A07_Fibonacci();
		Scanner scan = new Scanner(System.in);
		int a=scan.nextInt();
		System.out.println(f.Fibonacci(a));
	}
}