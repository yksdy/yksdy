
import java.io.File;
import java.io.IOException;
public class A02_DeleteFile {

//???? file close ,how? or no need ?
	public static void main(String[] args){
		File f = new File("TextFile.txt");
		if(f.exists())
			f.delete();
		else
		{
			try{
				f.createNewFile();
				}catch (Exception e){
					e.printStackTrace();
				}
		}
		
	}
}
