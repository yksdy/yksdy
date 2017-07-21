public class A02_RuntimeDemo02{
	public static void main(String[] args){
		Runtime run = Runtime.getRuntime();
		System.out.println(run.maxMemory());
		System.out.println(run.freeMemory());
		String str = null;
		for(int i=0;i<30000;++i){
			str = str+i;
		}
		System.out.println(run.freeMemory());
		run.gc();
		System.out.println(run.freeMemory());
		Process p = null;
		try{
			p = run.exec("notepad.exe");
			Thread.sleep(5000);
		}catch(Exception e){
			e.printStackTrace();
		}
		p.destroy();	
	}
}