
/**
public static final ResourceBundle getBundle(String baseName)
public static final ResourceBundle getBundle(String baseName, Locale locale)
public final String getString(String key)

Locale

MessageFormat-->
public static String format(String, Object ... )
**/
import java.util.ResourceBundle;
import java.util.Locale;
import java.text.*;
public class A04_InterDemo{
	public static void main(String[] args){
		Locale zhLoc = new Locale("zh","CN");
		Locale enLoc = new Locale("en","US");
		Locale frLoc = new Locale("fr","FR");
		ResourceBundle zhrb = ResourceBundle.getBundle("A04_Message",zhLoc);
		ResourceBundle enrb = ResourceBundle.getBundle("A04_Message",enLoc);
		ResourceBundle frrb = ResourceBundle.getBundle("A04_Message",frLoc);
		System.out.println("zh ,,, the message is: "+ MessageFormat.format(zhrb.getString("info"),"√…≥Ø—Ù"));
		System.out.println("en// the message is: "+ MessageFormat.format(enrb.getString("info"),"mengzhaoyang"));
		System.out.println("fr the message is: "+ MessageFormat.format(frrb.getString("info"),"meng","chao yang","@@@"));
	}
}
