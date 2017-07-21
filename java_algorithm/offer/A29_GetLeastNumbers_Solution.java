/*
20170719

*/
import java.util.*;
public class A29_GetLeastNumbers_Solution {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
		ArrayList<Integer> al = new ArrayList<Integer> ();
		if(k>input.length){
			return al;
		}
		Arrays.sort(input);
		for(int i=0;i<k;i++){
			al.add(input[i]);
		}
		return al;
    }
	public static void main(String[] args){
		A29_GetLeastNumbers_Solution gln = new A29_GetLeastNumbers_Solution();
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> al = new ArrayList<Integer>();
		while(scan.hasNextInt()){
			al.add(scan.nextInt());
		}
		int[] a = new int[al.size()];
		int i=0;
		for(int x:al){
			a[i++]=x;
		}
		ArrayList<Integer> so = gln.GetLeastNumbers_Solution(a,4);
		for(int x:so){
			System.out.print(x+" ");
		}
	}
}