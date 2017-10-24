import java.util.*;
public class A47_Sum_Solution {
    public int Sum_Solution(int n) {
        if(n==0){
			return 0;
		}
		return n+Sum_Solution(n-1);
    }
	public static void main(String[] args){
		A47_Sum_Solution ss = new A47_Sum_Solution();
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		System.out.println(ss.Sum_Solution(x));
	}
}