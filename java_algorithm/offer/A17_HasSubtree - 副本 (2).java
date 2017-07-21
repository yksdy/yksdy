
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
		ArrayList<Integer> ar1 = this.MFS(root1,new ArrayList<Integer>());
		ArrayList<Integer> ar2 = this.MFS(root2,new ArrayList<Integer>());
		int a = ar1.indexOf(ar2.get(0));
		if(a>=0){
			for(int i=1;i<ar2.size();i++){
				if(ar1.get(a+i)!=ar2.get(i)){
					return false;
				}
			}
			return true;
		}else{
			return false;
		}
/*
		String str1 = ar1.toString();
		String str2 = ar2.toString();
		String strr1 =str1.substring(1,str1.length()-1);
		String strr2 =str2.substring(1,str2.length()-1);
		System.out.println(strr1);
		System.out.println(strr2);
		*/
    }
	public ArrayList<Integer> MFS(TreeNode root, ArrayList<Integer> list){
		ArrayList<Integer> al = list;
		if(root==null){
			return al;
		}
		MFS(root.left,al);
		al.add(root.val);
		MFS(root.right,al);
		return al;
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

