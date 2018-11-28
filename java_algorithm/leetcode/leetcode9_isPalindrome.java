
public class leetcode9_isPalindrome {
	public static void main(String[] args){
		leetcode9_isPalindrome is9 = new leetcode9_isPalindrome();
		System.out.println(is9.isPalindrome(123));
		System.out.println(is9.isPalindrome(123321));
	}
    public boolean isPalindrome(int x) {
        return isPa(x+"");
    }
    public boolean isPa(String s){
        if(s.length()==1){
            return true;
        }
        boolean b = (s.charAt(0)==s.charAt(s.length()-1));
        if(b){
            if(s.length()==2)
                return true;
            else
                return isPa(s.substring(1,s.length()-1));
        }
        return false;
        
    }
}