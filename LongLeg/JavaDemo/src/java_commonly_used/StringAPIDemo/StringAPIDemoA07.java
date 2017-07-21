public class StringAPIDemoA07{
	public static void main(String[] args){
		String str = "Meng_Zhao_Yang";
		String[] str_split = str.split("_");
		System.out.println("the str_split length is: "+str_split.length);
		for(String s:str_split){
			System.out.println("the str_split is: "+ s);
		}
		String[] str_split1 = str.split("_",4);
		for(String s:str_split1){
			System.out.println("the str_split is: "+ s);
		}
		
	}
}
