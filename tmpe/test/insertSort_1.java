public class insertSort_1{
	public static void main(String[] args){
		int[] a={4,2,1,5,12,6,44,121,55};
		for(int x:a){
			System.out.print(x+"  ");
		}
		System.out.println("");
		sort(a,a.length);
		for(int x:a){
			System.out.print(x+"  ");
		}
		System.out.println("");
	}
	public static void sort(int[] a,int n){
		for(int i=1;i<n;i++){
			for(int j=i;j>0;--j){
				if(a[j]<a[j-1]){
					int x=a[j];
					a[j]=a[j-1];
					a[j-1]=x;
				}
				else{
					break;
				}
			}
		}
	}
}