import java.util.Scanner;

public class mb{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int[] mnum = new int[m];
		for(int i = 0; i < m; i++){
                mnum[i] = sc.nextInt();
        }
		int n = sc.nextInt();
        int[] nnum = new int[n];
		for(int i = 0; i < n; i++){
                nnum[i] = sc.nextInt();
        }
		
		int ml = mnum.length;
        int nl = nnum.length;
        int[] comp = new int[nl-ml+1];
		
		int sum=0;
		for(int i=0;i<comp.length;i++){
			for(int j=0;j<ml;j++){
				comp[i]=comp[i]+(mnum[j]-nnum[j+i])*(mnum[j]-nnum[j+i]);
			}
			
			if(i>0){
				sum=comp[i-1];
				if(sum>comp[i]){
					sum=comp[i];
				}
			}
		}	
		for(int i=0;i<comp.length;i++){
			if(sum>comp[i]){
				sum=comp[i];
			}
		}		
		System.out.println(sum);
    }
		
}