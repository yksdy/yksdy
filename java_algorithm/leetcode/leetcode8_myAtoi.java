
class leetcode8_myAtoi {
    public int myAtoi(String str) {
        if(str.equals("")){
            return 0;
        }
		str = str.trim();
		char c = str.charAt(0);
		if(c== '+' ||c == '-'){
			str = str.substring(1,str.length());
		}
        int length = str.length();
        long result = 0;
		int y = length-1;
        for(int i=0;i<length;i++){
			int x = str.charAt(i)-'0';
            if(x<0||x>9){
                y=i-1;
                break;
            }
        }
        if(y<0) return 0;
        for(int i=0;i<length;i++){
            int x = str.charAt(i)-'0';
            if(x>=0&&x<=9){
                result = result+x*(int)Math.pow(10,(y-i));
				if(result>Integer.MAX_VALUE||(y-i)>9||(y-i==9&&x>2)){
					if(c=='-'){
						return Integer.MIN_VALUE;
					}else
					return Integer.MAX_VALUE;
				}
            }else{
               // y=i-1;
               // result = 0;
                if(c=='-')
			        return (int)(0-result);
		        else
			        return (int)result;
            }
        }
		if(c=='-')
			return (int)(0-result);
		else
			return (int)result;
    }
    
	public static void main(String[] args){
		leetcode8_myAtoi l8 = new leetcode8_myAtoi();
		System.out.println(l8.myAtoi(""));
		System.out.println(l8.myAtoi("23"));
		System.out.println(l8.myAtoi("aw1"));
		System.out.println(l8.myAtoi("1aw"));
		System.out.println(l8.myAtoi("a1w"));
		System.out.println(l8.myAtoi("123"));
		System.out.println(l8.myAtoi("2a32w4"));
		System.out.println(l8.myAtoi(" 123"));
		System.out.println(l8.myAtoi(" 22a32w4"));
		System.out.println(l8.myAtoi("q123"));
		System.out.println(l8.myAtoi("24 22a32w4"));
		System.out.println(l8.myAtoi("+3"));
		System.out.println(l8.myAtoi("-42"));
		System.out.println(l8.myAtoi("2147483648"));
		System.out.println(l8.myAtoi("-52"));
		System.out.println(l8.myAtoi("2947483648"));
		System.out.println(l8.myAtoi("-32"));
		System.out.println(l8.myAtoi("3147483648"));
		System.out.println(l8.myAtoi("21474836489"));
		System.out.println(l8.myAtoi("21474836487"));
		System.out.println(l8.myAtoi("21474836486"));
		System.out.println(l8.myAtoi("-2147483648"));
		System.out.println(l8.myAtoi("-21474836489"));
		
	}
}