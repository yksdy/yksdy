public class SwapTest{
	public static void main(String[] args){
		SwapTest s = new SwapTest(56,123);
		s.swap();
		System.out.println(s.m+"  "+s.n);
	}
	public int m;
	public int n;
	public SwapTest(int m, int n){
		this.m=m;
		this.n=n;
	}
	public void swap(){
		int x = n;
		n=m;
		m=x;
	}
}