import java.io.*;
public class leetcode6_1{
	public static void main(String[] args){
		leetcode6_1 code = new leetcode6_1();
		// charAt(), length(), substring(), split(), indexOf(),
		// replaceAll(), equals(),ignoreEquals(), with
		System.out.println("PAYPALISHIRING".equals(code.convert("PAYPALISHIRING",7)));
	}
	public String convert(String s, int numRows){
		char[] array = s.toCharArray();
		int n = s.length();
		char[] taget = new char[n];
		int x = 0;
		if(numRows==1){
			return s;
		}
		for(int j=0;j<n;j+=(numRows-1)*2){
			if(x<n){
				taget[x]=array[j];
				++x;
			}else{
			   return new String(taget);
			}
		}
		for(int i=1;i<numRows-1;++i){
			System.out.println(i);
			int y =0;
			for(int j=i;j<n;){
				System.out.print(x+"	");
				taget[x]=array[j];
				++x;
				if(y%2==0){
					j+=(numRows-1-i)*2;
				}else{
					j+=i*2;
				}
				++y;
			}
			System.out.println();
		}
		
		for(int j=numRows-1;j<n;j+=(numRows-1)*2){
			if(x<n){
				taget[x]=array[j];
				++x;
			}else{
			   return new String(taget);
			}
		}
		return new String(taget);
	}
}