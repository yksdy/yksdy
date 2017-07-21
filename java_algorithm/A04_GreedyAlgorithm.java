public class A04_GreedyAlgorithm {
// n=3 w{30,40,50} v{30,20,10} c=50
	public static void main(String[] args){
		int n=3;
		int c=50;
		float[] w = {40,30,50};
		float[] v = {30,20,10};
		float[] wv = new float[w.length];
		float x=0;
		int max=0;
		System.out.println("w	 v	wv");
		for(int i=0;i<w.length;i++){
			wv[i] = w[i]/v[i];
			System.out.println(w[i]+"	 "+v[i]+"	"+	wv[i]);		
		}
		for(int i=0;i<wv.length;i++){
			for(int j=0;j<wv.length-i-1;j++){
				if(wv[j]<wv[j+1]){
					x=wv[j];
					wv[j]=wv[j+1];
					wv[j+1]=x;
					
					x=w[j];
					w[j]=w[j+1];
					w[j+1]=x;
					
					x=v[j];
					v[j]=v[j+1];
					v[j+1]=x;
				}
			}
		}
		System.out.println("\nw	 v	wv");
		for(int i=0;i<w.length;i++){
			wv[i] = w[i]/v[i];
			System.out.println(w[i]+"	 "+v[i]+"	"+	wv[i]);		
		}

		int q=0;
		int p=0;
		while(p<c){		
			max+=w[q];
			p+=v[q];
			q++;
		}
		
		System.out.println("\nmax = "+max +" p= "+p+" q= "+q);
		q--;
		max+=w[q]*(c-p+v[q])/v[q];
		System.out.println("\nmax = "+max );
	}
}
