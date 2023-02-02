import java.util.*;

import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
    
        //문자열 받기
        String sNum=Integer.toString(n);
        
        int[] arrayNum=new int[n];
        for (int i = 0; i < sNum.length(); i++){
            arrayNum[i] = sNum.charAt(i) - '0';
           
        }
        
        for(int i=0; i<arrayNum.length;i++){
            answer+=arrayNum[i];
        }
            
    
       
        return answer;
    }
}