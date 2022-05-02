package CodeUp;

import java.util.Scanner;

public class KJW_Q1380 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int k=sc.nextInt();
		for(int i=1; i<=6; i++) {
			if(!(k-i<=0) && (k-i<=6))
			System.out.printf("%d %d\n",i,k-i);
		}
	}
}

/*
20220429
문제 이해도 : 5 (1~5사이 숫자)
문제 해결 : O
코딩 시간 : 3분
*/