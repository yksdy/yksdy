public class quickSort{
	public static void main(String[] args){
		quickSort qs = new quickSort();
		int[] a={2,4,1,5,12,3,44,121,55};
		//int j=a.length-1;
		//int[] a={2,4,1};
		for(int x:a){
			System.out.print(x+"  ");
		}
		System.out.println("");
		sort(a,0,a.length-1,0);
		for(int x:a){
			System.out.print(x+"  ");
		}
		System.out.println("");
	}
	public static void sort(int[] a,int i, int j, int k){
		int n=i;
		int m=j;
		while(i!=j){
			if(i==k){
				if(a[k]>a[j]){
					int x=a[k];
					a[k]=a[j];
					a[j]=x;	
					k=j;
					++i;
				}else{
					--j;
				}
			}
			else if(j==k){
				if(a[k]<a[i]){
					int x=a[k];
					a[k]=a[i];
					a[i]=x;
					k=i;
					--j;
				}else{
					++i;
				}
			}
		}
		if(n<k-1)
			sort(a,n,k-1,n);
		if(k+1<m)
			sort(a,k+1,m,k+1);
	}
}