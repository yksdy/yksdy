/*
20170628
*/
import java.util.ArrayList;
public calss A06_ArrayList
//public class Solution {
       public int minNumberInRotateArray(int [] array) {
    	if(array.length==0){
            return 0;
        }
        for(int i=0;i<array.length-1;i++){
            if(array[i]>array[i+1]){
                return array[i+1];
            }
        }
        return 0;
    }
}