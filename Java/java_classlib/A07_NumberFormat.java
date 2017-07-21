import java.text.*;
public class A07_NumberFormat{
	public static void main(String[] args){
		NumberFormat nf = null;
		nf = NumberFormat.getInstance();
		System.out.println(nf.format(1234567));
		System.out.println(nf.format(34.652));

		DecimalFormat df = new DecimalFormat("00,000$");
		System.out.println(df.format(12345632));
	}
}
