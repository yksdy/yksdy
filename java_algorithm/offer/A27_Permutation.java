/*
20170711
*/
import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;
import java.util.Collections;
public class A27_Permutation {
	
    public ArrayList<String> Permutation(String str) {
	    ArrayList<String> al =new ArrayList<String>();
		if(str == null || str.length()==0){
			return al;
		}
        fun(al,str.toCharArray(),0);
		Collections.sort(al);
		return al;
    }
	public void fun(ArrayList<String> al, char[] str, int k){
		if(k==str.length-1){
		//	System.out.println(str);
			al.add(new String(str));
			return;
		}
		for(int i = k;i<str.length;i++){
			boolean flag = false;
			for(int j=k;j<i;j++){
				
				if(str[i]==str[j]){
					flag=true;
					break;
				}
			}
			if(flag==false){
				swap(str,i,k);
				fun(al,str,k+1);
				swap(str,i,k);
			}
		}
	}
	public void swap(char[] str,int i,int j){
		if(i!=j){
			char temp = str[i];
			str[i]=str[j];
			str[j]=temp;
		}
	}

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		scan.close();
		System.out.println("\n---------");
		A27_Permutation per = new A27_Permutation();
		ArrayList<String> al = per.Permutation(str);
		System.out.println("\n#############");
		for(String s:al){
			System.out.println(s);
		}
		System.out.println("\n#############");
	}
}

