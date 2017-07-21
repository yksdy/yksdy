
import java.util.ResourceBundle;
import java.util.Locale;
public class A03_InteDemo01{
	public static void main(String[] args){
		ResourceBundle rb = ResourceBundle.getBundle("A03_Message");	//properties
		System.out.println(rb.getString("info"));
		Locale abLoc = new Locale("ab","CD");
		Locale zhLoc = new Locale("zh","CN");
		Locale enLoc = new Locale("en","US");
		ResourceBundle abrb = ResourceBundle.getBundle("A03",abLoc);
		ResourceBundle zhrb = ResourceBundle.getBundle("A03",zhLoc);
		//ResourceBundle enrb = ResourceBundle.getBundle("",enLoc);
		System.out.println(abrb.getString("info"));
		System.out.println(zhrb.getString("info"));
		//System.out.println(enrb.getString("info"));
	}
}
