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
���� ���ص� : 5 (1~5���� ����)
���� �ذ� : O
�ڵ� �ð� : 3��
*/