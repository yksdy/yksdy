import java.util.ArrayList;
import java.util.*;
public class A32_PrintMinNumber {
    public String PrintMinNumber(int [] numbers) {
		int l = numbers.length;
		ArrayList<Integer> al = new ArrayList<Integer>();
		for(int i=0;i<l-1;i++){
			for(int j=i+1;j<l;j++){
				if(numbers[i]==numbers[j]){
					break;
				}
				if(com(numbers[i],numbers[j])){
					int temp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = temp;
				}
			}
			al.add(numbers[i]);
		}
		al.add(numbers[l-1]);
		String str = new String();
		for(int x: al){
			str+=x;
		}
		return str;
    }
	public boolean com(int m, int n){
		ArrayList<Integer> alm = new ArrayList<Integer>();
		for(int i=m;i>0;i=i/10){
			alm.add(i%10);
		}
		
		ArrayList<Integer> aln = new ArrayList<Integer>();
		for(int i=n;i>0;i=i/10){
			aln.add(i%10);
		}
		
		for(int i=alm.size()-1,j=aln.size()-1;i>=0&&j>=0;){
			if(alm.get(i)>aln.get(j)){
				return true;
			}else if(alm.get(i)==aln.get(j)){
				
				if(i==0){
					String x =new String();
					for(int y=j;y>0;y--){
						x+=aln.get(y-1);
					}
					com(m, Integer.parseInt(x));
				}
				else if(j==0){
					String x =new String();
					for(int y=i;y>0;y--){
						x+=aln.get(y-1);
					}
					com(Integer.parseInt(x), n);
				}
				i--;j--;
				
			}else{
				return false;
			}
		}
		
		return false;
	}
	public boolean ccom(int m, int n){
		if(m>n){
			return true;
		}
		return false;
	}
	public static void main(String[] args){
		A32_PrintMinNumber pmn = new A32_PrintMinNumber();
		int[] a = {344,326,3211};
		System.out.println(pmn.PrintMinNumber(a));
	}
}