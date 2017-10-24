public class A40_FindNumsAppearOnce {
    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        int len = array.length;
		num1[0] = array[0];
		num2[0] = array[1];
		int j=2;
		for(int i = 2; i<len; ){
			for(int x:array){
				System.out.print(x+" ");
			}
			System.out.println();
			System.out.println(num1[0]+" "+num2[0]+ " i= "+i+" j= "+j );
			if(num1[0]==num2[0]){
				num1[0] = array[i];
				num2[0] = array[i+1];
				array[i] = -1;
				array[i+1] = -1;
				i+=2;
			}else{
				if(array[i]==num1[0]){
					array[i] = -1;
					++i;
					if(j<i){
						num1[0]=array[j];
						j++;
						for(;j<=i;j++){
							if(array[j]!=-1) break; 
						}
					}
					else{
						num1[0]=array[i];
					}
				}
				else if(array[i]==num2[0]){
					array[i] = -1;
					++i;
					if(j<i){
						num2[0]=array[j];
						j++;
						for(;j<=i;j++){
							if(array[j]!=-1) break; 
						}
					}
					else{
						num2[0]=array[i];
					}
					
				}
				else{
					for(int x=j;x<i;x++){
						if(array[i]==array[x]){
							array[i] = -1;
							array[x] = -1;
							break;
						}
					}
					for(;j<=i;j++){
						if(array[j]!=-1) break; 
					}
					++i;
				}
			}
		}
    }
	public static void main(String[] args){
		int[] num1 ={0};
		int[] num2 ={0};
	int[] array ={2,4,3,6,3,2,5,5};
		//{1,1,3,3,2,2,5,6};
		//[2,4,3,6,3,2,5,5]
		A40_FindNumsAppearOnce fn = new A40_FindNumsAppearOnce();
		fn.FindNumsAppearOnce(array,num1,num2);
		System.out.println(num1[0]+ "   "+num2[0]);
	}
}