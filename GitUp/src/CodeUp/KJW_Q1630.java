package CodeUp;

import java.util.Scanner;

public class KJW_Q1630 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0; i<n; i++) {
			String a=sc.next();
			System.out.println(a);
			if(i!=n-1) System.out.println("AMOLED");
		}
	}
}

/*
20220427
문제 이해도 : 5 (1~5사이 숫자)
문제 해결 : O
코딩 시간 : 2분
*/