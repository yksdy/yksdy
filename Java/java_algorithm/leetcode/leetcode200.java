
public class leetcode200{
	public static void main(String[] args){
		leetcode200 code=new leetcode200();
		char[][] grid={{'1','1','1','1','0'},
		{'1','1','0','1','0'},
		{'1','1','0','0','0'},
		{'0','0','0','0','0'}};
		int n = code.numIslands(grid);
		System.out.println(n);
	}	
	public void help(char[][] a,int x, int y){
        if((x<0)||(y<0)||(x>=a.length)||(y>=a[0].length)||(a[x][y]!='1')){
            return;
        }
        a[x][y]='0';
        help(a,x-1,y);
        help(a,x+1,y);
        help(a,x,y-1);
        help(a,x,y+1);
    }
    public int numIslands(char[][] grid) {
     int answer =0;
     for(int i=0;i<grid.length;i++){
         for(int j=0;j<grid[i].length;j++){
             if(grid[i][j]=='1'){
                 help(grid,i,j);
                 answer++;
             }
         }
     }
     return answer;
    }
}