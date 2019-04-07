public class leetcode13{
	public static void main(String[] args){
		System.out.println(new leetcode13().romanToInt("MVL"));
	}
	public int romanToInt(String s) {
		int ret = toNumber(s.charAt(0));  
        for (int i = 1; i < s.length(); i++) {  
            if (toNumber(s.charAt(i-1)) < toNumber(s.charAt(i))) {  
                ret += toNumber(s.charAt(i)) - 2 * toNumber(s.charAt(i-1));  
            } else {  
                ret += toNumber(s.charAt(i));  
            }  
        }  
        return ret;  
    }  
      
    int toNumber(char ch) {  
        switch (ch) {  
            case 'I': return 1;  
            case 'V': return 5;  
            case 'X': return 10;  
            case 'L': return 50;  
            case 'C': return 100;  
            case 'D': return 500;  
            case 'M': return 1000;  
        }  
        return 0;  
    }  
}