package CodeUp;

import java.util.Scanner;

public class KJW_Q1089 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt(), d=sc.nextInt(), n=sc.nextInt();
		int sum=a;
		for(int i=0; i<n-1; i++) {
			sum+=d;
		}
		System.out.println(sum);
	}
}
/*
20220427
문제 이해도 : 5 (1~5사이 숫자)
문제 해결 : O
코딩 시간 : 5분
*/