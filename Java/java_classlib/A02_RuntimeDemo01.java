
public class A02_RuntimeDemo01 {
	public static void main(String[] args){
		Runtime run = Runtime.getRuntime();
		Process p = null;
		System.out.println("maxMemory: "+run.maxMemory());
		System.out.println("freeMemory: "+run.freeMemory());
		String str = "abc";
		for(int i=0;i<1444;i++){
			str += i;
		}
		System.out.println("freeMemory: "+run.freeMemory());
		run.gc();
		System.out.println("freeMemory: "+run.freeMemory());
		try{
			p = run.exec("notepad.exe");
			Thread.sleep(5000);
			}catch(Exception e){
				e.printStackTrace();
			}
		p.destroy();
	}
}
