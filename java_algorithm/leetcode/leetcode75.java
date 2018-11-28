public class leetcode75 {
	public static void main(String[] args){
		int[] c = {1,0,2,1};
		for(int x:c){
			System.out.print(x+"\t");
		}
		System.out.println();
		sortColors(c);
		for(int x:c){
			System.out.print(x+"\t");
		}
		System.out.println();
	}
    public static void sortColors(int[] nums) {
        int i=0;
        int j= nums.length;
        for(int k=0;k<j;k++){
            if(nums[k]==0){
                int x= nums[i];
                nums[i]=nums[k];
                nums[k]=x;
                i++;
            }else if(nums[k]==2){
                int y=nums[--j];
                nums[j]=nums[k];
                nums[k--]=y;
            }
        }
    }
}