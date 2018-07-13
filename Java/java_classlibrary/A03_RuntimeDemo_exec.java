/**
public Process exec(String command)

Process -->destroy()
**/
public class A03_RuntimeDemo_exec{
	public static void main(String[] args){
		Runtime run = Runtime.getRuntime();
		Process p = null;

		try{
			p = run.exec("Notepad.exe");
		}catch(Exception e){
			e.printStackTrace();
		}
		try{
			Thread.sleep(5000);
		}catch(Exception e){
			e.printStackTrace();
		}
		p.destroy();
	}
}
