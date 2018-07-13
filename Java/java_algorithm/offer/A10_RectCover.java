/*
*/
import java.util.Scanner;
public class A10_RectCover {
//public class Solution {
   public int RectCover(int target) {
	    if(target==0){
        	return 0;
        }
		if(target==1){
        	return 1;
        }
        if(target==2){
        	return 2;
        }
        return RectCover(target-1)+RectCover(target-2);
    }
	public static void main(String[] args){
		A10_RectCover r = new A10_RectCover();
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		System.out.println(r.RectCover(x));
	}
}