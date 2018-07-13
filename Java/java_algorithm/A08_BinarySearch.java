public class A08_BinarySearch {
	//static int[] a= {3,5,6,12,67,123,221};
	static int[] a= {4};
	static int Max = a.length;
	static int Min = 0;
	static int Mid = 0;
	static int v =3;
	public static void main(String[] args){		
		binarySearch(v);
		System.out.println((0+3)/2);
	}

	public static void binarySearch(int x){ //Recursion
		Mid = (Max+Min)/2;
		if(a[Mid]==x){
			System.out.println("find success "+ a[Mid]);
		}
		else
		{
			if(Mid==Max||Mid==Min){
				System.out.println("find fail ");
			}
			if(a[Mid]>x&&(Mid!=Max&&Mid!=Min)){
				Max=Mid;
				binarySearch(v);
			}
			if(a[Mid]<x&&(Mid!=Max&&Mid!=Min)){
				Min=Mid;
				binarySearch(v);
			}
		}
		
	}
}
