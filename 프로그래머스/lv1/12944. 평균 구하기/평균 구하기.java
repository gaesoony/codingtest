class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        double arrAdd=0;
        for(int i=0; i<arr.length;i++){
            arrAdd +=arr[i];
            
        }
        
        answer=arrAdd/(int)arr.length;
        
        return answer;
    }
}