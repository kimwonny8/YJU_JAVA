package CodeUp;

import java.util.Scanner;

public class KJW_Q1269 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt(), b=sc.nextInt(), c=sc.nextInt(), n=sc.nextInt();
		
		for(int i=1; i<n; i++) {
			a*=b;
			a+=c;
		}
		System.out.println(a);
	}
}

/*
20220429
문제 이해도 : 5 (1~5사이 숫자)
문제 해결 : O
코딩 시간 : 5분
*/