/**
System.arraycopy();
**/

public class Test{
	public static void main(String[] args){
		int[] aFrom = {1,3,5,36,22};
		int[] aTo = new int[3];
		System.arraycopy(aFrom,1,aTo,0,2);
		System.out.println("aTo[0]="+aTo[0]+" aTo[1] = "+ aTo[1]+" aTo[2] = "+aTo[2]);
	}
}

