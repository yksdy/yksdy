/*
20150210 add annotation
Description: 
*/
public class A02_BinaryTreeDemo {
	public static void main(String[] args){
		Solution s = new Solution();
		System.out.println(s.convert("a b  c\nc c",2));
		//System.out.println("a b  c\nc c");
		//System.out.println("a b  c\nc c".length());
	}
}
class Solution {
	public String convert(String s, int nRows) {
		StringBuffer sb = new StringBuffer();
		String ss =s;
		for(int i=0; i<ss.length();i++){
			if(ss.charAt(i)!='\n'&&ss.charAt(i)!=' ')
			{
				sb.append(ss.charAt(i));
				System.out.println("ss.charAt(i)"+ss.charAt(i));
			}
		}
    	return sb.toString();
	}
}
class BinaryTree{
	class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x){
			val = x;
		}
		
	}
}
