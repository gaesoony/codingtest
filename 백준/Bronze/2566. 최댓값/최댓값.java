import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
    			Scanner sc = new Scanner(System.in);
		   
		    	int[][] arr=new int[9][9];
		    	
		    	int num=0;
		    	int w=0;
		    	int h=0;
		    	
		    	for(int i =0; i<9;i++) {
		    		for(int j=0; j<9; j++) {
		    			arr[i][j]=sc.nextInt();
		    			
		    			if(num<arr[i][j]) {
		    				num=arr[i][j];
		    				w=i;
		    				h=j;
		    				
		    			}
		    			
		    			
		    		}
		    		
		    	}	
		    	
		    	sc.close();

		    	System.out.println(num);
		    	System.out.println((w+1)+" "+(h+1));
    }
}