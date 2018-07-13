/*
20170628
*/
class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
//public class Solution {
public class A14_FindKthToTail {
    public ListNode FindKthToTail(ListNode head,int k) {
		int length = 0;
		ListNode p = head;
		while(p!=null){
			p=p.next;
			++length;
		}
		System.out.println("length= "+length);
		int n=length-k;
		System.out.println("n= "+n);
		if(n<0)
			return null;
		while(n>0){
			head=head.next;
			--n;
		}
		return head;
    }
	public static void main(String[] args){
		ListNode ln = new ListNode(1);
		ListNode ln1 = new ListNode(2);
		ln.next = ln1;
		ListNode ln2 = new ListNode(3);
		ln1.next = ln2;
		ListNode ln3 = new ListNode(4);
		ln2.next = ln3;
		ListNode ln4 = new ListNode(5);
		ln3.next = ln4;
		ListNode ln5 = new ListNode(6);
		ln4.next = ln5;
		A14_FindKthToTail fk = new A14_FindKthToTail();
		System.out.println(fk.FindKthToTail(ln,7).val);
		
		
	}
}