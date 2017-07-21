/**
20170709
*/
class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}

public class A26_Convert {
    public TreeNode Convert(TreeNode pRootOfTree) {
        if(pRootOfTree==null){
			return null;
		}
		TreeNode p = pRootOfTree;
		while(p!=null){
			TreeNode temp = p.right;
			if(temp == null) break;
			TreeNode left = temp.left;
			if(left == null) break;
			while(left.left!=null){
				left=left.left;
			}
			p.right=left;
			left.right=temp;
			left.left=p;
			p=temp;
		}
		p = pRootOfTree;
		while(p!=null){
			TreeNode temp = p.left;
			if(temp == null) break;
			TreeNode right = temp.right;
			if(right == null) break;
			while(right.right!=null){
				right=right.right;
			}
			p.left=right;
			right.left=temp;
			right.right=p;
			p=temp;
		}
		p = pRootOfTree;
		TreeNode temp1 = pRootOfTree;
		while(p!=null){
			temp1 = p;
			p=p.right;
			if(p!=null&&p.left==null){
				p.left=temp1;	
			}
		}
		p = pRootOfTree;
		TreeNode temp2 = pRootOfTree;
		while(p!=null){
			temp2 = p;
			p=p.left;
			if(p!=null&&p.right==null){
				p.right=temp2;	
			}
			
		}
		return temp2;
    }

	public static void main(String[] args){
		TreeNode root1 = new TreeNode(6);
		TreeNode root11 = new TreeNode(4);
		TreeNode root12 = new TreeNode(8);
		TreeNode root21 = new TreeNode(3);
		TreeNode root22 = new TreeNode(5);
		TreeNode root23 = new TreeNode(7);
		TreeNode root24 = new TreeNode(9);
		root1.left = root11;
		root1.right = root12;
		root11.left = root21;
		root11.right = root22;
		root12.left = root23;
		root12.right = root24;
		
		A26_Convert c =new A26_Convert();
		TreeNode p = c.Convert(root1);
		TreeNode right = p;
		TreeNode left = p;
		while(right!=null){
			System.out.print(right.val+" ");
			if(right.right==null){
				left=right;
			}
			right=right.right;
		}
		System.out.println();
		while(left!=null){
			System.out.print(left.val+" ");
			left=left.left;
		}
		
		
	}
}