import java.io.*;
import java.util.*;
import java.net.*;
import java.math.*;
public class A03_URLConnectionDemo01{
	public static void main(String[] args) throws Exception{
		URL url = new URL("https://leetcode.com/problemset/algorithms/");
		URLConnection urlCon = url.openConnection();
	//	System.out.println(new BigInteger((urlCon.getContentLength()).toString()));
		System.out.println(urlCon.getContentType());
		//Scanner scan = new Scanner(urlCon.getInputStream());
		//scan.useDelimiter("\n");
		//while(scan.hasNext()){
		//	System.out.println(scan.next());
		//}
		
	}
}
