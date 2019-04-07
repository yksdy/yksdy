public class test5{
	public static void main(String[] args){
		int[] a ={5,68,1,3,2,48,4,2};
		for(int q:a){
			System.out.print(q+"  ");
		}
		int l = a.length;
		System.out.println("  ");
		sortQuick(a);
		for(int w:a){
			System.out.print(w+"  ");
		}
	}
	public static void sortQuick(int[] a){
		a[1]=100;
	}
}