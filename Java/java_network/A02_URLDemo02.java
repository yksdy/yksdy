import java.io.*;
import java.util.*;
import java.net.*;
public class A02_URLDemo02{
	public static void main(String[] args) throws Exception{
		//URL url = new URL("https://leetcode.com/problemset/algorithms/");
		URL url = new URL("http","www.baidu.com",80,"/");
		InputStream is = url.openStream();
		Scanner scan = new Scanner(is);
		scan.useDelimiter("\n");
		while(scan.hasNext()){
			System.out.println(scan.next());
		}
		//URLConnection urlCon = url.openConnection();
		//System.out.println(urlCon.getContentLength());
		//System.out.println(urlCon.getContentType());
	}
}
