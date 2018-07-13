
/**
20170629
**/
import java.util.*;
class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;
    public TreeNode(int val) {
        this.val = val;
    }

}
public class A17_HasSubtree {
    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
		if(root2 ==null){
			return false;
		}
		if(root1==null){
			return false;
		}
		boolean flag = false;
		if(root1.val==root2.val){
			flag =IsSubtree(root1,root2);
		}
		if(!flag){
			HasSubtree(root1.left,root2);
			if(!flag){
				HasSubtree(root1.right,root2);
			}
			
		}
		return flag;
		
    }
	public boolean IsSubtree(TreeNode root1,TreeNode root2) {
		if(root2 ==null){
			return true;
		}
		if(root1==null){
			return false;
		}
		if(root1.val==root2.val){
			return IsSubtree(root1.left,root1.left)&&IsSubtree(root1.right,root1.right);
			
		}else{
			return false;
		}

	}
	public static void main(String[] args){
		TreeNode root11 = new TreeNode(1);
		TreeNode root12 = new TreeNode(2);
		TreeNode root13 = new TreeNode(3);
		root11.left = root12;
		root11.right = root13;
		TreeNode root14 = new TreeNode(4);
		TreeNode root15 = new TreeNode(5);
		root12.left = root14;
		root12.right = root15;
		TreeNode root16 = new TreeNode(6);
		TreeNode root17 = new TreeNode(7);
		root13.left = root16;
		root13.right = root17;

		TreeNode root23 = new TreeNode(3);
		TreeNode root26 = new TreeNode(5);
		TreeNode root27 = new TreeNode(7);
		root23.left = root26;
		root23.right = root27;
		A17_HasSubtree tree = new A17_HasSubtree();
		System.out.println(tree.HasSubtree(root11,root23));
		
		/*
		ArrayList<Integer> ab = tree.MFS(root11,new ArrayList<Integer>());
		for(int x:ab){
			System.out.print(x+" ");
		}
		*/
		
	}
}

