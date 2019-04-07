import java.util.*;
import java.io.*;
public class sort{
	public static void main(String[] args) throws Exception{
		sort s = new sort();
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			String str =scan.next();
			if(str.equals("yes")){
				System.out.println("you input yes\n which sort you want use,please select:\n1/ quick sort\n2/ pop sort\n3/ slect sort\n4/ insert sort\n other exit---------------");
				int i=scan.nextInt();
				switch(i){
					case 1:
					s.sortQuick(0,s.b.length-1,0);
					break;
					case 2:
					s.sortPop(s.b.length);
					break;
					case 3:
					s.sortSelect(s.b.length);
					break;
					case 4:
					s.sortInsert(s.b.length);
					break;
					default:
					System.out.println("bye bye");
					System.exit(0);
					continue;
					//break;
				}
				s.printArray(s.a);
				s.printArray(s.b);
				s.init();
				System.out.println("\n sort end, try other sort, yes or no ?");
				//
			}else if(str.equals("no")){
				System.out.println("you input no!\bye bye");
				System.exit(0);
			}else {
				System.out.println("please input yes or no to restart sort");
			}
		}
		
	}
	public void sortQuick(int i,int j,int k){
		int m=i;
		int n=j;
		while(i!=j){
			if(i==k){
				if(b[k]>b[j]){
					int x=a[k];
					b[k]=b[j];
					b[j]=x;
					++i;
					k=j;
				}else{
					--j;
				}
			}else if(j==k){
				if(b[i]>b[k]){
					int x=b[k];
					b[k]=b[i];
					b[i]=x;
					--j;
					k=i;
				}else{
					++i;
				}
				
			}
		}
		if(m<k-1)
			sortQuick(m,k-1,m);
		if(k+1<n)
			sortQuick(k+1,n,k+1);
	}
	public void sortPop(int n){
		for(int i=0;i<n;++i){
			for(int j=0;j<n-i-1;++j){
				if(b[j]>b[j+1]){
					int x=b[j];
					b[j]=b[j+1];
					b[j+1]=x;
				}
			}
		}
	}
	public void sortSelect(int n){
		for(int i=0;i<n-1;++i){
			for(int j=i+1;j<n;++j){
				if(b[i]>b[j]){
					int x=b[i];
					b[i]=b[j];
					b[j]=x;
				}
			}
		}
	}
	public void sortInsert(int n){
		for(int i=1;i<n;++i){
			for(int j=i;j>0;--j){
				if(b[j]<b[j-1]){
					int x = b[j];
					b[j]=b[j-1];
					b[j-1]=x;
				}else{
					//System.out.println("i="+i);
					break;
				}
			}
		}
	}
	public void init(){
		for(int i=0;i<a.length;++i){
			b[i]=a[i];
		}
	}
	public void swap(int m, int n){
		
	}
	int[] a = {3,4,2,5,6,8,56,335,88,132,1};
	int[] b;
	public sort(){
		b = new int[a.length];
		this.printInfo();
	}
	public void printInfo(){
		System.out.println("Hello, there hava a array,do you want to sort it?\nthe array a and b is:  ");
		printArray(a);
		init();
		printArray(b);
		System.out.println("Please intput yes or no: ");
	}
	public void printArray(int[] x){
		for(int i:x){
			System.out.print(i+"  ");
		}
		System.out.println();
	}
}

//方法
//目标
//练习






























