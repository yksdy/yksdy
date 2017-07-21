public class A11_ComparableDemo02{
	public static void main(String[] args){
		Comparable com = null;
		com = 30;
		System.out.println(com);
		BinaryTree bt = new BinaryTree();
		bt.add(new Student("Jeck",12,8));
		bt.add(new Student("Jeck",12,3));
		bt.add(new Student("Jeck",12,10));
		bt.add(new Student("Jeck",12,9));
		bt.add(new Student("Jeck",12,1));
		bt.add(new Student("Jeck",12,5));
		bt.pri();
	}
}
class Student implements Comparable<Student>{
	private String name;
	private int age;
	private int score;
	public Student(String name,int age,int score){
		this.name = name;
		this.age = age;
		this.score = score;
	}
	public String toString(){
		return name+"\t\t"+ age+"\t\t "+this.score;
	}
	public int compareTo(Student stu){
		if(this.score>stu.score)
			return 1;
		else if(this.score<stu.score)
			return -1;
		else if(this.age<stu.age)
			return 1;
		else 
			return -1;
	}
	
}

class BinaryTree{
	private Node root = null;
	public void add(Student data){
		Node node = new Node(data);
		if(root==null)
			root = node;
		else
			root.addNode(node);
	}
	public void pri(){
		root.printNode();
	}
	class Node{
		private Student data;
		private Node left;
		private Node right;
		public Node(Student data){
			this.data = data;
		}
		public void addNode(Node newNode){
			if(newNode.data.compareTo(this.data)<1){
				if(this.left==null){
					this.left = newNode;
				}
				else{
					this.left.addNode(newNode);
				}	
			}
			if(newNode.data.compareTo(this.data)>=0){
				if(this.right==null){
					this.right = newNode;
				}
				else{
					this.right.addNode(newNode);
				}	
			}
		}
		public void printNode(){
			if(this.left!=null){
				this.left.printNode();
			}
			System.out.print(this.data+"\n");
			if(this.right!=null){
				this.right.printNode();
			}
		}
		
	}
	
}
