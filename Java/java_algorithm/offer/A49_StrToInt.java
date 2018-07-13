import java.util.*;
public class A49_StrToInt {
    public int StrToInt(String str) {
		if(str==null) return 0;
        char[] c = str.toCharArray();
		int sum = 0;
		for(char x:c){
			if(x=='+'||x=='-'){
				continue;
			}
			else if(x>='0'&&x<='9'){
				sum = sum*10+(x-'0');
			}else{
				return 0;
			}
		}
		if(c[0]=='-'){
			return 0-sum;
		}
		else {
			return sum;
		}
    }
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		A49_StrToInt sti = new A49_StrToInt();
		String str = scan.next();
		System.out.println(sti.StrToInt(str));
	}
}