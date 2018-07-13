/*
20170628
���ӣ�https://www.nowcoder.com/questionTerminal/1a834e5e3e1a4b7ba251417554e07c00
��Դ��ţ����

?* 1.ȫ�濼��ָ���������������Ƿ�Ϊ��������
?* 2.д��ָ���Ķ����Ʊ�����13���Ϊ������1101��
?* 3.����:10^1101 = 10^0001*10^0100*10^1000��
?* 4.ͨ��&1��>>1����λ��ȡ1101��Ϊ1ʱ����λ����ĳ����۳˵����ս����
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