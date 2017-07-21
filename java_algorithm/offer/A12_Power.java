/*
20170628
链接：https://www.nowcoder.com/questionTerminal/1a834e5e3e1a4b7ba251417554e07c00
来源：牛客网

?* 1.全面考察指数的正负、底数是否为零等情况。
?* 2.写出指数的二进制表达，例如13表达为二进制1101。
?* 3.举例:10^1101 = 10^0001*10^0100*10^1000。
?* 4.通过&1和>>1来逐位读取1101，为1时将该位代表的乘数累乘到最终结果。
*/
import java.util.Scanner;
//public class Solution {
public class A12_Power{
    public double Power(double base, int exponent) {
		double sum = 1;
        if(base == 0)
			return 0;
		if(exponent == 0)
			return 1;
		if(exponent>0){
			while(exponent>0){
				sum *=base;
				--exponent;
			}
		}else{
			while(exponent<0){
				sum *=base;
				++exponent;
			}
			sum = 1/sum;
		}
		return sum;
	}
	public static void main(String[] args){
		A12_Power p = new A12_Power();
		Scanner s = new Scanner(System.in);
		double a = s.nextDouble();
		int b = s.nextInt();
		System.out.println(p.Power(a,b));
	}
}