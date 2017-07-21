public class B01_GetClassDemo1{
	public static void main(String[] args){
		Class<?> x1;
		Class<?> x2;
//		Class<?> x3;
		x1=X.class;
		x2=new X().getClass();
//try{
//		x3=Class.forName("B01_GetClassDemo1");
//}catch(ClassNoFoundException e){
//	e.printStackTrace();
//}
		System.out.println("x1= "+x1.getName());
		x1.pri();
		System.out.println("x2= "+x2.getName());
//		System.out.println("x3= "+x3.getName());
	}
}
class X{
	void pri(){
		System.out.println("haha reflack");
	}
}

