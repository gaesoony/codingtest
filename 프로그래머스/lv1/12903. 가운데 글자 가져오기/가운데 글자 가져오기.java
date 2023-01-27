class Solution {
    public String solution(String s) {
        String answer = "";
        int change = s.length()/2;
        
        if(s.length()%2==1){
             answer=s.substring(change,change+1); 
        }else{
            answer=s.substring(change-1,change+1);
        }
       
        return answer;
    }
}