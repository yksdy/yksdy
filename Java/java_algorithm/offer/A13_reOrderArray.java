/*
20170628
*/
import java.util.Scanner;
public class A13_reOrderArray{
//public class Solution {
	public void reOrderArray(int [] array) {
		int[] a = new int[array.length];
		int start =0;
		int end =array.length-1;
		for(int x:array){
			if(x%2==0){
				a[end]=x;
				end--;
			}else{
				a[start]=x;
				start++;
			}
		}
		int p=array.length-1;
		for(int i=start;i<p;i++){
			int temp = a[i];
			a[i]=a[p];
			a[p]=temp;
			p--;
		}
		for(int i=0;i<array.length;i++){
			array[i]=a[i];
		}
		for(int x:array){
			System.out.print(x+" ");
		}
		
		System.out.println(" ");
	}


	public static void main(String[] args){
		int num=0;
		int[] array1 = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18};
		int[] array2 = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17};
		int[] array3 = {2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18};
		int[] array4 = {2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19};
		A13_reOrderArray oa=new A13_reOrderArray();
		for(int x:array1){
			System.out.print(x+" ");
		}
		System.out.println(" ");
		oa.reOrderArray(array1);
		System.out.println("\n----------------------------------------");
		for(int x:array2){
			System.out.print(x+" ");
		}
		
		System.out.println(" ");
		oa.reOrderArray(array2);
		System.out.println("\n---------------------------------");
		for(int x:array3){
			System.out.print(x+" ");
		}
		
		System.out.println(" ");
		oa.reOrderArray(array3);
		System.out.println("\n------------------------------");
		for(int x:array4){
			System.out.print(x+" ");
		}
		System.out.println(" ");
		oa.reOrderArray(array4);
		System.out.println("\n---------------------------------");
		
	}
}


