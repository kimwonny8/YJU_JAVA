package CodeUp;

import java.util.Arrays;
import java.util.Scanner;

public class KJW_Q2476 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int [] sum = new int[n];
		for(int i=0; i<n; i++) {
			int a=sc.nextInt(), b=sc.nextInt(), c=sc.nextInt();
			
			if(a==b && b==c) sum[i]=10000+a*1000;
			else if(a==b || c==b) sum[i]=1000+b*100;
			else if(a==c)  sum[i]=1000+a*100;
			else {
				if(a>=b && a>=c) sum[i]=a*100;
				else if(b>=c && b>=a) sum[i]=b*100;
				else sum[i]=c*100;
			}
		}	
		Arrays.sort(sum);
		System.out.println(sum[sum.length-1]);
	}

}
/*
20220510
문제 이해도 : 5(1~5사이 숫자)
문제 해결 : O
코딩 시간 : 5분
*/
