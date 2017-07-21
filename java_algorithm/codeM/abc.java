import java.util.Scanner;

public class abc{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] word1 = new int[a];
		for(int i = 0; i < a; i++){
                word1[i] = sc.nextInt();
                System.out.print(word1[i]+" ");
        }
		int b = sc.nextInt();
        int[] word2 = new int[b];
		for(int i = 0; i < b; i++){
                word2[i] = sc.nextInt();
                System.out.print(word2[i]+" ");
        }
		int x=minDifference(word1,word2);
		System.out.println(x);
    }
	
	public static int minDifference(int[] word1, int[] word2) {
        int m = word1.length;
        int n = word2.length;
        int[][] dp = new int[m+1][n+1];
		
        for(int i=0;i<=m;i++){
            for(int j=0;j<=n;j++){
				if(i==0&&j!=0){
                    dp[i][j]=mypow(0,word2[j-1]);
                }else if(j==0&&i!=0){
                    dp[i][j]=mypow(word1[i-1],0);
			
                }else if(j==0&&i==0){
					dp[0][0]=0;
				}
				else{
					int dif=mypow(word1[i-1],word2[j-1]);
				//	System.out.println(" dir= "+dif);
                //    dp[i][j]=Math.min(dp[i-1][j-1]+dif,Math.min(dp[i-1][j]+dif,dp[i][j-1]+dif));
					dp[i][j]=Math.min(dp[i-1][j-1]+dif,dif);
                }
				System.out.print(dp[i][j]+" ");
			/*
                if(i==0){
                    dp[i][j]=j;
                }else if(j==0){
                    dp[i][j]=i;
                }else{
                    dp[i][j]=Math.min(dp[i-1][j-1]+((word1[i-1]==word2[j-1])?0:mypow(word1[i-1],word2[j-1])),Math.min(dp[i-1][j]+1,dp[i][j-1]+1));
                }
			*/
            }
			System.out.println(" ");
        }
		System.out.println(" ");
		int meng=dp[m][1];
		int bb=dp[1][n];;
		for(int i=2;i<=n;i++){
			if(meng>dp[m][i]){
				meng=dp[m][i];
				//bb=i;
			}
		}
		for(int i=2;i<=m;i++){
			if(bb>dp[i][n]){
				bb=dp[i][n];
				//bb=i;
			}
		}
		if(bb>m){
			//return (meng-dp[0][bb-m+1]);
		}else{
			//return (meng-dp[m-bb][0]);
		}
	//	return Math.min(meng,bb);
		return meng;
        //return dp[m][n];
    }
	public static int mypow(int a,int b){
		return (a-b)*(a-b);
	}
	
}