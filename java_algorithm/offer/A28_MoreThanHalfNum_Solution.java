/*
20170719
*/
import java.util.Scanner;
import java.util.*;
public class A28_MoreThanHalfNum_Solution {
    public int MoreThanHalfNum_Solution(int [] array) {
		int x = array.length;
		ArrayList<Integer> al = new ArrayList<Integer>();
		if(x==0){
			return 0;
		}
		for(int i=0;i<x;i++){
			al.add(array[i]);
		}
		
		while(al.size()>(array.length/2)){
			int m = al.get(0);
			for(int ii=0;ii<al.size();){
				if(m==al.get(ii)){
					al.remove(ii);
				}else{
					++ii;
				}
			}
			int mm =x-al.size();
			System.out.println("mm= "+mm);
			if(mm>(array.length/2)){
				return m;
			}
			x = al.size();
		}
		return 0;
    }
	public static void main(String[] args){
		A28_MoreThanHalfNum_Solution ms = new A28_MoreThanHalfNum_Solution();
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
		System.out.println(ms.MoreThanHalfNum_Solution(a));
	}
}