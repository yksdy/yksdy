public class test4{
	public static void main(String[] args){
		int[] a ={5,68,1,3,7,23,8,26,445,31};
	//	int[] a ={5,68,1,3,7};
	
		for(int q:a){
			System.out.print(q+"  ");
		}
		System.out.println("  ");
		System.out.println("k = "+a[0]);
		int l = a.length;
		
		sortQuick(a,0,l-1,0);
		for(int w:a){
			System.out.print(w+"  ");
		}
	}
	public static void sortQuick(int[] a,int i, int j, int k){
		int m=j;
		int n=i;
		while(i!=j){
			if(i==k){
				if(a[k]<a[j]){
					//++i;
					//++k;
					--j;
				}
				else{
					int x=a[k];
					a[k]=a[j];
					a[j]=x;
					k=j;
					++i;
				}
			}
			else if(j==k){
				if(a[k]<a[i]){
					int x=a[k];
					a[k]=a[i];
					a[i]=x;
					k=i;
					--j;
				}
				else{
					//--j;
					//--k;
					++i;					
				}
			}
		}	
		for(int w:a){
			System.out.print(w+"  ");
		}
		System.out.println("  ");
		System.out.println("k = "+a[k]);
		
		if(n<k-1)
			sortQuick(a,n,k-1,n);
		if(k+1<m)
			sortQuick(a,k+1,m,k+1);
	}
}