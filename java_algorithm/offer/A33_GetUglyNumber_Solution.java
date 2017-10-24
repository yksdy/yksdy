import java.util.*;

public class A33_GetUglyNumber_Solution {
    public int GetUglyNumber_Solution(int index) {
		if (index < 7)return index;
		int[] res = new int[index];
		res[0] = 1;
		int t2 = 0, t3 = 0, t5 = 0, i;
		for (i = 1; i <index; ++i)	{
			res[i] = Math.min(Math.min(res[t2] * 2, res[t3] * 3), res[t5] * 5);
			if (res[i] == res[t2] * 2) t2++;
			if (res[i] == res[t3] * 3) t3++;
			if (res[i] == res[t5] * 5) t5++;
		}
		System.out.println(t2+" "+" "+t3+" "+t5);
		for(int x: res){
			System.out.print(x+" ");
		}
		return res[index-1];
    }	
	public static void main(String[] args){
		A33_GetUglyNumber_Solution un = new A33_GetUglyNumber_Solution();
		System.out.println(un.GetUglyNumber_Solution(9));
	}
}