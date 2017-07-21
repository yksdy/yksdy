package java_commonly_used.Array;

public class B01_ArrayDemo{
	public static void main(String[] args){
		int[] a  = {4,54,23,11,5,66,34};
		for(int i = 0;i<a.length;i++){
			System.out.println("a["+i+"] = "+a[i]);
		}
		pri(a[2],a[3]);
	}
	public static void pri(int ... x){
		for(int y:x){
			System.out.println("y = "+y);
		}
	}
}
