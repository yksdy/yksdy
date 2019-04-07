import java.io.*;
public class leetcode6{
	public static void main(String[] args){
		leetcode6 code = new leetcode6();
		// charAt(), length(), substring(), split(), indexOf(),
		// replaceAll(), equals(),ignoreEquals(), with
		System.out.println("PAHNAPLSIIGYIR".equals(code.convert("PAYPALISHIRING",3)));
	}
	public String convert(String s, int numRows){
		StringBuffer buf = new StringBuffer();	
		for(int j=0;j<numRows-1;j++){
			for(int i = j;i<s.length();i+=(numRows-1-j)*2){
				buf.append(s.charAt(i));
			}
		}
		for(int i = numRows-1;i<s.length();i+=(numRows-1)*2){
				buf.append(s.charAt(i));
		}
		String str = buf.toString();
		System.out.println("in: PAYPALISHIRING out: PAHNAPLSIIGYIR ");
		System.out.println(str);
		return str;
	}
}