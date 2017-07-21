import java.util.*;
import java.text.*;
public class A13_TimerTaskDemo01{
	public static void main(String[] args){
		Timer t = new Timer();
		MyTask mt = new MyTask();
		t.schedule(mt,1000,2000);
	}
}
class MyTask extends TimerTask{
	public void run(){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
		System.out.println(sdf.format(new Date()));
	}
}
