import java.math.*;
public class A08_BigIntegerDemo{
	public static void main(String[] args){
		BigInteger bi1 = new BigInteger("1234567890");
		BigInteger bi2 = new BigInteger("987654321");
		System.out.println(bi1.add(bi2));
		System.out.println(bi1.subtract(bi2));
		System.out.println(bi1.multiply(bi2));
		System.out.println(bi1.divide(bi2));
		System.out.println(bi1.max(bi2));
		System.out.println(bi1.min(bi2));
		BigInteger[] result = bi1.divideAndRemainder(bi2);
		System.out.println(result[0]+"   "+result[1]);
	}
}
