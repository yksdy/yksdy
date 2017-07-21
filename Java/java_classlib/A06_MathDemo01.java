import java.util.*;
public class A06_MathDemo01{
	public static void main(String[] args){
		System.out.println(Math.sqrt(9));
		System.out.println(Math.round(3.23));
		System.out.println(Math.round(3.63));
		System.out.println(Math.max(9,32));
		System.out.println(Math.min(9,32));
		System.out.println(Math.pow(3,2));
		System.out.println("----");
		Random r = new Random();
		for(int i = 0;i<10;i++)
			System.out.println(r.nextInt(100));
	}
}
