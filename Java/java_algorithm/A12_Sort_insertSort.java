import java.util.*;
/**
20150108
sort
non-recursion sort
*/ 
public class A12_Sort_insertSort{
	public static void main(String[] args){
		A12_Sort_insertSort s = new A12_Sort_insertSort();
	//	s.input();
		s.print();
		s.insertSort();
		s.print();
	}
	int[] a = new int[1000];
	int length;
	A12_Sort_insertSort(){
		a[0] =5;
		a[1] =2;
		a[2] =3;
		a[3] =43;
		a[4] =65;
		a[5] =23;
		a[6] =456;
		a[7] =123;
		a[8] =58;
		a[9] =11;
		length =10;
		
	}
	public void input(){
		System.out.println("\n-------------------input-start---end for 0--------------\n");
		Scanner scan = new Scanner(System.in);
		int i=0;
		a[i]=scan.nextInt();
		while(a[i]!=0&&scan.hasNextInt()){
			i++;
			a[i]=scan.nextInt();	
		}
		length = i;
		System.out.println("length=  "+length);
	}
	public void insertSort(){
		for(int i=1;i<length;i++){
			for(int j=i;j>0;j--){
				if(compare(j-1,j))
					break;
			}
		}
	}
	public boolean compare(int x, int y){
		int z=0;
		if(a[x]>a[y]){
			z=a[x];
			a[x]=a[y];
			a[y]=z;
			return false;
		}
		else
			return true;
	}
	public void print(){
		int i = 0;
		System.out.println("------------------------------------------------------------------\n");
		while(a[i]!=0){
			System.out.print(a[i]+" ");
			i++;		
		}
		System.out.println("\n------------------------------------------------------------------\n");
	}
	
}

