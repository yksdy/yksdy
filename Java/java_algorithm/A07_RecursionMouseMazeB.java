public class A07_RecursionMouseMazeB{
	static int[][] maze=  {{2,2,2,2,2,2,2},
					{2,0,0,2,2,2,2},
					{2,2,0,0,0,0,2},//  2	
					{2,0,0,2,2,0,2},
					{2,2,0,0,0,0,2},
					{2,2,0,0,2,0,2},
					{2,2,2,0,0,0,2},//  6
					{2,2,2,2,2,2,2}};
	static int startI=1;
	static int startJ=1;
	int endI=6;
	int endJ=5;
	public A07_RecursionMouseMazeB(){
	  
	  for(int i=0;i<maze.length;i++){
	  	for(int j=0;j<maze[i].length;j++){
			System.out.print(maze[i][j]+" ");
		}
		System.out.println(" ");		
	  }
	  
	}
	public static void main(String[] args){
		A07_RecursionMouseMazeB a = new A07_RecursionMouseMazeB();
		a.find(startI,startJ);
		System.out.println("############");	
		  for(int i=0;i<maze.length;i++){
	  	for(int j=0;j<maze[i].length;j++){
			System.out.print(maze[i][j]+" ");
		}
		System.out.println(" ");		
	  }
	}

	public void find(int i, int j){
		maze[i][j]=1;
		
		if(i==endI&&j==endJ){
			 for(int x=0;x<maze.length;x++){
			  	for(int y=0;y<maze[x].length;y++){
					if(maze[x][y]==2){
						System.out.print("#");
					}
					if(maze[x][y]==1){
						System.out.print("^");
					}
					if(maze[x][y]==0){
						System.out.print("$");
					}			
				}
				System.out.println(" ");		
			  }
			System.out.println(" ");
		}
		
		if(maze[i-1][j]==0){
			find(i-1,j);
		}
		if(maze[i][j+1]==0){
			find(i,j+1);
		}
		if(maze[i+1][j]==0){
			find(i+1,j);
		}
		if(maze[i][j-1]==0){
			find(i,j-1);
		}
		maze[i][j]=0;
	}
}

