package CodeUp;

import java.util.Scanner;

public class KJW_Q1367 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int l=2*n;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=l-i; j++) {
				if(j<=n-i) System.out.print(" ");
				else  System.out.print("*");
			}
			System.out.println();
		}
	}
}

/*
20220429
문제 이해도 : 4 (1~5사이 숫자)
문제 해결 : O
코딩 시간 : 6분
*/