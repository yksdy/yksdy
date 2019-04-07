/*
20170620
Date
DateFormat
SimpleDateFormat
*/
import java.util.Date;
import java.util.*;
import java.text.*;
public class A05_DateDemo02{
	public static void main(String[] args){
		Date date = new Date();
		System.out.println(date);
		DateFormat df1 = DateFormat.getDateInstance();
		DateFormat df2 = DateFormat.getDateTimeInstance();
	//	DateFormat df3 = DateFormat.getDateIndstance(DateFormat.YEAR_FIELD,new Locale("zh","CN"));
	//	DateFormat df4 = DateFormat.getDateTimeInstance(DateFormat.YEAR_FIELD,DateFormat.ERA_FIELD,new Local("zh","CN"));
	//	System.out.println(df1.format(new Date())+"\n"+df2.format(new Date())+"\n"+df3.format(new Date())+"\n"+df4.format(new Date()));
		System.out.println(df1.format(new Date())+"\n"+df2.format(new Date()));
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
		System.out.println(sdf.format(new Date()));
		
		String strDate = "2015-01-01 15:20:00.000";
		String str1 = "yyyy-MM-dd HH:mm:ss.sss";
		String str2 = "HH:mm:ss.sss yyyy-MM-dd";
		SimpleDateFormat sdf1 = new SimpleDateFormat(str1);
		SimpleDateFormat sdf2 = new SimpleDateFormat(str2);		
		System.out.println(sdf1.format(date));
		System.out.println(sdf2.format(date));
		Date d = null;
		try{
			d=sdf1.parse(strDate);
		}catch(Exception e){
			e.printStackTrace();
		}
		System.out.println(sdf2.format(d));
	}
}
