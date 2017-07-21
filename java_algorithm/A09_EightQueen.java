public class A09_EightQueen {
	public static void main(String[] args) {
		A09_EightQueen eq = new A09_EightQueen();
		eq.eightQueen(0);
		System.out.println("count = "+gCount);
		for(int i=0;i<8;i++){
			System.out.print(gEightQueen[i]+" ");
		}
	}
	static int[] gEightQueen = new int[8];
	static int gCount = 0;
	public void print(){
		for(int i=0;i<8;i++){
			for(int j=0;j<gEightQueen[i];j++){
				System.out.print("^ ");
			}
			System.out.print("# ");
			for(int j=gEightQueen[i]+1;j<8;j++){
				System.out.print("^ ");
			}
			System.out.println("");
		}
		System.out.println("*****************");
	}
	public boolean checkPosValid(int x, int y){
		int row;
		int col;
		for(row=0;row<x;row++){
			col=gEightQueen[row];
			if((col==y)||((col-row)==(y-x))||((col+row)==(x+y)))
				return false;
		}
		return true;
	}
	public void eightQueen(int x){
		for(int y=0; y<8; y++){
			if(checkPosValid(x,y)){
				gEightQueen[x]=y;
				if(7==x){
					gCount++;
					print();
				}
				else{
					eightQueen(x+1);
				}
				gEightQueen[x]=0;
			}
		}
	}
}
