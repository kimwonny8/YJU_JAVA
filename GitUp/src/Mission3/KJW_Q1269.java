package Mission3;

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
���� ���ص� : 5 (1~5���� ����)
���� �ذ� : O
�ڵ� �ð� : 5��
*/