import java.util.*;
/*
20170708
poll
offer
peek
*/
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
public class A04_reConstructBinaryTree{

	public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
		int i=0;
		TreeNode root = new TreeNode(pre[0]);
	//	root.val = pre[0];
		while( i<in.length){
			if(pre[0]==in[i]){
				break;
			}
			i++;
		}
		if(i>0)
			root.left=reConstruct(pre,1,i+1,in,0,i);
		else
			root.left=null;
		if(i+1<in.length&&i+1<pre.length)
			root.right=reConstruct(pre,i+1,pre.length,in,i+1,in.length);
		else
			root.right=null;
		return root;
    }
	public TreeNode reConstruct(int[] pre,int pi,int pj,int[] in,int ii, int ij){
		int i = 0;
		TreeNode root = new TreeNode(pre[pi]);
		//root.val = pre[pi];
		while( i<ij){
			if(pre[pi]==in[i+ii]){
				break;
			}
			i++;
		}
		if(i>0)
			root.left=reConstruct(pre,pi+1,i+1+pi,in,ii,ii+i);
		else
			root.left=null;
		if(ii+i+1<ij&&pi+i+1<pj)
			root.right=reConstruct(pre,pi+i+1,pj,in,ii+i+1,ij);
		else
			root.right=null;
		return root;
	}
	public static void main(String[] args){
		A04_reConstructBinaryTree bt = new A04_reConstructBinaryTree();
		int[] pre ={1,2,4,7,3,5,6,8};
		int[] in ={4,7,2,1,5,3,8,6};
	//	int[] pre ={1,2,3,4};
	//	int[] in ={4,3,2,1};
		TreeNode r = bt.reConstructBinaryTree(pre,in);
		LinkedList<TreeNode> ll = new LinkedList<TreeNode>();
		if(r!=null){
			ll.offer(r);
		}
		TreeNode nlast = ll.peek();
		TreeNode last = nlast;
		while(ll.size()>0){
			TreeNode temp = ll.poll();
			if(temp.left!=null){
				ll.offer(temp.left);
				last=temp.left;
			}
			if(temp.right!=null){
				ll.offer(temp.right);
				last=temp.right;
			}
			System.out.print(temp.val+" ");
			if(nlast==temp){
				System.out.println();
				nlast=last;
			}
		}
	}
}
