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
���� ���ص� : 4 (1~5���� ����)
���� �ذ� : O
�ڵ� �ð� : 6��
*/