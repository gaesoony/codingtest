import java.util.Arrays;
class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int[2];
        int[] sort= new int[array.length+1];
        
        
        for(int i=0; i<array.length;i++){
            for(int j=1;j<array.length;j++){
                if(array[i]<array[j]){
                    sort[i]=array[j];
                    answer[0]=sort[i];
                }
            }
           
        }
         
        
        for (int i = 0; i<=array.length-1; i++ ) {
            if (array[i] == answer[0]) {
                answer[1]=i;
            }
        }
        
       
       
            
        
        
        return answer;
    }
}