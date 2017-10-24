public class A65_hasPath {
    public boolean hasPath(char[] matrix, int rows, int cols, char[] str)
    {
		if(str.length>rows*cols) return false;
		for(int x=0;x<str.length;x++){
			char a = str[x];
			
		}
    }
	public static void main(String[] args){
		char[] m = {a,b,c,d,e,f,g,h,i};
		char[] str = {a,b,e,h};
		A65_hasPath hp = new A65_hasPath();
		System.out.println(hp.hasPath(m,3,3,str));
	}
}