public class A30_FindGreatestSumOfSubArray {
    public int FindGreatestSumOfSubArray(int[] array) {
        int sum =0;
		int max =Integer.MIN_VALUE;
		for(int x:array){
			if(sum+x<x){
				sum=x;
			}else{
				sum+=x;
			}
			if(max<sum){
				max=sum;
			}
		}
		return max;
    }
	public static void main(String[] args){
		int[] a = {-2,-8,-1,-5,-9};
		A30_FindGreatestSumOfSubArray sa = new A30_FindGreatestSumOfSubArray();
		System.out.println(sa.FindGreatestSumOfSubArray(a));
	}
}