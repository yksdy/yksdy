public class Examination {
  public int getMaxSnest(int[][] envelopes) {
    // ÄãµÄ´úÂë
	// mengzhaoyang 20171111
	int m = envelopes.length;
	if(m==0||m==1){
		return m;
	}
	for(int i=1;i<m;i++){
		for(int j=i;j>0;j--){
			int[] z={0,0};
			if(envelopes[j-1][0]>envelopes[j][0]){
				z=envelopes[j-1];
				envelopes[j-1]=envelopes[j];
				envelopes[j]=z;
			}
		}
	}
	int max=1;
	int temp=0;
	int[] num=new int[m];
	num[0]=1;
	for(int i =1;i<m;i++){
		num[i]=1; 
		for(int j=1;j<=i;j++){
			if(envelopes[i][0]>envelopes[i-j][0]&&envelopes[i][1]>envelopes[i-j][1]){
				temp=num[i-j]+num[i];
				if(temp>max){
					max=temp;
				}
			}
		}
		num[i]=max;
	}
	max=0;
	for(int i:num){
		if(max<i) max=i;
	}
    return max;
  }

  public static void main(String[] args) {
    Examination e = new Examination();
	int[][] testData14 = new int[][] { { 3, 4 }, { 6, 7 } , { 7, 8 }};
    System.out.println(e.getMaxSnest(testData14));
    int[][] testData1 = new int[][] { { 5, 4 }, { 6, 4 }, { 6, 7 }, { 2, 3 }, { 3, 4 }, { 4, 5 }, { 5, 6 } };
    System.out.println(e.getMaxSnest(testData1));
    int[][] testData2 = { { 5, 4 }, { 6, 4 }, { 6, 7 }, { 2, 3 }, { 1, 5 } };
    System.out.println(e.getMaxSnest(testData2));
    int[][] testData3 = new int[][] { { 1, 3 }, { 2, 2 }, { 10, 30 }, { 20, 20 }, { 21, 21 }, { 22, 22 } };
    System.out.println(e.getMaxSnest(testData3));
  }
}