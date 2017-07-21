
//public int indexOf(String)
//public int indexOf(String, int)
public class StringAPIDemo04 {
	public static void main(String[] arg){
		String str = "mengzhaoyang";
		System.out.println("the str g in str location is: "+ str.indexOf("g"));
		System.out.println("the str ng in str location is: "+ str.indexOf("ng"));
		System.out.println("the str ng in str location is: "+ str.indexOf("ng",3));
		System.out.println("the str mengchao in str location is: "+ str.indexOf("mengchao"));
	}
}
