public class SpliteDemo{
	public static void main(String[] args){
		String str1 ="bjj,mzy,bai,jiaojiao";
		System.out.println(str1);
		String[] str = str1.split("i");
		for(String s:str ){
			System.out.println(s);
		}
	}
}
