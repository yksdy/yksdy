/**
public static void exit(int)
public static void gc()
public static long currentTimeMillis()
public static void arraycopy(Object ,int pos, Object, int pos, int length)
public static Properties getProperties()
public static String getProperty(String key)
**/
public class A05_SystemDemo{
	public static void main(String[] args){
		long startTime = System.currentTimeMillis();
		//System.getProperties().list(System.out);
		System.out.println("os.name : @"+System.getProperty("os.name"));
		for(long i=0; i<500000000; i++){
		}
		long endTime= System.currentTimeMillis();
		System.out.println("use time is: "+(endTime-startTime));
	}
}
