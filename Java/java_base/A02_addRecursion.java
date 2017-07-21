public class A02_addRecursion{
	public static void main(String[] args){
		System.out.println(add(6));
	}
	public static int add(int x){
		if(x==1){
			return 1;
		}else{
			return sum(x)+add(x-1);
		}
	}
	public static int sum(int y){
		if(y==1){
			return 1;
		}else{
			return y*sum(y-1);
		}
	}
}