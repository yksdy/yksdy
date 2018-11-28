import java.util.*;
public class sort{
	public static void main(String[] args){
		System.out.println("##### Welcom to sort world #####");
		System.out.println("Please select sort mode:");
		System.out.println("\t 1. quick sort");
		System.out.println("\t 2. insert sort");
		System.out.println("\t 3. pop sort");
		System.out.println("\t 4. select sort");
		System.out.println("\t 5. quick sort no recursion");
		System.out.println("\t other. exit");
		System.out.println("-----------------------------");
		System.out.println("The listf is:");
		int[] x ={2,44,323,1,-5,23,134,54};	
		for(int i: x){
			System.out.print(i+"\t");
		}
		System.out.println();
		System.out.println("-----------------------------");
		System.out.println("Please do your select:");
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			if(scan.next().equals("1")){
				System.out.println("1. quick sort");
				quickSort(x,0,x.length-1);
				break;
			}
			else if(scan.next().equals("2")){
				System.out.println("2. insert sort");
				break;
			}
			else if(scan.next().equals("3")){
				System.out.println("3. pop sort");
				break;
			}
			else if(scan.next().equals("4")){
				System.out.println("4. select sort");
				break;
			}
			else if(scan.next().equals("5")){
				System.out.println("5. quick sort no recursion");
				break;
			}
			else{
				System.out.println("exit");
				System.exit(1);
			}
		}
		for(int i: x){
			System.out.print(i+"\t");
		}
		System.out.println();
	}
	public static void quickSort_no_recursion(int[] a){
		
	}
	public static void quickSort(int[] a,int m, int n){
		int start = m;
		int end = n;
		boolean flag=true;
		for(int i=m;start!=end;i++){
			if(flag){
				if(a[start]>a[end]){
					int w = a[start];
					a[start]=a[end];
					a[end]=w;
					start++;
					flag=false;
				}else{
					end--;
				}
				
			}else{
				if(a[start]>a[end]){
					int w = a[start];
					a[start]=a[end];
					a[end]=w;
					end--;
					flag=true;
				}else{
					start++;
				}
				
			}
		}
		if(m<start-1){
			quickSort(a,m,start-1);
		}
		if(n>start+1){
			quickSort(a,start+1,n);
		}
	}
}