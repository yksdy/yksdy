
import java.util.Date;
import java.util.*;
import java.text.*;
public class A05_DateDemo01{
	public static void main(String[] args){
		Date date = new Date();
		System.out.println(date);
		
		Calendar c = new GregorianCalendar();
		System.out.println(c.get(Calendar.YEAR));
		
		String dateStr = "2015-08-13 11:02:32.323";
		String dateFormat = "yyyy-MM-dd HH:mm:ss.SSS";
		SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
		Date d = null;
		/*
		try{
			d = sdf.parse(dateStr);
			}catch(Exception e){
				e.printStackTrace();
			}
			*/
		System.out.println("d: "+d);
		System.out.println("d: "+sdf.format(d));
		System.out.println("date: "+sdf.format(date));
	}
}
