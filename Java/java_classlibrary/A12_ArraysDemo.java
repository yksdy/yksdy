/**
Arrays
public static String toStirng(int[] a)
public static boolean equals(int[] a, int[] b)
public sttic void fill(int[] , int)
public static void sort([])
pubic static int binarySearch([], int key)
**/

import java.util.*;
public class A12_ArraysDemo{
	public static void main(String[] args){
		int[] temp = {2,4,56,3,78};
		System.out.println("array is: "+Arrays.toString(temp));

		System.out.println("Array.binarySearch 4 is: "+Arrays.binarySearch(temp,4));
		System.out.println("Array.binarySearch 441 is: "+Arrays.binarySearch(temp,441));

		Arrays.sort(temp);
		System.out.println("Array.sort is: "+Arrays.toString(temp));

		System.out.println("Array.binarySearch 4 is: "+Arrays.binarySearch(temp,4));
		System.out.println("Array.binarySearch 441 is: "+Arrays.binarySearch(temp,441));

		Arrays.fill(temp,12);
		System.out.println("Array.fill 12 is:"+Arrays.toString(temp));
	}
}
