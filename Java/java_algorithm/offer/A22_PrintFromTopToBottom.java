/*
20170701
*/
import java.util.ArrayList;
import java.util.LinkedList;
class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;
    public TreeNode(int val) {
        this.val = val;
    }
}

public class A22_PrintFromTopToBottom {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		LinkedList<TreeNode> ll = new LinkedList<TreeNode>();
		if(root!=null)
			ll.offer(root);
		while(ll.size()>0){
			TreeNode temp = ll.poll();
			al.add(temp.val);
			if(temp.left!=null){
				ll.offer(temp.left);
			}
			if(temp.right!=null){
				ll.offer(temp.right);
			}
		}
		return al;
		
    }
	public static void main(String[] args){
		TreeNode root = new TreeNode(1);
		TreeNode tn1 = new TreeNode(2);
		TreeNode tn2 = new TreeNode(3);
		root.left = tn1;
		root.right = tn2;
		TreeNode tn3 = new TreeNode(4);
		TreeNode tn4 = new TreeNode(5);
		tn1.left = tn3;
		tn1.right = tn4;
		TreeNode tn5 = new TreeNode(6);
		TreeNode tn6 = new TreeNode(7);
		tn2.left = tn5;
		tn2.right = tn6;
		A22_PrintFromTopToBottom pft = new A22_PrintFromTopToBottom();
		ArrayList<Integer> al = pft.PrintFromTopToBottom(root);
		for(int x:al){
			System.out.print(x+ " ");
		}
		System.out.println();
	}
}