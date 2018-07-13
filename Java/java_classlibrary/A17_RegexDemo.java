/**
Pattern.compile("...").matcher(Object).matches()

Pattern
public static compile(String regex)
public Matcher matcher(char[])
public String[] split(String)

Matcher
public Matcher matcher(char[])
public boolean matches()
public String replaceAll(String)

String
matches()
replaceAll()
split()
**/
import java.util.*;
import java.util.regex.*;

public class A17_RegexDemo{
	public static void main(String[] args){
		String abc = "2343252";
		if(Pattern.compile("[0-9]+").matcher(abc).matches()){
			System.out.println("is number");
		}
		else{
			System.out.println("is not number");
		}
	}
}
