import java.io.*;
import java.util.*;
import java.awt.*;
public class StringAPIDemoB04_StringBuffer{
	public static void main(String[] args){
		StringBuffer buf = new StringBuffer();
		buf.append("Hello everyone");
		System.out.println(buf);
		System.out.println(buf.append(" Hi,there"));
		System.out.println(buf.reverse());
		System.out.println(buf.reverse());
		System.out.println(buf.insert(2,"hahaha"));
		System.out.println(buf.delete(2,8));
		System.out.println(buf.replace(6,buf.length(),"World"));
		System.out.println(buf.substring(2,6));
		System.out.println(buf.indexOf("meng"));
		System.out.println(buf.toString());
	}
}
