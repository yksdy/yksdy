/**
Format
MessageFormat
NumberFormat
DateFormat

getInstance
format

DecimalFormat df = new DecimalFormat(String pattem)
df.format(double)
**/
import java.text.*;

public class A09_NumberFormat{
	public static void main(String[] args){
		NumberFormat nf = NumberFormat.getInstance();
		System.out.println("format number 999999 is:"+nf.format(999999));
		System.out.println("format number 1000.234 is:"+nf.format(1000.234));

		DecimalFormat df = new DecimalFormat("##,##,##");
		System.out.println("Decimal format number 3456 is: "+df.format(3456));
	}
}
