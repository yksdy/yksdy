public class A01_CodeBlock {
	public static void main(String[] args){
		System.out.println(" 1 this is main");
		new A01_CodeBlock();
		new A01_CodeBlock();
	}
	public A01_CodeBlock(){
		System.out.println(" 3 this is code constructor");
	}
	static {
		System.out.println(" 0 this is static code block");
	}
	{
		System.out.println(" 2 this is code block out of constructor");
	}
}
