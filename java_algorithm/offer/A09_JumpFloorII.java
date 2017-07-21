/*
20170628
*/
import java.util.Scanner;
public class A09_JumpFloorII {
//public class Solution {
    public int JumpFloorII(int target) {
        if(target==1){
            return 1;
        }
        int s=0;
        for(int i=1;i<target;i++){
           s += JumpFloorII(target-i);
        }
        return s+1;
    }
	public static void main(String[] args){
		A09_JumpFloorII jf = new A09_JumpFloorII();
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		System.out.println(jf.JumpFloorII(x));
	}
}