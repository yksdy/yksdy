import java.util.*;

public class A01_BinaryTreeBFS{
	public static void main(String[] args){
		TreeNode root = new TreeNode(12);
		TreeNode child11 = new TreeNode(2);
		TreeNode child12 = new TreeNode(3);
		TreeNode child22 = new TreeNode(5);
		TreeNode child23 = new TreeNode(6);
		root.leftNode=child11;
		root.rightNode=child12;
		child11.rightNode=child22;
		child12.leftNode=child23;
		TreePrintree pri = new TreePrintree();
		pri.printTree(root);
	}
}
class TreeNode{
	int val = 0;
	TreeNode leftNode=null;
	TreeNode rightNode=null;
	public TreeNode(int val){
		this.val=val;
	}
	public int getVal(){
		return this.val;
	}
}
class TreePrintree{
	// public int[][] printTree(TreeNode root){
	public void printTree(TreeNode root){
		TreeNode last = root;
		TreeNode nlast = null;
		LinkedList<TreeNode> linkList = new LinkedList<TreeNode>();
		if(last!=null){
			linkList.add(last);
		}
		while(last!=null){
			TreeNode temp = linkList.poll();
			if(temp==null){
				return;
			}
			System.out.print(temp.getVal()+" ");
			if(temp.leftNode!=null){
				linkList.add(temp.leftNode);
				nlast=temp.leftNode;
			}
			if(temp.rightNode!=null){
				linkList.add(temp.rightNode);
				nlast=temp.rightNode;
			}
			if(last==temp){
				System.out.println();
				last=nlast;
			}
		}
		
	}
}