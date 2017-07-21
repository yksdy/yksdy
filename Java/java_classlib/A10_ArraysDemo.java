import java.util.*;
public class A10_ArraysDemo{
	public static void main(String[] args){
		int[] temp = {23,5,12,54,44,5,31,34};
		char[] abc = {'a','e','d','r','x'};
		System.out.println(temp);
		System.out.println(" "+temp);
		System.out.print(temp);
		System.out.print(" "+temp);
		System.out.println(abc);
		System.out.println(" "+abc);
		System.out.print(abc);
		System.out.print(" "+abc);
		System.out.println(Arrays.toString(temp));
		Arrays.sort(temp);
		System.out.println(Arrays.toString(temp));
		System.out.println(Arrays.binarySearch(temp,12));
		System.out.println(Arrays.binarySearch(temp,5));
		System.out.println(Arrays.binarySearch(temp,31));
		Arrays.fill(temp,3);
		System.out.println(Arrays.toString(temp));
	}
}
