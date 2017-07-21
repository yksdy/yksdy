import java.util.Scanner;
public class A23_VerifySquenceOfBST {
    public boolean VerifySquenceOfBST(int [] sequence) {
		if(sequence.length==0){
			return false;
		}
		if(sequence.length==1){
			return true;
		}

		int root = sequence[sequence.length-1];
		int start1=0;
		int end1=0;
		for(;(end1+1)<(sequence.length-1);end1++){
		//	System.out.println("end1= "+end1+ " root= "+root);
			if(sequence[end1]<root&&sequence[end1+1]>root){
				break;				
			}
			else if(sequence[end1]>root&&sequence[end1+1]<root) {
				return false;				
			}
		}
		int start2=0;
		int end2=sequence.length-2;
		if(sequence[end1]>root){
			start2=end1;
		}else{
			start2=end1+1;
		}
		
		for(int i=start2;i<sequence.length-1;i++){
			if(sequence[i]<root)
				return false;
		}
		System.out.println("##start1= "+start1+" end1= "+end1+" start2= "+start2+" end2= "+end2);
		if(start2>end2)
			return BFT(sequence,start1,end1);
		else if(start2==end1)
			return BFT(sequence,start2,end2);
		else
			return BFT(sequence,start1,end1)&&BFT(sequence,start2,end2);
    }
	public boolean BFT(int[] sequence,int start,int end){
		if(start==end){
			return true;
		}
		int root = sequence[end];
		int start1=start;
		int end1=start;
		for(;(end1+1)<end;end1++){
			if(sequence[end1]<root&&sequence[end1+1]>root){
				break;				
			}
			else if(sequence[end1]>root&&sequence[end1+1]<root) {
				return false;				
			}
		}
		int start2=0;
		if(sequence[end1]>root){
			start2=end1;
		}else{
			start2=end1+1;
		}
		int end2=end-1;
		for(int i=start2;i<end;i++){
			if(sequence[i]<sequence[end])
				return false;
		}
		System.out.println("@@start1= "+start1+" end1= "+end1+" start2= "+start2+" end2= "+end2);
		
		if(start2>end2)
			return BFT(sequence,start1,end1);
		else if(start2==end1)
			return BFT(sequence,start2,end2);
		else
			return BFT(sequence,start1,end1)&&BFT(sequence,start2,end2);
	}
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] seq = new int[n];
		for(int i=0;i<n;i++){
			seq[i]=scan.nextInt();
		}
		A23_VerifySquenceOfBST vf = new A23_VerifySquenceOfBST();
		System.out.println(vf.VerifySquenceOfBST(seq));
	}
}