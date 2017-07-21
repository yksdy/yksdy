public class A02_GetClassDemo02{
	public static void main(String[] args){
		Class<?> c1 = null;
		Class<?> c2 = null;
		Class<?> c3 = null;
		c1 = new X().getClass();
		c2 = X.class;
		try{
			c3 = Class.forName("X");
		}catch(Exception e){
			e.printStackTrace();
		}		
		System.out.println(c1.getName());
		System.out.println(c2.getName());
		System.out.println(c3.getName());
	}
}
class X{
	
}