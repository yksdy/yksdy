
public class A06_RecursionMouseMazeA {
	int[][] maze=  {{2,2,2,2,2,2,2},
					{2,0,0,2,2,2,2},
					{2,2,0,0,0,0,2},//  2	
					{2,0,0,2,2,0,2},
					{2,2,0,0,0,0,2},
					{2,2,0,0,2,0,2},
					{2,2,2,0,0,0,2},//  6
					{2,2,2,2,2,2,2}};
	boolean succes ;
	int startI=1;
	int startJ=1;
	int endI=6;
	int endJ=5;
	public A06_RecursionMouseMazeA(){
		succes = false;
	  
	  for(int i=0;i<maze.length;i++){
	  	for(int j=0;j<maze[i].length;j++){
			System.out.print(maze[i][j]+" ");
		}
		System.out.println(" ");		
	  }
	  
	}
	public static void main(String[] args){
		new A06_RecursionMouseMazeA().pri();
	}
	public void pri(){
		find(startI,startJ);
		if(succes==true){
			  for(int i=0;i<maze.length;i++){
			  	for(int j=0;j<maze[i].length;j++){
					if(maze[i][j]==2){
						System.out.print("#");
					}
					if(maze[i][j]==1){
						System.out.print("^");
					}
					if(maze[i][j]==0){
						System.out.print("$");
					}
					
				}
				System.out.println(" ");		
			  }
		}
	}
	public void find(int i, int j){
		maze[i][j]=1;
		if(i==endI&&j==endJ){
			succes = true;
		}
		if(succes==false&&maze[i-1][j]==0){
			find(i-1,j);
		}
		if(succes==false&&maze[i][j+1]==0){
			find(i,j+1);
		}
		if(succes==false&&maze[i+1][j]==0){
			find(i+1,j);
		}
		if(succes==false&&maze[i][j-1]==0){
			find(i,j-1);
		}
		if(succes==false){
			maze[i][j]=0;
		}
	}
}
