package Mission3;

import java.util.Scanner;

public class KJW_Q1083 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1; i<=n; i++) {
			if(i%3==0) System.out.print("X ");
			else System.out.print(i+" ");	
		}
	}
}

/*
20220427
���� ���ص� : 5 (1~5���� ����)
���� �ذ� : O
�ڵ� �ð� : 3��
*/