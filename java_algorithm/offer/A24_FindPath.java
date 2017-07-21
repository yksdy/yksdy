import java.util.ArrayList;
/**
20170706
*/

class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}

public class A24_FindPath {
	ArrayList<ArrayList<Integer>> all = new ArrayList<ArrayList<Integer>>();
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
	//	ArrayList<Integer> al = new ArrayList<Integer>();
		this.FindPathBFS(root,target,new ArrayList<Integer>());
		return all;
    }
	
	public void FindPathBFS(TreeNode root,int target,ArrayList<Integer> al){
		if(root==null){
			System.out.println("@@@@root==null");
			return ;
		}	
		int x=target-root.val;
	//	ArrayList<Integer> al = l;
			
		if(x>0){
			al.add(root.val);
			System.out.println("x= "+x);
			for(int y:al){
				System.out.print(y+" ");
			}
			System.out.println("-----");
			FindPathBFS(root.left,x,al);
			System.out.println("+++++");
			if(root.left!=null&&root.left.val==al.get(al.size()-1)){
				al.remove(al.size()-1);
			}
			FindPathBFS(root.right,x,al);
			if(root.right!=null&&root.right.val==al.get(al.size()-1)){
				al.remove(al.size()-1);
			}
		}
		//else if(x==0)
		else if(x==0&&root.left==null&&root.right==null){
			al.add(root.val);
			ArrayList<Integer> temp = new ArrayList<Integer>();
			for(int y:al){
				temp.add(y);
			}
			all.add(temp);
			for(ArrayList<Integer> ll:all){
				for(int z:ll){
					System.out.print(z+" ");
				}
				System.out.println("=====");
			}
		//	al = new ArrayList<Integer>();
			System.out.println("\n########");
		}
		else if(x<0){
			System.out.println("$$$$$");
		}
		// return all;
		
	}
	public static void main(String[] args) {
		TreeNode root11 = new TreeNode(1);
		TreeNode root12 = new TreeNode(3);
		TreeNode root13 = new TreeNode(2);
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
		TreeNode root18 = new TreeNode(2);
		TreeNode root19 = new TreeNode(1);
		TreeNode root110 = new TreeNode(1);
		root14.left = root18;
		root15.left = root19;
		root16.left = root110;
		//ArrayList<ArrayList<Integer>> all = new ArrayList<ArrayList<Integer>>();
		A24_FindPath fp = new A24_FindPath();
		ArrayList<ArrayList<Integer>> mall = fp.FindPath(root11,10);
		for(ArrayList<Integer> mal:mall){
			for(int x:mal){
				System.out.print(x+" ");
			}
			System.out.println();
		}
		
	}
}

