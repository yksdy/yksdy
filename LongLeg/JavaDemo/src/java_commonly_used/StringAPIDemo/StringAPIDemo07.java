package java_commonly_used.StringAPIDemo;
//public String[] split(Sting)
public class StringAPIDemo07 {
	public static void main(String[] arg){
		String str = "mengzhaoyang";
		String[] str_split = str.split("g");
		for(int i=0; i< str_split.length; i++){
			System.out.println(str_split[i]);
		}
		
		String str1 = "meng zhao yang";
		String[] str_split1 = str1.split(" ");
		for(String i:str_split1){
			System.out.println(i);
		}
	}
}
