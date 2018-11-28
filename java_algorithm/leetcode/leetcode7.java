public class leetcode7{
	public static void main(String[] args){
		leetcode7 code = new leetcode7();
		System.out.println(Integer.MIN_VALUE);
		System.out.println(code.reverse(1534236469));
		//2147483647
		//1534236469
	}
	public int reverse(int x) {
		long y=0;
		do{
			int n=x%10;
			y=y*10+n;
			x=x/10;
			if(y>Integer.MAX_VALUE){
				return 0 //Integer.MAX_VALUE;	
			}else if(y<Integer.MIN_VALUE){
				return 0 //Integer.MIN_VALUE;	
			}
		}while(x!=0);
		return (int)y;
	}
}