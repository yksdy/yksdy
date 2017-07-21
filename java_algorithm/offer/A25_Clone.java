
/*
20170709
*/
class RandomListNode {
    int label;
    RandomListNode next = null;
    RandomListNode random = null;

    RandomListNode(int label) {
        this.label = label;
    }
}

public class A25_Clone {
    public RandomListNode Clone(RandomListNode pHead)
    {
        if(pHead==null){
            return null;
        }
        RandomListNode p =pHead.next;
        RandomListNode root =new RandomListNode(pHead.label);
        RandomListNode r=root;
        while(p!=null){
            RandomListNode temp =new RandomListNode(p.label);
            r.next=temp;
            r=r.next;
            p=p.next;
        }
		p=pHead;
		r=root;
		while(p!=null){
			RandomListNode temp =p.random;
			if(temp==null){
				r.random =null;
			}else{
				RandomListNode x =root;
				while(x!=null&&temp.label!=x.label){
					x=x.next;
				}
				r.random =x;
			}
			p=p.next;
			r=r.next;
		}
        return root;
        
    }
	public static void main(String[] args){
		RandomListNode head0 = new RandomListNode(10);
		RandomListNode head1 = new RandomListNode(11);
		RandomListNode head2 = new RandomListNode(12);
		RandomListNode head3 = new RandomListNode(13);
		RandomListNode head4 = new RandomListNode(14);
		head0.next=head1;
		head1.next=head2;
		head2.next=head3;
		head3.next=head4;
		head0.random=head2;
		head1.random=head3;
		head2.random=head0;
		head3.random=head1;
		head4.random=head3;
		A25_Clone c = new A25_Clone();
		RandomListNode root = c.Clone(head0);
		while(head0!=null){
			System.out.println("head0.label = "+head0.label);
			System.out.println("root.label = "+root.label);
			System.out.println("head0.random.label = "+head0.random.label);
			System.out.println("root.random.label = "+root.random.label);
			if(head0.label!=root.label||head0.random.label!=root.random.label){
				System.out.println("False");
				break;
			}
			head0=head0.next;
			root=root.next;
		}
		System.out.println("True");
	}
}