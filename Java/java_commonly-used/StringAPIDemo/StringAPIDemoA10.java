public class StringAPIDemoA10{
	public static void main(String[] args){
		String str = "MengZhaoyang";
		if(str.equals("mengzhaoyang"))
			System.out.println("use equals mengzhaoyang == MengZhaoyang");
		else
			System.out.println("use equals mengzhaoyang != MengZhaoyang");
		if(str.equalsIgnoreCase("mengzhaoyang"))
			System.out.println("use equalsIgnoreCase mengzhaoyang == MengZhaoyang");
		else
			System.out.println("use equalsIgnoreCase mengzhaoyang != MengZhaoyang");
	}
}
