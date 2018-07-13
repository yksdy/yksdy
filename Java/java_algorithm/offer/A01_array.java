import java.util.*;
public class A01_array{

    public static boolean Find(int target, int [][] array) {
		int m=array.length;
        int n=array[0].length;
		for(int i=0,j=(n-1);i<m&&j>=0;){
			//for(int j=(n-1);j>=0;j--){
				if(target<array[i][j]){
					--j;
				}else if(target>array[i][j]){
					++i;
				}else{
					return true;
				}
			
		}
		return false;
    }
	public static String replaceSpace(StringBuffer str) {
    	return null;
    }
	public static void main(String[] args){
		//Calendar calendar1 = new GregorianCalendar();
		//System.out.println(calendar1.get(Calendar.MILLISECOND));
		long start =System.currentTimeMillis();
		System.out.println(start);
		int[][] array={{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
		for(int i=10000;i>0;i--){
		for(int[] x:array){
			for(int y:x){
				System.out.println(y);
			}
		}	
		}
		System.out.println(Find(8,array));
		int m=array.length;
        int n=array[0].length;
		System.out.println(m);
		System.out.println(n);
		
		long end =System.currentTimeMillis();
		System.out.println(end);
		System.out.println(end-start);
		//Calendar calendar2 = new GregorianCalendar();
		//System.out.println(calendar2.get(Calendar.MILLISECOND));
	}
}