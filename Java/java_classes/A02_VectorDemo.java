/**
Collection
List
Vector   // �ϵ�����,  ͬ������, �̰߳�ȫ
1/ add(E);
addAll(Collection<E>);
2/ get
3/ set
4/ remove(int)
    remove(E)
5/ indexOf(E)
6/ subList(int,int)
7/ size()
8/ toArray(new E[]{})
     toArray() //���� Object
9/ isEmpty()
10 /contains(E)

**/
import java.util.*;
public class A02_VectorDemo{
	public static void main(String[] args){
		//add, addElement
		//size
		//get
		List<String> list =null;
		list = new Vector<String>();
		Vector<String> v = new Vector<String>();
		list.add("Vector");
		list.add(0,"Hello");
		//list.addElement(1,"Element"); //error ��̬
		v.addElement("Element"); 
		v.add("vector.add");		
		System.out.println(v.get(0));
		System.out.println(v.get(1));
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
	}
}
