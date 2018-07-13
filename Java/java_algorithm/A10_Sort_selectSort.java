import java.util.*;
/**
20150108
sort
non-recursion sort
*/ 

public class A10_Sort_selectSort{
	public static void main(String[] args){
		A10_Sort_selectSort s = new A10_Sort_selectSort();
	//	s.input();
		s.print();
		s.selectSort();
		s.print();
	}
	int[] a = new int[1000];
	int length;
	A10_Sort_selectSort(){
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
		//	System.out.println(" i ="+ i+" a[i]= "+a[i]);
			i++;
			a[i]=scan.nextInt();	
		//	System.out.println("i++ i ="+ i+" a[i]= "+a[i]);
		}
		length = i;
		System.out.println("length=  "+length);
		//System.out.println("\n%%%%%%%%%%%%<<<---input-end-->>>%%%%%%%%");
	}
	public void selectSort(){
		for(int i=0;i<(length-1);i++){
			for(int j=(i+1);j<length;j++){
				compare(i,j);
			}
		}
	}
	public void compare(int x, int y){
		int z=0;
		if(a[x]>a[y]){
			z=a[x];
			a[x]=a[y];
			a[y]=z;
		}
		
	}
	public void print(){
		int i = 0;
		System.out.println("------------------------------------------------------------------\n");
		//System.out.println("\n\n\n#########<<<--a[]--->>>>###################\n");
		while(a[i]!=0){
			//System.out.print(a[i]+" i= "+i+"   ");
			System.out.print(a[i]+" ");
			i++;
			if(i%5==0){
		//		System.out.println("");
			}		
		}
		//System.out.println("\n\n#########<<<--a[]--->>>>###################");
		System.out.println("\n------------------------------------------------------------------\n");
	}
	
}
