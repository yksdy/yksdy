import java.util.Scanner;

public class abcd{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] word1 = new int[a];
		for(int i = 0; i < a; i++){
                word1[i] = sc.nextInt();
        }
		int b = sc.nextInt();
        int[] word2 = new int[b];
		for(int i = 0; i < b; i++){
                word2[i] = sc.nextInt();
        }
		
		System.out.print(minDifference(word1,word2));
    }
	
	public static int minDifference(int[] word1, int[] word2) {
        int m = word1.length;
        int n = word2.length;
        int[] dp = new int[n-m+1];
		for(int i=0;i<dp.length;i++){
			for(int j=0;j<m;j++){
				dp[i]=dp[i]+mypow(word1[j],word2[j+i]);
			}
		}
		int sum=dp[0];
		for(int i=1;i<dp.length;i++){
			if(sum>dp[i]){
				sum=dp[i];
			}
		}
		return sum;
    }
	public static int mypow(int a,int b){
		return (a-b)*(a-b);
	}
	
}