import java.io.File;
import java.io.*;

public class A12_BufferedReaderDemo {
	public static void main(String[] args)  throws Exception{
		File f = new File("test.txt");
		BufferedReader bf = new BufferedReader(new FileReader(f));
		String str1 = bf.readLine();
		String str2 = bf.readLine();
		System.out.println(str1);
		System.out.println(str2);
	}
}
