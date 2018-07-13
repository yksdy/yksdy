import java.util.*;
public class A31_NumberOf1Between1AndN_Solution {
    public int NumberOf1Between1AndN_Solution(int n) {
		int ones = 0;
		for (long m = 1; m <= n; m *= 10){
			System.out.println((n/m + 8) / 10 * m );
			System.out.println(n/m % 10 == 1 ? n%m + 1 : 0);
			ones += (n/m + 8) / 10 * m + (n/m % 10 == 1 ? n%m + 1 : 0);
		}
		return ones;
    }
	public static void main(String[] args){
		A31_NumberOf1Between1AndN_Solution nb = new A31_NumberOf1Between1AndN_Solution();
		Scanner scan = new Scanner(System.in);
		int i = scan.nextInt();
		int x =nb.NumberOf1Between1AndN_Solution(i) ;
		System.out.println(x);
	}
}