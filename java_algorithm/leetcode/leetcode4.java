public class leetcode4{
	public static void main(String[] args){
		leetcode4 code=new leetcode4();
		int[] a={1,2};
		int[] b={3,4};
		System.out.println(code.findMedianSortedArrays(a,b));
	}   
	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        return ((m+n)%2==1)?findMid(nums1,n,nums2,m,(m+n+1)>>1):((findMid(nums1,n,nums2,m,(m+n)>>1))+findMid(nums1,n,nums2,m,((m+n)>>1)+1))/2;
    }
    public double findMid(int[] a,int n,int[] b,int m,int k){
        int i=0,j=0;
        while(i<n&&j<m){
            --k;
            if(a[i]<b[j]){
                if(k==0){
                    return a[i];
                }
                ++i;
            }else if(k==0){
                return b[j];
            }
            else {
                ++j;
            }
        }
        return (i>=n)?b[j+k-1]:a[i+k-1];
    }
}