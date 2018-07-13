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
public class A15_ReverseList {
    public ListNode ReverseList(ListNode head) {
		if(head==null){
			return null;
		}
		ListNode temp =null;
		ListNode tempNext = null;
		while(head!=null){
			temp=head.next;
			head.next=tempNext;
			tempNext=head;
			head=temp;
		}
		return tempNext;
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
		A15_ReverseList fk = new A15_ReverseList();
		ListNode end = fk.ReverseList(ln);
		while(end!=null){
			System.out.println(end.val);
			end=end.next;
		}
		
		
		
	}
}