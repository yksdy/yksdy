/**

public static Runtime getRuntime()
public long freeMemory()
public long maxMemoty()
public void gc()
public Process exec(String command)
**/
public class A02_RuntimeDemo{
	public static void main(String[] args){
		Runtime run = Runtime.getRuntime();
		System.out.println("JVM max memory is: "+ run.maxMemory());
		System.out.println("JVM free memory is: "+ run.freeMemory());

		String str ="I'm bad!";
		for(int i=0; i<10000; i++){
			str += i;
		}

		System.out.println(" 1000 times JVM free memory is: "+ run.freeMemory());
		run.gc();
		System.out.println("after gc JVM free memory is: "+ run.freeMemory());
	}
}

