/*
20170629
*/

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
public class A16_Merge {
    public ListNode Merge(ListNode list1,ListNode list2) {
		ListNode root = new ListNode(0);
        ListNode m = root;
        while(list1!=null && list2!=null){
			if(list1.val<list2.val){
				root.next = list1;
				list1=list1.next;
			}else{
				root.next = list2;
				list2=list2.next;
			}
			root=root.next;
		}
		if(list1==null){
			root.next=list2;
		}
		if(list2==null){
			root.next=list1;
		}
		return m.next;
    }
	public static void main(String[] args){
		ListNode list11 = new ListNode(2);
		ListNode list12 = new ListNode(3);
		list11.next =list12;
		ListNode list13 = new ListNode(6);
		list12.next =list13;

		ListNode list21 = new ListNode(1);
		ListNode list22 = new ListNode(3);
		list21.next =list22;
		ListNode list23 = new ListNode(4);
		list22.next =list23;
		ListNode list24 = new ListNode(8);
		list23.next =list24;
		A16_Merge mer = new A16_Merge();
		ListNode root = mer.Merge(list11,list21);
		while(root!=null){
			System.out.print(root.val+"  ");
			root=root.next;
		}
		System.out.println();
	}
}