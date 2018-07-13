import java.util.Scanner;

public class chu_A2{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] str = new String[2*n];
		for(int i=0;i<str.length;i++){
			str[i]=sc.next();
		}
		for(int i=0;i<str.length;i++){
		//	System.out.println(str[i]);
		}
		//System.out.println((str[0]+str[1]));
		for(int i=0;i<n;i++){
			charu(str[i*2],str[i*2+1]);
		}
		System.out.println(longestPalindrome(str[0]+str[1]));
    }
	public static void charu(String str1,String str2){
		int l1=str1.length();
		int l2=str2.length();
		char[] a=str1.toCharArray();
		char[] b=str2.toCharArray();
		char[] c =new char[l1+l2];
		for(int x=0;x<(l2+l1);x++){
			for(int j=0;j<=l2-x;j++){
				for(int i=0;i<l1;i++){
					if(x>=i){
						c[x+j]=a[i];
					}
					else{
						break;
					}
				}
				
			}
			
		}
		/*
		for(int j=0;j<=l2;j++){
			for(int i=0;i<l1;i++){
				c[j+i]=a[i];
			}
			
		}
		*/
	}

	public static int longestPalindrome(String s) {  
        if (s.length() < 2) return 1;  
        String result = "";  
          
        for (int i=0; i<s.length(); i++) {  
            String s1 = expand(s, i, i);  
            String s2 = expand(s, i, i+1);  
              
            if (s1.length() > result.length()) {  
                result = s1;  
            }  
            if (s2.length() > result.length()) {  
                result = s2;  
            }  
        }  
          
        return result.length();  
    }  
      
    public static String expand(String s, int c1, int c2) {  
        int j = 0;  
        for (; c2+j<s.length() && c1-j>=0; j++) {  
            if (s.charAt(c2+j) != s.charAt(c1-j)) {  
                break;  
            }  
        }  
          
        return s.substring(c1-j+1, c2+j);      
    } 
}