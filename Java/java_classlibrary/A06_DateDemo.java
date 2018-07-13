/**
Date
Calendar
DateFormat
public static final DateFormat getDateInstance()
public sattic final DateFormat getDateTimeInstance()
public final String format(Date date)

SimpleDateFormat
**/
import java.util.Date;
import java.util.*;
import java.text.*;
public class A06_DateDemo{
	public static void main(String[] args){
		Date date = new Date();
		System.out.println("the date is: "+ date);
		Calendar calendar = new GregorianCalendar();
		System.out.println(calendar.get(Calendar.MONTH));
		System.out.println(calendar.get(Calendar.MONTH)+1);
		System.out.println(calendar.get(Calendar.DAY_OF_MONTH));

		DateFormat df1 = DateFormat.getDateInstance(DateFormat.YEAR_FIELD,new Locale("en","US"));
		DateFormat df2 = DateFormat.getDateTimeInstance(DateFormat.YEAR_FIELD,DateFormat.YEAR_FIELD,new Locale("en","US"));
		System.out.println("DATE : " +df1.format(date));
		System.out.println("DATETIME : "+df2.format(date));

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
		System.out.println("SimpleDateFormat: "+sdf.format(new Date()));
		
	}
}
