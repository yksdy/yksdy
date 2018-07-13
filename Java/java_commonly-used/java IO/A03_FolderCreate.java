import java.io.File;
import java.io.IOException;

public class A03_FolderCreate{
	public static void main(String [] args){
		File f = new File("F:"+File.separator+"java_test");
		String[] list = f.list();
		for(String s:list){
			if(f.isDirectory())
				System.out.println("@@@Folder name is: "+s);
			else 
				System.out.println("###File name is: "+s);
		}
		File[] listFile = f.listFiles();
		for(File fl:listFile){
			if(fl.isDirectory())
				System.out.println("$$$Folder name is: "+fl);
			else 
				System.out.println("%%%File name is: "+fl);
		}
	}
}

