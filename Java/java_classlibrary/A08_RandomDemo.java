/**
**/
import java.util.Random;
public class A08_RandomDemo{
	public static void main(String[] args){
		Random r = new Random();
		for(int i=0; i<10; i++){
			System.out.print(r.nextInt(100)+"\t");
		}
		for(int i=0; i<10; i++){
			System.out.print(new Random(100)+"\t");//error
		}
		
	}
}
