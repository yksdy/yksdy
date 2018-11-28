public class selectSort{
	public static void main(String[] args){
		int[] a={2,4,1,5,12,3,44,121,55};
		//int j=a.length-1;
		//int[] a={2,4,1};
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
		for(int i=0;i<n-1;i++){
			for(int j=i+1;j<n;j++){
				if(a[i]>a[j]){
					int x=a[i];
					a[i]=a[j];
					a[j]=x;
				}
			}
		}
	}
}