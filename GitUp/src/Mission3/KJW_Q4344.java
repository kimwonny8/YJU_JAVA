package Mission3;

import java.util.Scanner;

public class KJW_Q4344 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int c=sc.nextInt();		
		for(int i=0; i<c; i++) {
			int n=sc.nextInt();
			
			double sum=0, cnt=0, avg=0;
			double [] arr=new double[n];
			
			for(int j=0; j<n; j++) {
				arr[j]=sc.nextDouble();
				sum+=arr[j];
			}
			avg = sum/n;
			
			for(int j=0; j<n; j++) if(arr[j]>avg) cnt++;
			System.out.printf("%.3f",cnt/n*100);
			System.out.print("%\n");
		}
	}

}
/*
20220521
문제 이해도 : 4(1~5사이 숫자)
문제 해결 : O
코딩 시간 : 8분
*/