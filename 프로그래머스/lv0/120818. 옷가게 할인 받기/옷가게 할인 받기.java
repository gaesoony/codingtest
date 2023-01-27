class Solution {
    public int solution(int price) {
       
        
    int answer = 0;
    double sale =0;
        
    if(price>=500000){
        sale=price*0.2;
        answer=(int)Math.floor(price-sale);   
    }  
        
    if(price>=300000&&price<500000){
        sale=price*0.1;
        answer=(int)Math.floor(price-sale);   
    }
        
    if(price>=100000&&price<300000){
    sale=price*0.05;
    answer=(int)Math.floor(price-sale);   
    } 
        
    if(price<100000){
    
    answer=price;
    }    
        
        return answer;
    }
   
}