
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
	public ArrayList<Integer> list1 = new ArrayList<Integer>();
	public ArrayList<Integer> list2 = new ArrayList<Integer>();
    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        if(root1==null || root2==null){
			return false;
        }
		midSearch(root1,list1);
		midSearch(root2,list2);
		String str1 = list1.toString();
		String str11 = str1.substring(1,str1.length()-1);
		String str2 = list2.toString();
		String str22 = str2.substring(1,str2.length()-1);
		System.out.println(str1);
		System.out.println(str11);
		System.out.println(str2);
		System.out.println(str22);
		System.out.println(str1.indexOf(str2));
		System.out.println(str2.indexOf(str1));
		System.out.println(str11.indexOf(str22));
		System.out.println(str22.indexOf(str11));
		if(str11.indexOf(str22)>=0||str22.indexOf(str11)>=0)
		{
			return true;
		}
		else
		{
			return false;
		}
    }
	public void midSearch(TreeNode root, ArrayList<Integer> list){
		if(root==null){
			return;
		}
		midSearch(root.left,list);
		list.add(root.val);
		midSearch(root.right,list);
	}
	public void temp(TreeNode root11){
	//	list1 = new ArrayList<Integer>();
	//	list2 = new ArrayList<Integer>();
		this.midSearch(root11,list1);
		for(int x:list1){
			System.out.print(x+" ");
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
		TreeNode root26 = new TreeNode(8);
		TreeNode root27 = new TreeNode(7);
		root23.left = root26;
		root23.right = root27;
		A17_HasSubtree tree = new A17_HasSubtree();
		System.out.println(tree.HasSubtree(root11,root23));

	//	tree.temp(root11);
		
	}
}

