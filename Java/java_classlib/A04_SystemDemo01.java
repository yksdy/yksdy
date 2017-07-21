
public class A04_SystemDemo01{
	public static void main(String[] args){
		long startTime = System.currentTimeMillis();
		int sum = 0;
		for(int i=0;i<3000000;i++){
			sum += i;
		}
		long endTime = System.currentTimeMillis();
		System.out.println("time: "+(endTime - startTime)+"ms");
		System.out.println("time: "+(endTime - startTime)/1000+"s");
		System.getProperties().list(System.out);
		
	}
}
