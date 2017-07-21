/*
20170629
*/

import java.util.ArrayList;
import java.util.*;
public class A19_printMatrix {
    public ArrayList<Integer> printMatrix(int [][] matrix) {
		int x1 = 0;
		int x2 = matrix[0].length-1;
		int x3 = matrix.length-1;
		int x4 = 0;
		System.out.println("matrix.length= "+matrix.length+" matrix[0].length= "+matrix[0].length);
	//	System.out.println("x1= "+x1+" x2= "+x2+" x3= "+x3+" x4= "+x4);
		ArrayList<Integer> al = new ArrayList<Integer>();
		if(matrix==null)
			return null;
		
		while((x1<x3&&x4!=x2) || (x4<x2&&x1!=x3)){
			for(int i=x4;i<x2;i++){
				al.add(matrix[x1][i]);
			}
			for(int i=x1;i<x3;i++){
				al.add(matrix[i][x2]);
			}
			
			for(int i=x2;i>x4;i--){
				al.add(matrix[x3][i]);
			}
			for(int i=x3;i>x1;i--){
				al.add(matrix[i][x4]);
			}
			System.out.println("x1= "+x1+" x2= "+x2+" x3= "+x3+" x4= "+x4);
			++x1;
			++x4;
			if(x2>x4)
				--x2;
			if(x3>x1)
				--x3;
			
		}
		if(matrix.length%2==1&&matrix[0].length%2==1){
			if(x3==x1&&x2!=x4){
				for(int i=x4;i<=x2;i++){
					al.add(matrix[x1][i]);
				}
			}
			else if(x2==x4){
				for(int i=x1;i<=x3;i++){
					al.add(matrix[i][x2]);
				}
			}
		}
		
		return al;
    }
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int m = s.nextInt();
		int n = s.nextInt();
		int[][] matrix = new int[m][n];
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				matrix[i][j] = s.nextInt();
			}
		}

		A19_printMatrix pm = new A19_printMatrix();
		ArrayList<Integer> al = pm.printMatrix(matrix);
		for(int x:al){
			System.out.print(x+" ");
		}
		System.out.println();
	}
}