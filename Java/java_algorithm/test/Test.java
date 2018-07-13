class Test{
	public static void main(String[] args){
		String x="fmn";
		x.toUpperCase();
		System.out.println(x);
		String y=x.replace('f','F');
		y=y+"wxy";
		System.out.println(y);
	//	System.out.println(new B().getValue());
	}
	static class A{
		protected int value;
		public A(int v){
			setValue(v);
			System.out.println("A(int v)value= "+value);
		}
		public void setValue(int value){
			this.value=value;
			System.out.println("A setValue value= "+value);
		}
		public int getValue(){
			try{
				value ++;
				System.out.println("A getValue value= "+value);
				return value;
			}finally{
				this.setValue(value);
				System.out.println("A getValue finally value= "+value);
				System.out.println(value);
			}
		}
	}
	static class B extends A{
		public B(){
			super(5);
			System.out.println("B()value= "+value);
			setValue(getValue()-3);
		}
		public void setValue(int value){
			System.out.println("B setValue value= "+value);
			super.setValue(2*value);
		}
	}
}