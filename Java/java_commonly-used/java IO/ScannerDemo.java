import java.util.*;
public class ScannerDemo {
	public static void main(String[] arg) throws Exception {
		Scanner scan = new Scanner(System.in);
		//scan.useDelimiter("\n");
		//String str = scan.next();
		//System.out.println(str);
		while(scan.hasNextInt()){
			System.out.println(scan.nextInt());
		}
		while(scan.hasNextFloat()){
			System.out.println(scan.nextFloat());
		}
	}
}
