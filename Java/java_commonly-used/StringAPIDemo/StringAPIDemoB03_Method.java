public class StringAPIDemoB03_Method {
	public static void main(String[] args){
		String str = "  Hello world  ";
		System.out.println(str.length());
		System.out.println(str.indexOf("llo"));
		System.out.println(str.charAt(4));
		System.out.println(str.trim());
		System.out.println(str.substring(5));
		for(String s:str.split("w"))
			System.out.println(s);
		System.out.println(str.replaceAll("world","meng"));
		System.out.println(str.equals("  Hello World  "));
		System.out.println(str.equalsIgnoreCase("  Hello World  "));
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		System.out.println(str.startsWith("  H"));
		System.out.println(str.endsWith("abc"));
	}
}
