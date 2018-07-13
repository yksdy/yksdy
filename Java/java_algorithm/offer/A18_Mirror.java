

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
public class A18_Mirror {
	
	public ArrayList<Integer> list1 = new ArrayList<Integer>();

	public void midSearch(TreeNode root, ArrayList<Integer> list){
		if(root==null){
			return;
		}
		midSearch(root.left,list);
		list.add(root.val);
		midSearch(root.right,list);
	}
	public void temp(TreeNode root11){
		list1.clear();
		this.midSearch(root11,list1);
		for(int x:list1){
			System.out.print(x+" ");
		}
		System.out.println();
	}
	public void Mirror(TreeNode root) {
		if(root==null){
			return;
		}
		Mirror(root.left);
		Mirror(root.right);
		TreeNode t = root.left;
		root.left=root.right;
		root.right=t;
	}
	public static void main(String[] args) {
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
		TreeNode root26 = new TreeNode(8);
		TreeNode root27 = new TreeNode(7);
		root23.left = root26;
		root23.right = root27;
		
		A18_Mirror mir = new A18_Mirror();

		mir.temp(root23);
		mir.Mirror(root23);
		mir.temp(root23);

		mir.temp(root11);
		mir.Mirror(root11);
		mir.temp(root11);
		
	}
}




