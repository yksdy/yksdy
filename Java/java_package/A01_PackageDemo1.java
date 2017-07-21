package www.meng.com;
import www.meng.cn.*;
public class A01_PackageDemo1 extends A02_PackageDemo2{
	public static void main(String[] args){
		System.out.println("Hello package");
		//A01_PackageDemo1 a= new A02_PackageDemo2();
		A01_PackageDemo1 a= new A01_PackageDemo1();
		a.pri0();
		a.pri();
		a.pri1();
	//	a.pri2();
	//	A02_PackageDemo2 b =(A02_PackageDemo2)a;
		A02_PackageDemo2 b =new A02_PackageDemo2();
	//	b.pri();
		b.pri1();
		b.pri2();
	}
	private void pri0(){
		System.out.println("000 I'm A01_PackageDemo1");
	}
	protected void pri(){
		System.out.println("I'm A01_PackageDemo1");
	}
	void pri1(){
		System.out.println("11--I'm A01_PackageDemo1");
	}
}