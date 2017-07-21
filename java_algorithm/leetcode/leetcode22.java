import java.util.*;
public class leetcode22{
	public static void main(String[] args){
		leetcode22 code=new leetcode22();
		List<String> list = code.generateParenthesis(2);
		for(String s: list){
			System.out.println(s);
		}
	}	
	public void help(int n,int x, int y, String now, List<String> answer){
		if(y==n){
			answer.add(now);
		}
		if(x<n){
			help(n,x+1,y,now+"(",answer);
		}
		if(x>y){
			help(n,x,y+1,now+")",answer);
		}
	}
	public List<String> generateParenthesis(int n){
		List<String> answer = new ArrayList<String>();
		help(n,0,0,"",answer);
		return answer;
	}
}