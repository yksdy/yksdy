
//public boolean startsWith(String)
//public boolean endsWith(String)
public class StringAPIDemo09 {
	public static void main(String[] arg){
		String str = "mengzhaoyang";
		if(str.startsWith("Meng")){
			System.out.println("the str starts with Meng ");
		}
		else{
			System.out.println("the str not starts with Meng ");
		}
		if(str.endsWith("yang")){
			System.out.println("the str ends with yang ");
		}
		else{
			System.out.println("the str not ends with yang ");
		}
	}
}
