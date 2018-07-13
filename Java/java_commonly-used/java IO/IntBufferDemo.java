
import java.nio.IntBuffer;
import java.nio.ByteBuffer;
public class IntBufferDemo {
	public static void main(String[] arg) {
		IntBuffer ibuf = IntBuffer.allocate(10);
		//ByteBuffer ibuf = ByteBuffer.allocateDirect(10); ///3333  FloatBuffer
		IntBuffer buf1 = null; //   1111111
		System.out.println("\nIntBuffer position  "+ ibuf.position() + "  IntBuffer limit  " + ibuf.limit() + "  IntBuffer capacity  "  + ibuf.capacity());

		//int[] temp = {6,7,8};
		//ibuf.put(5);
		//ibuf.put(temp);
		for(int i = 0; i<ibuf.capacity(); i++){  //   1111111
			ibuf.put(i*2+1);//   1111111
		}//   1111111
		System.out.println("\nposition  "+ibuf.position()+"  limit  "+ibuf.limit()+"  capacity  "+ibuf.capacity());
		ibuf.flip();  //   1111111
		System.out.println("\naafter flip() position  "+ibuf.position()+"  limit  "+ibuf.limit()+"  capacity  "+ibuf.capacity());
		while(ibuf.hasRemaining()){//   1111111
			int x = ibuf.get();//   1111111
			System.out.print(x+ "  ");//   1111111
		}//   1111111

		ibuf.position(2); //   1111111
		ibuf.limit(6); //   1111111
		System.out.println("\nbefore slice() position  "+ibuf.position()+"  limit  "+ibuf.limit()+"  capacity  "+ibuf.capacity()+"\n");
		
		buf1 = ibuf.slice(); //   1111111
		//buf1 = ibuf.asReadOnlyBuffer(); ////2222
		for(int i = 0; i < buf1.capacity(); i++){
			buf1.put(i*2);
		}
		
		System.out.println("\nbefore flip() position  "+ibuf.position()+"  limit  "+ibuf.limit()+"  capacity  "+ibuf.capacity()+"\n");
		ibuf.flip();
		System.out.println("\nafter flip() position  "+ibuf.position()+"  limit  "+ibuf.limit()+"  capacity  "+ibuf.capacity()+"\n");
		
		ibuf.limit(ibuf.capacity()); //   1111111
		System.out.println("\nposition  "+ibuf.position()+"  limit  "+ibuf.limit()+"  capacity  "+ibuf.capacity()+"\n");

		while(ibuf.hasRemaining()){
			int x = ibuf.get();
			System.out.print(x+ "  ");
		}
		System.out.println("\n end position  "+ibuf.position()+"  limit  "+ibuf.limit()+"  capacity  "+ibuf.capacity()+"\n");
	}
}
