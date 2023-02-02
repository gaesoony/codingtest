import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int num=sc.nextInt();

		int[] aNum=new int[num];
		for(int i=0; i<aNum.length;i++) {
			aNum[i]=sc.nextInt();
		}
		long sum=0;
		long max=0;
		for(int i=0; i<aNum.length;i++) {
			if(aNum[i]>max)max=aNum[i];
			sum+=aNum[i];
		}
		
		
		
		System.out.println(sum*100.0/max/num);

	}

}
