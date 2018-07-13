/**
Timer
TimerTask

schedule()
**/
import java.util.Timer;
import java.util.TimerTask;
import java.util.Date;
import java.text.SimpleDateFormat;
public class A18_TimerDemo{
	public static void main(String[] args){
		Timer t = new Timer();
		MyTimerTask ttask = new MyTimerTask();
		t.schedule(ttask,1000,2000);
	}
}
class MyTimerTask extends TimerTask{
	public void run(){
		//SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");	
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss:sss");
		System.out.println("current timer is: "+sdf.format(new Date()));
	}
}
