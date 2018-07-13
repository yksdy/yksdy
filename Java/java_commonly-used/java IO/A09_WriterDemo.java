
import java.io.File;
import java.io.Writer;
import java.io.FileWriter;
public class A09_WriterDemo{
	public static void main(String[] args) throws Exception{
		File f = new File("test.txt");
		Writer w = new FileWriter(f);
		w.write("hahaha\r\nabc  \nohhhh ");
		w.close();
	}
}
